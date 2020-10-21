package cn.gp1.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.gp1.dao.BorrowDataRepository;
import cn.gp1.pojo.BorrowData;
import cn.gp1.service.BorrowService;
@Service
@Transactional
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

	@Override
	public JSONObject getDataList(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		JSONObject result=new JSONObject();
		try {
			System.out.println("使用分页");
			PageHelper.startPage(pageNum,pageSize);
			PageInfo<BorrowData> pageinfo=new PageInfo<>(this.bdrepository.findAll());
			result.put("msg", "操作成功");
			result.put("code", 0);
			result.put("data", pageinfo.getList());
			result.put("count", pageinfo.getTotal());
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("code", 500);
			result.put("msg", "操作失败");
		}
		
		return result;
	}

}
