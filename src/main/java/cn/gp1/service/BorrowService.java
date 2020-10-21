package cn.gp1.service;

import java.util.List;
import com.alibaba.fastjson.JSONObject;

import cn.gp1.pojo.BorrowData;

public interface BorrowService {
	
	void saveBook(BorrowData bd);
	List<BorrowData> findAllData();
	JSONObject getDataList(int pageNum, int pageSize);
}
