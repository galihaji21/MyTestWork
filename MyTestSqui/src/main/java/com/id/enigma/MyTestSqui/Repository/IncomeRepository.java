package com.id.enigma.MyTestSqui.Repository;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.id.enigma.MyTestSqui.Model.IncomingModel;


public interface IncomeRepository extends JpaRepository<IncomingModel,Long>{
	@Query("SELECT inc FROM IncomingModel inc where statusId =1 Order by inComingId desc")
	public List<IncomingModel> findAllIncomes();
	
	Page<IncomingModel> findAll(Pageable paging);

}
