package com.yishay.endroid

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object LessonRepository {


    // use as a data base
    val lessonList = mutableListOf<Int>(0)
    private val lesson = MutableLiveData<Int>()

    init {
        lesson.value = lessonList[0]
    }

    fun addLesson(element: Int) {
        lessonList.set(0, element)
        lesson.value = lessonList[0]
    }

    fun getLesson() = lesson as LiveData<Int>

}