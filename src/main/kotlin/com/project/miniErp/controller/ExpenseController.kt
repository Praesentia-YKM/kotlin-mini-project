package com.project.miniErp.controller

import com.project.miniErp.dto.ExpenseResponse
import com.project.miniErp.service.ExpenseService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/finance/expenses")
class ExpenseController(
    private val expenseService: ExpenseService
) {
    @GetMapping("/{expenseId}")
    fun getExpense(@PathVariable expenseId: Long): ResponseEntity<ExpenseResponse> {
        val expense = expenseService.getExpenseById(expenseId) ?: return ResponseEntity.notFound().build()
        return ResponseEntity.ok(expense)
    }
}