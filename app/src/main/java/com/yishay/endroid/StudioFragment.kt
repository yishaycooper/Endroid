package com.yishay.endroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yishay.endroid.adapters.StudioAdapter
import com.yishay.endroid.model.Supplier


class StudioFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_studio, container, false)

        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        val recyclerView = rootView.findViewById(R.id.studioRecyclerView) as RecyclerView
        recyclerView.layoutManager = layoutManager

        val adapter = StudioAdapter(requireContext(), Supplier.studio)
        recyclerView.adapter = adapter

        return rootView
    }

}
