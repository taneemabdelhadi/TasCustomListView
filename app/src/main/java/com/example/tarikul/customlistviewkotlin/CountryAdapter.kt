package com.example.tarikul.customlistviewkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.country_list_item.view.*

class CountryAdapter(val items : ArrayList<String>, val flags : Array<Int>, val context: Context) : RecyclerView.Adapter<ViewHolder>(){
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.country_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.tvAnimalType?.text = items.get(position)
        holder?.imgviewFlag?.setImageResource( flags.get(position))
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val tvAnimalType = view.tv_country_show
    val imgviewFlag = view.imgv_flag
}