package com.project.miniErp.entitiy

import jakarta.persistence.Embeddable

@Embeddable
data class ExpenseClientId(
    val expNo: Long,
    val cltCd: Long
) : java.io.Serializable