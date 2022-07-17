package cn.edu.jxnu.admin.service.impl;

import cn.edu.jxnu.admin.dao.AdminMapper;
import cn.edu.jxnu.admin.entity.Admin;
import cn.edu.jxnu.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper mapper;

    @Override
    public Integer add(Admin item) {
        return mapper.add(item);
    }

    @Override
    public Integer del(Integer id) {
        return mapper.del(id);
    }

    @Override
    public Integer update(Admin item) {
        return mapper.update(item);
    }

    @Override
    public List<Admin> findAll() {
        return mapper.findAll();
    }

    @Override
    public Admin findById(Integer id) {
        return mapper.findById(id);
    }

    @Override
    public List<Admin> findByCondition(String name, String email) {
        if (name != null) name = "%" + name + "%";
        return mapper.findByCondition(name, email);
    }

    @Override
    public Integer clacCount() {
        return mapper.clacCount();
    }
}
