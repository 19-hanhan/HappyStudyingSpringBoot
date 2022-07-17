package cn.edu.jxnu.admin.service;

import cn.edu.jxnu.admin.entity.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public List<User> findByName(String str);

    public Integer del(Integer id);

    public Integer update(User item);

    public User findById(Integer id);

    public Integer clacCount();
}
