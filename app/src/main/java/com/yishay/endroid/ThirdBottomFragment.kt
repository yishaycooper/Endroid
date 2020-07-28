package com.yishay.endroid


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerSupportFragment
import com.yishay.endroid.model.Examples


class ThirdBottomFragment : Fragment(), YouTubePlayer.OnInitializedListener {

    val lessonViewModel: LessonViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_third_bottom, container, false)


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

        if (!wasRestored) {
            val LessonObserver = Observer<Int> { CurrentLesson ->

                val example = factoryExamples()
                val youtubeVedio = example.examples[CurrentLesson]

                player?.cueVideo(youtubeVedio.uri)
            }

            lessonViewModel.currentLesson.observe(viewLifecycleOwner, LessonObserver)

        } else {
            player?.play()
        }
    }

    override fun onInitializationFailure(
        p0: YouTubePlayer.Provider?,
        p1: YouTubeInitializationResult?
    ) {

    }

    private fun factoryExamples(): Examples.Supplier {
        return Examples.Supplier
    }

}
