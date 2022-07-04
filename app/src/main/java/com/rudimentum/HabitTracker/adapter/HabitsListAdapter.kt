package com.rudimentum.HabitTracker.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rudimentum.HabitTracker.R
import com.rudimentum.HabitTracker.model.Habit

class HabitsListAdapter(private val habits: List<String>) : RecyclerView
.Adapter<HabitsListAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val habitTitle: TextView = itemView.findViewById(R.id.habitTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.habits_list_recyclerview_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.habitTitle.text = habits[position]
    }

    override fun getItemCount() = habits.size
}