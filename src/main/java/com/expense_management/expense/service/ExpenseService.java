package com.expense_management.expense.service;

import com.expense_management.expense.entity.Expense;
import com.expense_management.expense.dto.ExpenseDto;


import java.util.List;
import java.util.Optional;

public interface ExpenseService {
    Optional<ExpenseDto> getExpenseById(int id);
    ExpenseDto saveExpense(Expense expense);
    boolean deleteExpense(int id);
    ExpenseDto updateExpense(int id, Expense expense);
    List<ExpenseDto> getAllExpenses();
}
