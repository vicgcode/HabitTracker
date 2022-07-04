package com.rudimentum.HabitTracker.model

import java.time.Instant

data class Habit(
    val id: Int,
    val title: String,
    val interval: Int,
    val periodicity: Periodicity,
    val hits: List<Instant>
)
