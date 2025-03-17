package com.project.miniErp.entitiy

import jakarta.persistence.*

@Entity
@Table(name = "ACCOUNT_SUBJECT")
data class AccountSubjectEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val sbjCd: Long = 0,
    val sbjNm: String,
    val description: String?
)