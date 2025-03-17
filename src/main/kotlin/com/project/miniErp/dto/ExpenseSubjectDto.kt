package com.project.miniErp.dto

import java.math.BigDecimal

data class ExpenseSubjectDto(
    val subjectId: Long,
    val subjectName: String,
    val amount: BigDecimal
)