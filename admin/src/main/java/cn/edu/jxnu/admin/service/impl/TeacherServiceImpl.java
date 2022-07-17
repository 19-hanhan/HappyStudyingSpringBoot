package cn.edu.jxnu.admin.service.impl;

import cn.edu.jxnu.admin.dao.TeacherMapper;
import cn.edu.jxnu.admin.entity.Teacher;
import cn.edu.jxnu.admin.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper mapper;

    @Override
    public Integer add(Teacher item) {
        return mapper.add(item);
    }

    @Override
    public Integer del(String id) {
        return mapper.del(id);
    }

    @Override
    public Integer update(Teacher item) {
        return mapper.update(item);
    }

    @Override
    public List<Teacher> findAll() {
        return mapper.findAll();
    }

    @Override
    public List<Teacher> findByName(String str) {
        return mapper.findByName("%" + str + "%");
    }

    @Override
    public Teacher findById(Integer id) {
        return mapper.findById(id);
    }

    @Override
    public Integer clacCount() {
        return mapper.clacCount();
    }

}
