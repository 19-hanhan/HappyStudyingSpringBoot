package cn.edu.jxnu.admin.service.impl;

import cn.edu.jxnu.admin.dao.RequestMapper;
import cn.edu.jxnu.admin.entity.Request;
import cn.edu.jxnu.admin.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {

    @Autowired
    private RequestMapper mapper;

    @Override
    public Integer del(Integer id) {
        return mapper.del(id);
    }

    @Override
    public List<Request> findAll() {
        return mapper.findAll();
    }

    @Override
    public Request findById(Integer id) {
        return mapper.findById(id);
    }

    @Override
    public Integer clacCount() {
        return mapper.clacCount();
    }
}
