package com.id.enigma.MyTestSqui2.Repository;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.id.enigma.MyTestSqui2.Model.ExpenseModel;


public interface ExpenseRepository extends JpaRepository<ExpenseModel,Long>{
	@Query("SELECT ex FROM ExpenseModel ex where statusId =1 Order by expenseId desc")
	public List<ExpenseModel> findAll();
//	Page<ExpenseModel> findAll(Pageable paging);

}
