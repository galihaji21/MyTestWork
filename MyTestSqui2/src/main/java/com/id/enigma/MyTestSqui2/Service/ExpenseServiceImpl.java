package com.id.enigma.MyTestSqui2.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.id.enigma.MyTestSqui2.Model.ExpenseModel;
import com.id.enigma.MyTestSqui2.Repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	ExpenseRepository expenseRepository;

	@Override
	public List<ExpenseModel> getAllExpense() {
		// TODO Auto-generated method stub
		List<ExpenseModel> expense = expenseRepository.findAll();
		return expense;
	}

	@Override
	public ExpenseModel createExpense(ExpenseModel expense) {
		ExpenseModel ex = new ExpenseModel();
		ex.setExpenseId(expense.getExpenseId());
		ex.setDateExpense(expense.getDateExpense());
		ex.setInformation_expense(expense.getInformation_expense());
		ex.setTotalExpense(expense.getTotalExpense());
		ex.setStatusId(1l);
		return expenseRepository.save(ex);
	}

	@Override
	public ExpenseModel deleteExpense(Long id) {
		// TODO Auto-generated method stub
		ExpenseModel ex = findById(id);
		ex.setStatusId(2l);
		return expenseRepository.save(ex);
	}

	@Override
	public ExpenseModel findById(Long id) {
		// TODO Auto-generated method stub
		Optional<ExpenseModel> optional = expenseRepository.findById(id);
		ExpenseModel expense = new ExpenseModel();
			if (optional.isPresent()) {
				expense=optional.get();
			}
		return expense;
	}

	@Override
	public Page<ExpenseModel> findAll(Integer page, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExpenseModel updateExpense(ExpenseModel expense) {
		// TODO Auto-generated method stub
		ExpenseModel ex = new ExpenseModel();
		ex.setExpenseId(expense.getExpenseId());
		ex.setDateExpense(expense.getDateExpense());
		ex.setInformation_expense(expense.getInformation_expense());
		ex.setTotalExpense(expense.getTotalExpense());
		ex.setStatusId(expense.getStatusId());
		return expenseRepository.save(ex);
	}

	



	

}
