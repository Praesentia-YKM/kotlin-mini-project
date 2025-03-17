package com.project.miniErp.entitiy

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "EXPEND_SUBJECT")
data class ExpenseSubjectEntity(
    @EmbeddedId
    val id: ExpenseSubjectId,

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("expNo")
    val expense: ExpenseEntity,

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("accSbj")
    val accountSubject: AccountSubjectEntity,

    val accSbjNm: String,
    val amt: BigDecimal
)
