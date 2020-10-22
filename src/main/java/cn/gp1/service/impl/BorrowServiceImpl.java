package cn.gp1.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.gp1.dao.BorrowDataRepository;
import cn.gp1.dao.UserMapper;
import cn.gp1.pojo.BorrowData;
import cn.gp1.service.BorrowService;
@Service
@Transactional
public class BorrowServiceImpl implements BorrowService {
	
	@Resource
	private BorrowDataRepository bdrepository;
	@Resource
	private UserMapper umapper;
	
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
			//PageInfo<BorrowData> pageinfo=new PageInfo<>(this.umapper.findAllData());
			//PageHelper.startPage(pageNum, pageSize);
			List<BorrowData> datalist= this.umapper.findAllData();
			PageInfo<BorrowData> pageInfo=new PageInfo<>(datalist);
			result.put("msg", "操作成功");
			result.put("code", 0);
			result.put("data", pageInfo.getList());
			result.put("count", pageInfo.getTotal());
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			result.put("code", 500);
			result.put("msg", "操作失败");
		}
		
		return result;
	}

}
