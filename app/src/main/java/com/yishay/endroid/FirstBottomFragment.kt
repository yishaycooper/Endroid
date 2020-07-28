package com.yishay.endroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.yishay.endroid.model.Examples


class FirstBottomFragment : Fragment() {

    private val lessonViewModel: LessonViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_first_bottom, container, false)


        val lessonObserver = Observer<Int> { currentLesson ->

            val example = factoryExamples()
            val xmlText = example.examples[currentLesson]

            val textView: TextView = view.findViewById(R.id.text_xml) as TextView
            textView.text = xmlText.xml
        }

        lessonViewModel.currentLesson.observe(viewLifecycleOwner, lessonObserver)

        return view
    }

    private fun factoryExamples(): Examples.Supplier {
        return Examples.Supplier
    }

}
