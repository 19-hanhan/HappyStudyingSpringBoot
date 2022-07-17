package cn.edu.jxnu.admin.service;

import cn.edu.jxnu.admin.entity.Activity;

import java.util.List;

public interface ActivityService {

    public Integer del(Integer id);

    public Integer update(Activity item);

    public List<Activity> findAll();

    public List<Activity> findByName(String str);

    public List<Activity> findById(Integer id);

    public Integer clacCount();
}
