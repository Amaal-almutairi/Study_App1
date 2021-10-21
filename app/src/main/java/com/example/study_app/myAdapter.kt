package com.example.study_app

import com.example.study_app.databinding.ItemRowBinding

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class myAdapter(private val activity: Activity, private val ListItems: ArrayList<ArrayList<String>>):
    RecyclerView.Adapter<myAdapter.ItemViewHolder>() {
    class ItemViewHolder(val binding: ItemRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ItemRowBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }
  // this function will show the title and information to recycler view and display it in screen
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.apply {

            // title index is 0 and information is 1
            textvTitle.text = ListItems[position][0]
            textVvinfo.text = ListItems[position][1]
            //  show the title and the information and display it in card view
            cardId.setOnClickListener { CustomAlertDialog(activity, ListItems[position][0], ListItems[position][2]) }
        }
    }

    override fun getItemCount() = ListItems.size
}
