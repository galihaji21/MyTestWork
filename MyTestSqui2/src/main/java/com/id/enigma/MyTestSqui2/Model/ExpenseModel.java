package com.id.enigma.MyTestSqui2.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="pengeluaran")
public class ExpenseModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pengeluaran")
	private Long expenseId;
	
	@Column(name="tgl_pengeluaran")
	private Date dateExpense;
	
	@Column(name="jml_pengeluaran")
	private Long totalExpense;
	
	@Column(name="ket_pengeluaran")
	private String information_expense;
	
	@Column(name="status_id")
	private Long statusId;

	public Long getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(Long expenseId) {
		this.expenseId = expenseId;
	}

	public Date getDateExpense() {
		return dateExpense;
	}

	public void setDateExpense(Date dateExpense) {
		this.dateExpense = dateExpense;
	}

	public Long getTotalExpense() {
		return totalExpense;
	}

	public void setTotalExpense(Long totalExpense) {
		this.totalExpense = totalExpense;
	}

	public String getInformation_expense() {
		return information_expense;
	}

	public void setInformation_expense(String information_expense) {
		this.information_expense = information_expense;
	}

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}
	
	
	
	

}
