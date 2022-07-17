package cn.edu.jxnu.admin.dao;

import cn.edu.jxnu.admin.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {

    public Integer add(Teacher item);

    public Integer del(String id);

    public Integer update(Teacher item);

    public List<Teacher> findAll();

    public List<Teacher> findByName(String str);

    public Teacher findById(Integer id);

    public Integer clacCount();

}
