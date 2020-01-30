package com.id.enigma.MyTestSqui.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.id.enigma.MyTestSqui.Model.IncomingModel;
import com.id.enigma.MyTestSqui.Repository.IncomeRepository;


@Service
public class IncomeServiceImpl implements IncomeService {
	
	@Autowired
	IncomeRepository incomeRepository;

	@Override
	public List<IncomingModel> getAllIncome() {
		// TODO Auto-generated method stub
		List<IncomingModel> incomes = incomeRepository.findAllIncomes();
		return incomes;
	}

	@Override
	public IncomingModel createIncome(IncomingModel income) {
		// TODO Auto-generated method stub
		IncomingModel inc = new IncomingModel();
		inc.setDateIncome(income.getDateIncome());
		inc.setInformation(income.getInformation());
		inc.setTotalIncome(income.getTotalIncome());
		inc.setStatusId(1l);
		return incomeRepository.save(inc);
	}

	@Override
	public IncomingModel findById(Long id) {
		Optional<IncomingModel> optional = incomeRepository.findById(id);
		IncomingModel income = new IncomingModel();
			if (optional.isPresent()) {
				income=optional.get();
			}
		return income;
	}

	@Override
	public IncomingModel deleteIncome(Long id) {
		// TODO Auto-generated method stub
		IncomingModel inc = findById(id);
		inc.setStatusId(2l);
		return incomeRepository.save(inc);
	}

	@Override
	public Page<IncomingModel> findAll(Integer page, Integer pageSize) {
		Pageable paging =  PageRequest.of(page, pageSize);
		return incomeRepository.findAll(paging);
	}

	@Override
	public IncomingModel updateIncome(IncomingModel income) {
		IncomingModel inc = new IncomingModel();
		inc.setInComingId(income.getInComingId());
		inc.setDateIncome(income.getDateIncome());
		inc.setInformation(income.getInformation());
		inc.setTotalIncome(income.getTotalIncome());
		inc.setStatusId(income.getInComingId());
		return incomeRepository.save(inc);
	}

	

}
