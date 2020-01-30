package com.id.enigma.MyTestSqui2.Service;
import java.util.List;
import org.springframework.data.domain.Page;
import com.id.enigma.MyTestSqui2.Model.ExpenseModel;
public interface ExpenseService {
	List<ExpenseModel> getAllExpense();
	ExpenseModel createExpense(ExpenseModel income);
	ExpenseModel deleteExpense(Long id);
	ExpenseModel findById(Long id);
	Page<ExpenseModel> findAll(Integer page,Integer pageSize);
	ExpenseModel updateExpense(ExpenseModel income);
}
