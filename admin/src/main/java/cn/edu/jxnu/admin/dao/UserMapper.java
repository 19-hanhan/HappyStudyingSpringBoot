package cn.edu.jxnu.admin.dao;

import cn.edu.jxnu.admin.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    Integer del(Integer id);

    Integer update(User item);

    List<User> findAll();

    List<User> findByName(String str);

    User findById(Integer id);

    Integer clacCount();
}
