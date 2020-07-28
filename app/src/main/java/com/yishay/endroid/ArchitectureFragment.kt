package com.yishay.endroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yishay.endroid.adapters.ArchitectureAdaptere
import com.yishay.endroid.model.Supplier

class ArchitectureFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_architecture, container, false)

        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        val recyclerView = rootView.findViewById(R.id.architectureRecyclerView) as RecyclerView
        recyclerView.layoutManager = layoutManager

        val adapter = ArchitectureAdaptere(requireContext(), Supplier.architecture)
        recyclerView.adapter = adapter

        return rootView
    }

}
