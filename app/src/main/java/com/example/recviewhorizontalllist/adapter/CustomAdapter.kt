package com.example.recviewhorizontalllist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recviewhorizontalllist.R
import com.example.recviewhorizontalllist.modul.Member
import kotlin.system.measureTimeMillis

class CustomAdapter(val member: List<Member>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_layout,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = member[position]

        if (holder is CustomViewHolder){
            holder.firs_name.text = member.name
            holder.last_name.text = member.lastName
        }
    }

    override fun getItemCount(): Int {
         return member.size
    }
    class CustomViewHolder(view: View): RecyclerView.ViewHolder(view){
     val firs_name = view.findViewById<TextView>(R.id.first_name)
     val last_name = view.findViewById<TextView>(R.id.last_name)
    }
}