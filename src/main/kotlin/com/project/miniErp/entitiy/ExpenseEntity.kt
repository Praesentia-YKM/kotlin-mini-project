package com.project.miniErp.entitiy

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.LocalDate

@Entity
@Table(name = "EXPEND")
data class ExpenseEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val expNo: Long = 0,

    val expDate: LocalDate,

    val totalAmt: BigDecimal,

    val description: String? = null,

    @OneToMany(mappedBy = "expense", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val expenseClients: List<ExpenseClientEntity> = emptyList(),

    @OneToMany(mappedBy = "expense", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val expenseSubjects: List<ExpenseSubjectEntity> = emptyList(),

    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now()
)
