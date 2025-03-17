package com.project.miniErp.dto

import java.math.BigDecimal

data class ExpenseClientDto(
    val clientId: Long,
    val clientName: String,
    val amount: BigDecimal
)