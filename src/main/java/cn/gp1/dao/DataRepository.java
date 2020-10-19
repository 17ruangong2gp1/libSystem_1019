package cn.gp1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.gp1.pojo.BorrowData;

public interface DataRepository extends JpaRepository<BorrowData, Integer> {

}
