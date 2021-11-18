package com.irina.onlineassistant

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ContactsFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_contacts, container, false)

        val eventsList:List<Events> = listOf(
            Events(R.drawable.eventsconf, "The regional conference will shortly be convened","https://www.osu.ru/news/27356"),
            Events(R.drawable.laboratory, "Addition of new certified laboratories", "https://www.osu.ru/doc/2033"),
            Events(R.drawable.university, "Employment of graduates of educational institutions", "https://www.osu.ru/news/27734")
        )

        val eventsRecyclerView: RecyclerView = view.findViewById(R.id.events_recycler_view)

        eventsRecyclerView.layoutManager=
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        eventsRecyclerView.adapter = EventsAdapter(eventsList)

        return view


    }


}