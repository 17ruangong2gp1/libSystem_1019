package cn.gp1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.gp1.pojo.BorrowData;

public interface BorrowDataRepository extends JpaRepository<BorrowData, Integer> {

}
