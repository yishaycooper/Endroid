package com.yishay.endroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerSupportFragment
import com.yishay.endroid.model.AndroidStudio
import com.yishay.endroid.model.Architecture
import com.yishay.endroid.model.Guide
import com.yishay.endroid.model.Tutorial


class OrientedFragment : Fragment(), YouTubePlayer.OnInitializedListener {

    private val args: OrientedFragmentArgs by navArgs()

    private var uri = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_oriented, container, false)


        val textView: TextView = rootView.findViewById(R.id.text_tutor) as TextView

        textView.text = when (args.typeMessage) {
            "tutorial" -> Tutorial.Supplier.examples[args.message].tutor
            "guide" -> Guide.Supplier.examples[args.message].tutor
            "androidStudio" -> AndroidStudio.Supplier.examples[args.message].tutor
            "architecture" -> Architecture.Supplier.examples[args.message].tutor
            else -> Tutorial.Supplier.examples[args.message].tutor
        }

        uri = when (args.typeMessage) {
            "tutorial" -> Tutorial.Supplier.examples[args.message].uri
            "guide" -> Guide.Supplier.examples[args.message].uri
            "androidStudio" -> AndroidStudio.Supplier.examples[args.message].uri
            "architecture" -> Architecture.Supplier.examples[args.message].uri
            else -> Tutorial.Supplier.examples[args.message].uri
        }


        val youTubePlayerFragment =
            // use childFragmentManager and not supportFragmentManager
            childFragmentManager.findFragmentById(R.id.yt_pf) as YouTubePlayerSupportFragment?
        youTubePlayerFragment?.initialize("YOUR_YOUTUBE_KEY", this)

        return rootView
    }

    override fun onInitializationSuccess(
        provider: YouTubePlayer.Provider?,
        player: YouTubePlayer?,
        wasRestored: Boolean
    ) {

        // this flag will prevent video restart on screen rotation.
            player?.addFullscreenControlFlag(YouTubePlayer.FULLSCREEN_FLAG_CUSTOM_LAYOUT)
            if (!wasRestored) {
                player?.loadVideo(uri)

        } else {
            player?.play()
        }
    }

    override fun onInitializationFailure(
        p0: YouTubePlayer.Provider?,
        p1: YouTubeInitializationResult?
    ) {

    }

}

