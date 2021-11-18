package com.irina.onlineassistant

import android.graphics.Color

data class Schedule (
    val timeStart: String,
    val timeEnd: String,
    val discipline: String,
    val disciplineType: String,
    val groupName: String,
    val classroom: String
)