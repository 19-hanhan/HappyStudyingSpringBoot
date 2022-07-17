package cn.edu.jxnu.admin.dao;

import cn.edu.jxnu.admin.entity.Admin;
import cn.edu.jxnu.admin.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminMapper {

    Integer add(Admin item);

    Integer del(Integer id);

    Integer update(Admin item);

    List<Admin> findAll();

    Admin findById(Integer id);

    List<Admin> findByCondition(@Param("name") String name, @Param("email") String email);

    Integer clacCount();

}
