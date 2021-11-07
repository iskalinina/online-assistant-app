package com.irina.onlineassistant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gotoButton: Button = findViewById(R.id.primaryButton)

        val intent = Intent(this, ProfileActivity::class.java)

        gotoButton.setOnClickListener {
            startActivity(intent)
        }

        NavigationBarView.OnItemSelectedListener {
            when(it.itemId) {
                R.id.page1 -> {
                    true
                }
                R.id.page2 -> {
                    true
                }
                R.id.page3  -> {
                    true
                }
                R.id.page4 -> {
                    val fourIntent = Intent(this, ProfileActivity::class.java)
                    startActivity(fourIntent)
                    true
                }
                else -> false
            }
        }
    }
}