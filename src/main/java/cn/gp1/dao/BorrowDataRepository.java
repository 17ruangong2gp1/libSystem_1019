package cn.gp1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cn.gp1.pojo.BorrowData;

public interface BorrowDataRepository extends JpaRepository<BorrowData, Integer> {
		
	@Query(value="select * from b_data",nativeQuery=true)
	List<BorrowData> findAllData();
}
