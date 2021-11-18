package com.irina.onlineassistant

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class ProfileFragment : Fragment() {

    private lateinit var logoutButton: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_profile, container, false)

        logoutButton = view.findViewById(R.id.logoutButton)

        val intent = Intent(context, MainActivity::class.java )

        logoutButton.setOnClickListener {
            startActivity(intent)
        }
        return view
    }
}

