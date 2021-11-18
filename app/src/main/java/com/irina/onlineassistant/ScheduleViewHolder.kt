package com.irina.onlineassistant

import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class ScheduleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(schedule: Schedule) {
        val timeStartTextView: TextView =itemView.findViewById(R.id.time_start_text_view)
        val timeEndTextView: TextView =itemView.findViewById(R.id.time_end_text_view)
        val disciplineTextView: TextView =itemView.findViewById(R.id.discipline_name_text_view)
        val disciplineTypeTextView: TextView =itemView.findViewById(R.id.discipline_type_text_view)
        val groupNameTextView: TextView =itemView.findViewById(R.id.group_name_text_view)
        val classroomTextView: TextView =itemView.findViewById(R.id.classroom_text_view)

        timeStartTextView.text=schedule.timeStart
        timeEndTextView.text=schedule.timeEnd
        disciplineTextView.text=schedule.discipline
        disciplineTypeTextView.text=schedule. disciplineType
        groupNameTextView.text=schedule.groupName
        classroomTextView.text=schedule.classroom

        val card: CardView = itemView.findViewById(R.id.discipline_container)

        when(disciplineTypeTextView.text) {
            "Lecture" -> {
                card.setCardBackgroundColor(Color.parseColor("#E8DEF8"))
            }
            "Practice" -> {
                card.setBackgroundColor(Color.parseColor("#FFD8E4"))
            }
            "Laboratory" -> {
                card.setBackgroundColor(Color.parseColor("#CCE7E9"))
            }
        }
    }
}