package com.project.miniErp.entitiy

import jakarta.persistence.*

@Entity
@Table(name = "CLIENT")
data class ClientEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val cltCd: Long = 0,
    val name: String,
    val contact: String?,
    val email: String?,
    val address: String?
)
