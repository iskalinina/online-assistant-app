package com.irina.onlineassistant

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EventsAdapter(private val eventsList:List<Events>): RecyclerView.Adapter<EventsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventsViewHolder {
        val eventsListItemView = LayoutInflater.from(parent.context).inflate(R.layout.events_card_list_item, parent, false)

        return EventsViewHolder(eventsListItemView)
    }

    override fun onBindViewHolder(holder: EventsViewHolder, position: Int) {
        val events = eventsList[position]

        holder.bind(events)
    }

    override fun getItemCount(): Int {
        return eventsList.size
    }
}