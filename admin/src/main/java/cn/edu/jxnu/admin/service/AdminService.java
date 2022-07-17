package cn.edu.jxnu.admin.service;

import cn.edu.jxnu.admin.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminService {

    Integer add(Admin item);

    Integer del(Integer id);

    Integer update(Admin item);

    List<Admin> findAll();

    Admin findById(Integer id);

    List<Admin> findByCondition(String name, String email);

    Integer clacCount();

}
