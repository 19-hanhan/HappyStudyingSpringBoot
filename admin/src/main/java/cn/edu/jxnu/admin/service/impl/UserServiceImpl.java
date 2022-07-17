package cn.edu.jxnu.admin.service.impl;

import cn.edu.jxnu.admin.dao.UserMapper;
import cn.edu.jxnu.admin.entity.User;
import cn.edu.jxnu.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> findAll() {
        return mapper.findAll();
    }

    @Override
    public List<User> findByName(String str) {
        return mapper.findByName("%" + str + "%");
    }

    @Override
    public Integer del(Integer id) {
        return mapper.del(id);
    }

    @Override
    public Integer update(User item) {
        return mapper.update(item);
    }

    @Override
    public User findById(Integer id) {
        return mapper.findById(id);
    }

    @Override
    public Integer clacCount() {
        return mapper.clacCount();
    }
}
