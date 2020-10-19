package cn.gp1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.gp1.pojo.Books;

public interface BookRepository extends JpaRepository<Books, Integer> {

}
