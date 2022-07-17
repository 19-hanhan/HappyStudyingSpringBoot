package cn.edu.jxnu.admin.service;

import cn.edu.jxnu.admin.entity.Student;

import java.util.List;

public interface StudentService {

    public Integer add(Student item);

    public Integer del(String id);

    public Integer update(Student item);

    public List<Student> findAll();

    public List<Student> findByName(String str);

    public Student findById(String id);

    public Integer clacCount();

}
