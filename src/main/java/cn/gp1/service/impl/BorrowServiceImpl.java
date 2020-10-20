package cn.gp1.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gp1.dao.BorrowDataRepository;
import cn.gp1.pojo.BorrowData;
import cn.gp1.service.BorrowService;
@Service
public class BorrowServiceImpl implements BorrowService {
	
	@Resource
	private BorrowDataRepository bdrepository;
	
	@Override
	public void saveBook(BorrowData bd) {
		// TODO Auto-generated method stub
		this.bdrepository.save(bd);
	}

	@Override
	public List<BorrowData> findAllData() {
		// TODO Auto-generated method stub
		return this.bdrepository.findAll();
	}

}
