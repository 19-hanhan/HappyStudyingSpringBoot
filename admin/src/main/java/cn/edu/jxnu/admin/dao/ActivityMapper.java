package cn.edu.jxnu.admin.dao;

import cn.edu.jxnu.admin.entity.Activity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActivityMapper {

    List<Activity> findAll();

    List<Activity> findByName(String str);

    Integer del(Integer id);

    Integer update(Activity item);

    List<Activity> findById(Integer id);

    Integer clacCount();
}
