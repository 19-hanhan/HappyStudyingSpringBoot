package cn.edu.jxnu.admin.service.impl;

import cn.edu.jxnu.admin.dao.StudentMapper;
import cn.edu.jxnu.admin.entity.Student;
import cn.edu.jxnu.admin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper mapper;

    @Override
    public Integer add(Student item) {
        return mapper.add(item);
    }

    @Override
    public Integer del(String id) {
        return mapper.del(id);
    }

    @Override
    public Integer update(Student item) {
        return mapper.update(item);
    }

    @Override
    public List<Student> findAll() {
        return mapper.findAll();
    }

    @Override
    public List<Student> findByName(String str) {
        return mapper.findByName("%" + str + "%");
    }

    @Override
    public Student findById(String id) {
        return mapper.findById(id);
    }

    @Override
    public Integer clacCount() {
        return mapper.clacCount();
    }

}
