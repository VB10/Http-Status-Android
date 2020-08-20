package com.hwa.restonplaceholder.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hwa.restonplaceholder.R
import com.hwa.restonplaceholder.data.HttpCatModel

class DataAdapter(private var dataList: List<HttpCatModel>) :
    RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    class ViewHolder(itemLayoutView: View) : RecyclerView.ViewHolder(itemLayoutView) {
        var titleTextView: TextView = itemLayoutView.findViewById(R.id._title)
        var titleTextView2: TextView = itemLayoutView.findViewById(R.id._title2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_home_card, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataModel = dataList[position]
        holder.titleTextView.text = dataModel.imageUrl
        holder.titleTextView2.text = dataModel.description
    }
}