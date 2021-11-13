package com.irina.onlineassistant


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_ITEM = "item"

class ProfileActivity : AppCompatActivity() {

    private lateinit var bottomMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        bottomMenu = findViewById(R.id.bottom_navigation)

        bottomMenu.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.schedule -> {
                    val scheduleFragment = ScheduleFragment()
                    replaceFragment(scheduleFragment)
                }
                R.id.contacts -> {
                    val contactsFragment = ContactsFragment()
                    replaceFragment(contactsFragment)
                }
                R.id.settings -> {
                    val settingsFragment = SettingsFragment()
                    replaceFragment(settingsFragment)
                }
                R.id.profile -> {
                    val profileFragment = ProfileFragment()
                    replaceFragment(profileFragment)
                }
            }

            true
        }

        bottomMenu.selectedItemId= savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.profile
    }
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM, bottomMenu.selectedItemId)
        super.onSaveInstanceState(outState)
    }
}