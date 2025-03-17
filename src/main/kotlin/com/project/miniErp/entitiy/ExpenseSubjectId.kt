package com.project.miniErp.entitiy

import jakarta.persistence.Embeddable

@Embeddable
data class ExpenseSubjectId(
    val expNo: Long,
    val accSbj: Long
) : java.io.Serializable
