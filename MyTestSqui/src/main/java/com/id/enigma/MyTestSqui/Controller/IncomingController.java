package com.id.enigma.MyTestSqui.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.id.enigma.MyTestSqui.Model.IncomingModel;
import com.id.enigma.MyTestSqui.Service.IncomeService;





@RestController
public class IncomingController {
	@Autowired
	IncomeService incomeService;
	
	@CrossOrigin(origins="http://localhost:8081")
	@GetMapping("/income")
	public ResponseEntity<List<IncomingModel>>getIncome(){
		List<IncomingModel> income = incomeService.getAllIncome();
		return new ResponseEntity<List<IncomingModel>>(income,HttpStatus.OK);
	}
	
	@CrossOrigin(origins="http://localhost:8081")
	@GetMapping("/income/id")
	public ResponseEntity<IncomingModel>getIncomeById(@RequestParam("id") Long id){
		try {
			return new ResponseEntity<>(incomeService.findById(id),HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}

	@CrossOrigin(origins="http://localhost:8081")
	@PostMapping("/income/add")
	public ResponseEntity<IncomingModel> addIncome(@RequestBody IncomingModel income){
		IncomingModel  newIncoming = incomeService.createIncome(income);
		return new ResponseEntity<>(newIncoming, HttpStatus.OK);
		
	}
	
	@CrossOrigin(origins="http://localhost:8081")
	@DeleteMapping("/income")
	public ResponseEntity<IncomingModel> deleteIncome(@RequestParam Long id) {
		try {
			return new ResponseEntity<>(incomeService.deleteIncome(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/incomes/page")
	public ResponseEntity<Page<IncomingModel>> findAllIncomePagination(@RequestParam("page") Integer page,
			@RequestParam("pageSize") Integer pageSize) {
		
		Page<IncomingModel> listIncome = incomeService.findAll(page, pageSize);
		try {
			return new ResponseEntity<>(listIncome, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
     
}
