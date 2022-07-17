package cn.edu.jxnu.admin.service;

import cn.edu.jxnu.admin.entity.Request;

import java.util.List;

public interface RequestService {

    public Integer del(Integer id);

    public List<Request> findAll();

    public Request findById(Integer id);

    public Integer clacCount();
}
