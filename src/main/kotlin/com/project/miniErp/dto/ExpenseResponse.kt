package com.project.miniErp.dto

import java.math.BigDecimal
import java.time.LocalDate

data class ExpenseResponse(
    val expNo: Long,
    val expDate: LocalDate,
    val totalAmt: BigDecimal,
    val description: String?,
    val clients: List<ExpenseClientDto>,
    val accountSubjects: List<ExpenseSubjectDto>
)