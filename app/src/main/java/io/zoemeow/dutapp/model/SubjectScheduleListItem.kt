package io.zoemeow.dutapp.model

data class SubjectScheduleListItem(
    val date: Long? = null,
    val totalcredit: Int? = null,
    val schedulelist: List<SubjectScheduleItem>? = null
)