package com.irina.onlineassistant

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ScheduleAdapter(private val scheduleList:List<Schedule>): RecyclerView.Adapter<ScheduleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder {
        val scheduleListItemView = LayoutInflater.from(parent.context).inflate(R.layout.classes_list_item, parent, false)

        return ScheduleViewHolder(scheduleListItemView)
    }

    override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
        val schedule = scheduleList[position]

        holder.bind(schedule)
    }

    override fun getItemCount(): Int {
        return scheduleList.size
    }
}