package cn.gp1.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gp1.dao.BorrowDataRepository;
import cn.gp1.pojo.BorrowData;
import cn.gp1.service.BorrowService;
@Service
public class BorrowServiceImpl implements BorrowService {
	
	@Resource
	private BorrowDataRepository bd;
	
	@Override
	public void saveBook(BorrowData bd) {
		// TODO Auto-generated method stub
		this.bd.save(bd);
	}

}
