package com.irina.onlineassistant

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.google.android.material.switchmaterial.SwitchMaterial


class SettingsFragment : Fragment() {

    private lateinit var shareButton: ImageButton
    private lateinit var darkmodeButton: SwitchMaterial

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_settings, container, false)

        shareButton = view.findViewById(R.id.share_button)

        val intentSend = Intent(Intent.ACTION_SEND)
        intentSend.type = "text/plain"
        intentSend.putExtra(Intent.EXTRA_TEXT, "Скачай приложение по ссылке google.com")

        val chooser = Intent.createChooser(intentSend, "Share:")
        shareButton.setOnClickListener {
            activity?.startActivity(chooser)
        }

        darkmodeButton = view.findViewById(R.id.dark_mode_switch)
        darkmodeButton.setOnCheckedChangeListener { buttonView,  isChecked ->
            if (isChecked)
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            else
               AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
        return view
    }

}

