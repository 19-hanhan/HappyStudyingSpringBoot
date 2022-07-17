package cn.edu.jxnu.admin.dao;

import cn.edu.jxnu.admin.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    public Integer add(Student item);

    public Integer del(String id);

    public Integer update(Student item);

    public List<Student> findAll();

    public List<Student> findByName(String str);

    public Student findById(String id);

    public Integer clacCount();

}
