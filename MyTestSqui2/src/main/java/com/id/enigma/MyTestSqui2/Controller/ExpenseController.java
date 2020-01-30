package com.id.enigma.MyTestSqui2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.id.enigma.MyTestSqui2.Model.ExpenseModel;
import com.id.enigma.MyTestSqui2.Service.ExpenseService;

@RestController
public class ExpenseController {
	@Autowired
	ExpenseService expenseService;
	
	@CrossOrigin(origins="http://localhost:8081")
	@GetMapping("/expense")
	public ResponseEntity<List<ExpenseModel>>getexpense(){
		List<ExpenseModel> expense = expenseService.getAllExpense();
		return new ResponseEntity<List<ExpenseModel>>(expense,HttpStatus.OK);
	}
	
	@CrossOrigin(origins="http://localhost:8081")
	@GetMapping("/expense/id")
	public ResponseEntity<ExpenseModel>getExpenseById(@RequestParam("id") Long id){
		try {
			return new ResponseEntity<>(expenseService.findById(id),HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@CrossOrigin(origins="http://localhost:8081")
	@PostMapping("/expense/add")
	public ResponseEntity<ExpenseModel> addExpense(@RequestBody ExpenseModel expense){
		ExpenseModel  newExpense = expenseService.createExpense(expense);
		return new ResponseEntity<>(newExpense, HttpStatus.OK);
		
	}
	
	@CrossOrigin(origins="http://localhost:8081")
	@DeleteMapping("/expense")
	public ResponseEntity<ExpenseModel> deleteExpense(@RequestParam Long id) {
		try {
			return new ResponseEntity<>(expenseService.deleteExpense(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	

	@PutMapping("/expense")
	public ResponseEntity<ExpenseModel>updateIncome(@RequestBody ExpenseModel expense){
		ExpenseModel updateexpense = expenseService.updateExpense(expense);
   	return new ResponseEntity<>(updateexpense,HttpStatus.OK);
	}
     
}
