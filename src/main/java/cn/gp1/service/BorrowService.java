package cn.gp1.service;

import java.util.List;

import cn.gp1.pojo.BorrowData;

public interface BorrowService {
	
	void saveBook(BorrowData bd);
	List<BorrowData> findAllData();
}
