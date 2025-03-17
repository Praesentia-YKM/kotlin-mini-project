package com.project.miniErp.entitiy

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "EXPEND_CLIENT")
data class ExpenseClientEntity(
    @EmbeddedId
    val id: ExpenseClientId,

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("expNo")
    val expense: ExpenseEntity,

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("cltCd")
    val client: ClientEntity,

    val amt: BigDecimal
)