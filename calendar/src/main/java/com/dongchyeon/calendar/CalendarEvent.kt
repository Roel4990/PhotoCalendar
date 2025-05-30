package com.dongchyeon.calendar

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Shape
import kotlinx.datetime.LocalDate

@Immutable
data class CalendarEvent(
    val date: LocalDate,
    val imgUrl: String,
    val imgShape: Shape
)