package com.yishay.endroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.*
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.bottom_nav_layout.*


class BottomTabActivity : AppCompatActivity() {

    private val args: BottomTabActivityArgs by navArgs()

    private val lessonViewModel: LessonViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bottom_nav_layout)


        lessonViewModel.addLesson(args.message)

        lessonViewModel.getLesson().observe(this, Observer {
            Log.d("Tag", "onCreate " + lessonViewModel.currentLesson.value.toString())

        })

        val navController: NavController = findNavController(R.id.nav_host_fragment)
        bottom_nav_view?.setupWithNavController(navController)

    }

}