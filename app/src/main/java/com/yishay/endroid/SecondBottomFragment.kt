package com.yishay.endroid

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.yishay.endroid.model.Examples

class SecondBottomFragment : Fragment() {

    val lessonViewModel: LessonViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second_bottom, container, false)


        val lessonObserver = Observer<Int> { CurrentLesson ->
            Log.d("Tag", "SecondBottomFragment " + lessonViewModel.currentLesson.value.toString())

            val example = factoryExamples()
            val xmlText = example.examples[CurrentLesson]

            val textView: TextView = view.findViewById(R.id.text_kotlin) as TextView
            textView.text = xmlText.kotlin
        }

        lessonViewModel.currentLesson.observe(viewLifecycleOwner, lessonObserver)

        return view
    }

    private fun factoryExamples(): Examples.Supplier {
        return Examples.Supplier
    }

}
