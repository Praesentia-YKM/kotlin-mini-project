package com.project.miniErp.repository

import com.project.miniErp.entitiy.ExpenseEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ExpenseRepository : JpaRepository<ExpenseEntity, Long>