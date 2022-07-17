package cn.edu.jxnu.admin.dao;

import cn.edu.jxnu.admin.entity.Request;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RequestMapper {

    public Integer del(Integer id);

    public List<Request> findAll();

    public Request findById(Integer id);

    public Integer clacCount();
}
