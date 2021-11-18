package com.irina.onlineassistant


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

// константа для ключа сохранения состояния
private const val LAST_SELECTED_ITEM = "item"

class ProfileActivity : AppCompatActivity() {

    //  ранняя инициализация нижней навигации
    private lateinit var bottomMenu: BottomNavigationView
    private lateinit var topMenu: MaterialToolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        bottomMenu = findViewById(R.id.bottom_navigation)
        topMenu = findViewById(R.id.top_navigation)
        topMenu.setBackgroundColor(Color.parseColor("#E8DEF8"))

        // настроить клики по элементам нижней навигации
        bottomMenu.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.schedule -> {
                    val scheduleFragment = ScheduleFragment()
                    replaceFragment(scheduleFragment)
                    topMenu.title = "Schedule"
                }
                R.id.contacts -> {
                    val contactsFragment = ContactsFragment()
                    replaceFragment(contactsFragment)
                    topMenu.title = "Events"

                }
                R.id.settings -> {
                    val settingsFragment = SettingsFragment()
                    replaceFragment(settingsFragment)
                    topMenu.title = "Settings"
                }
                R.id.profile -> {
                    val profileFragment = ProfileFragment()
                    replaceFragment(profileFragment)
                    topMenu.title = "Your Profile"
                }
            }

            true
        }
        // восстановление состояния нижней навигации
        // если не сохранено, то по дефолту выбирается R.id.profile
        bottomMenu.selectedItemId= savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.profile
    }
    // функция замены фрагментов с помощью supportFragmentManager
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
//сохраним состояние последнего нажатого элемента нижней навигации
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM, bottomMenu.selectedItemId)
        super.onSaveInstanceState(outState)
    }
}