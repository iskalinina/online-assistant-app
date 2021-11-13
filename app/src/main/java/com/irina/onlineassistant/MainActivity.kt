package com.irina.onlineassistant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gotoButton: Button = findViewById(R.id.primaryButton)
        val intent = Intent(this, ProfileActivity::class.java)

        gotoButton.setOnClickListener {
            startActivity(intent)
        }

    }
}