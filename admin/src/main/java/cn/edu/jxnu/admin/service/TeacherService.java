package cn.edu.jxnu.admin.service;

import cn.edu.jxnu.admin.entity.Teacher;

import java.util.List;

public interface TeacherService {

    public Integer add(Teacher item);

    public Integer del(String id);

    public Integer update(Teacher item);

    public List<Teacher> findAll();

    public List<Teacher> findByName(String str);

    public Teacher findById(Integer id);

    public Integer clacCount();

}
