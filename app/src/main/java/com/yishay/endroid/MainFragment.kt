package com.yishay.endroid


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        examples.setOnClickListener {

            view.findNavController().navigate(R.id.action_mainFragment_to_examplesFragment)
        }

        tutorials.setOnClickListener {

            view.findNavController().navigate(R.id.action_mainFragment_to_tutorialsFragment)
        }

        guides.setOnClickListener {

            view.findNavController().navigate(R.id.action_mainFragment_to_guideFragment)
        }

        android_studio.setOnClickListener {

            view.findNavController().navigate(R.id.action_mainFragment_to_studioFragment)
        }

        architecture.setOnClickListener {

            view.findNavController().navigate(R.id.action_mainFragment_to_architectureFragment)
        }
    }

}
