package com.hwa.restonplaceholder.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hwa.restonplaceholder.R
import com.hwa.restonplaceholder.data.HttpCatModel

class DataAdapter(private var dataList: List<HttpCatModel>, private val context: Context) :
    RecyclerView.Adapter<DataAdapter.ViewHolder>() {


    class ViewHolder(itemLayoutView: View) : RecyclerView.ViewHolder(itemLayoutView) {
        lateinit var titleTextView:TextView
        init {
            titleTextView=itemLayoutView.findViewById(R.id._title)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_home_card,parent,false))
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataModel = dataList[position]
        holder.titleTextView.text = dataModel.description
    }

}