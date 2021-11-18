package com.irina.onlineassistant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ScheduleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_schedule, container, false)

        val scheduleList:List<Schedule> = listOf(
            Schedule("08.00", "09.30", "English Literature",
                "Lecture","2019-ENGLIT gr.", "1234 aud."),
            Schedule("09.40", "11.10", "English Literature",
                "Practice","2019-ENGLIT gr.","2244 aud."),
            Schedule("11.30", "13.00", "Theories of text",
                "Lecture","2020-WRDLIT gr.","2244 aud."),
            Schedule("13.10", "14.40", "Theories of text",
                "Laboratory","2020-WRDLIT gr.","1234 aud."),
            Schedule("14.50", "16.20", "Bibliography",
                "Lecture","2019-LITCAP gr.","3456 aud."),
            Schedule("16.30", "19.00", "Bibliography",
                "Lecture","2019-LITCAP gr.","3456 aud.")
        )

        val scheduleRecyclerView: RecyclerView = view.findViewById(R.id.schedule_recycler_view)

        scheduleRecyclerView.layoutManager=
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        scheduleRecyclerView.adapter = ScheduleAdapter(scheduleList)

        return view
    }

}