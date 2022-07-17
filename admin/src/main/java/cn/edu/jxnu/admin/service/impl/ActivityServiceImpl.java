package cn.edu.jxnu.admin.service.impl;

import cn.edu.jxnu.admin.dao.ActivityMapper;
import cn.edu.jxnu.admin.entity.Activity;
import cn.edu.jxnu.admin.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityMapper mapper;

    @Override
    public List<Activity> findAll() {
        return mapper.findAll();
    }

    @Override
    public List<Activity> findByName(String str) {
        return mapper.findByName("%" + str + "%");
    }

    @Override
    public Integer del(Integer id) {
        return mapper.del(id);
    }

    @Override
    public Integer update(Activity item) {
        return mapper.update(item);
    }

    @Override
    public List<Activity> findById(Integer id) {
        return mapper.findById(id);
    }

    @Override
    public Integer clacCount() {
        return mapper.clacCount();
    }
}
