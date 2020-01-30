package com.id.enigma.MyTestSqui.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pemasukan")
public class IncomingModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pemasukan")
	private Long inComingId;
	
	@Column(name="tgl_pemasukan")
	private Date dateIncome;
	
	@Column(name="jml_pemasukan")
	private Long totalIncome;
	
	@Column(name="ket_pemasukan")
	private String information;
	
	@Column(name="status_id")
	private Long statusId;

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public Long getInComingId() {
		return inComingId;
	}

	public void setInComingId(Long inComingId) {
		this.inComingId = inComingId;
	}

	public Date getDateIncome() {
		return dateIncome;
	}

	public void setDateIncome(Date dateIncome) {
		this.dateIncome = dateIncome;
	}

	public Long getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(Long totalIncome) {
		this.totalIncome = totalIncome;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}
	
	
	
	
}
