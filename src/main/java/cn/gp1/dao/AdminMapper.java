package cn.gp1.dao;

import cn.gp1.pojo.Admins;

public interface AdminMapper {
 Admins findByname(String name);
}
