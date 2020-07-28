package com.yishay.endroid.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.yishay.endroid.GuideFragmentDirections
import com.yishay.endroid.R
import com.yishay.endroid.model.Tutorials
import kotlinx.android.synthetic.main.tutorial_item.view.*


class GuidesAdapter(val context: Context, private val tutorials: List<Tutorials>) :
    RecyclerView.Adapter<GuidesAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.tutorial_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tutorials.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = tutorials[position]
        holder.setData(hobby, position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var currentTutorial: Tutorials? = null
        var currentPosition: Int = 0


        init {
            itemView.setOnClickListener {
                currentTutorial?.let {
                    itemView.setOnClickListener {

                        val action =
                            GuideFragmentDirections.actionGuideFragmentToOrientedFragment(
                                currentPosition, "guide"
                            )
                        itemView.findNavController().navigate(action)
                    }
                }
            }

        }

        fun setData(tutorials: Tutorials?, pos: Int) {
            tutorials?.let {
                itemView.txvTitle.text = tutorials.title
            }

            this.currentTutorial = tutorials
            this.currentPosition = pos
        }
    }
}


