package com.rudimentum.HabitTracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rudimentum.HabitTracker.adapter.HabitsListAdapter
import kotlinx.android.synthetic.main.fragment_habits.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.habitHolder, HabitsFragment.newInstance())
            .commit()
    }
}