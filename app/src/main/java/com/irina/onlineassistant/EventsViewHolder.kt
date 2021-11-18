package com.irina.onlineassistant


import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

private lateinit var browseButton: Button

class EventsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(events: Events) {
        val imageView: ImageView = itemView.findViewById(R.id.banner_image_view)
        val descriptionTextView: TextView =itemView.findViewById(R.id.description_text_view)

        imageView.setImageDrawable(itemView.context.getDrawable(events.imageRes))
        descriptionTextView.text = events.description

        browseButton = itemView.findViewById(R.id.browse_button)

        val cardLink:String = events.cardLink
        val link = Uri.parse(cardLink)
        val intentBrowse = Intent(Intent.ACTION_VIEW, link)

        browseButton.setOnClickListener {
            itemView.context.startActivity(intentBrowse)
        }

    }

}