package com.yishay.endroid

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yishay.endroid.LessonRepository.lessonList

class LessonViewModel : ViewModel() {

    private val _currentLesson = MutableLiveData<Int>()
    val currentLesson: LiveData<Int>
        //  getter immutable LiveData
        get() = LessonRepository.getLesson()

    init {
        _currentLesson.value = lessonList[0]
    }

    fun addLesson(element: Int) {
        LessonRepository.addLesson(element)
    }

    fun getLesson(): LiveData<Int> {
        return LessonRepository.getLesson()
    }

}