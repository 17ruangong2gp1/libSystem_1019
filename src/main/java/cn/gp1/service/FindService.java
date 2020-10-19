package cn.gp1.service;

import java.util.List;

import cn.gp1.pojo.Books;
import cn.gp1.pojo.Users;

public interface FindService {
   List<Users> findAll();
   List<Books> findBook();
}
