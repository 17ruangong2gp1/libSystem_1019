package cn.gp1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cn.gp1.pojo.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
		
		@Query(value="select * from b_user where uname=?1",nativeQuery=true)
		List<Users> findByName(String name);
		
}
