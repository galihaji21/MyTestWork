package com.id.enigma.MyTestSqui.Service;
import java.util.List;

import org.springframework.data.domain.Page;
import com.id.enigma.MyTestSqui.Model.IncomingModel;


public interface IncomeService {
	List<IncomingModel> getAllIncome();
	IncomingModel createIncome(IncomingModel income);
	IncomingModel deleteIncome(Long id);
	IncomingModel findById(Long id);
	Page<IncomingModel> findAll(Integer page,Integer pageSize);
	IncomingModel updateIncome(IncomingModel income);
}
