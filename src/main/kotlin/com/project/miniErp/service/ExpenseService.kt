package com.project.miniErp.service

import com.project.miniErp.dto.ExpenseClientDto
import com.project.miniErp.dto.ExpenseResponse
import com.project.miniErp.dto.ExpenseSubjectDto
import com.project.miniErp.repository.ExpenseRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ExpenseService(
    private val expenseRepository: ExpenseRepository
) {
    @Transactional(readOnly = true)
    fun getExpenseById(expenseId: Long): ExpenseResponse? {
        val expense = expenseRepository.findById(expenseId).orElse(null) ?: return null

        return ExpenseResponse(
            expNo = expense.expNo,
            expDate = expense.expDate,
            totalAmt = expense.totalAmt,
            description = expense.description,
            clients = expense.expenseClients.map {
                ExpenseClientDto(
                    clientId = it.client.cltCd,
                    clientName = it.client.name,
                    amount = it.amt
                )
            },
            accountSubjects = expense.expenseSubjects.map {
                ExpenseSubjectDto(
                    subjectId = it.accountSubject.sbjCd,
                    subjectName = it.accSbjNm,
                    amount = it.amt
                )
            }
        )
    }
}