package cn.edu.jxnu.admin.controller;

import cn.edu.jxnu.admin.entity.User;
import cn.edu.jxnu.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/oneUser")
    public User oneUser(String id) {
        return service.findById(Integer.valueOf(id));
    }

    @GetMapping("/allUser")
    public Map<String, Object> allUser() {
        Map<String, Object> mp = new HashMap<>();
        List<User> ls = service.findAll();
        mp.put("result", ls);
        mp.put("count", ls.size());
        return mp;
    }

    @GetMapping("/findUser")
    public Map<String, Object> findUser(String key) {
        Map<String, Object> mp = new HashMap<>();
        List<User> ls = service.findByName(key);
        mp.put("result", ls);
        mp.put("count", ls.size());
        return mp;
    }

    @PostMapping("/delUser")
    public String delUser(Integer id) {
        return "success";
    }

    @PostMapping("/updateUser")
    public String updateUser(String id, String name, String oldPassword, String newPassword, String email, String no) {
        User ad = service.findById(Integer.valueOf(id));
        if (ad.getuPassword().equals(DigestUtils.md5DigestAsHex(oldPassword.getBytes()))) {
            ad.setuName(name); ad.setuEmail(email); ad.setuNo(no);
            if(newPassword != null && !newPassword.equals("")) {
                ad.setuPassword(newPassword);
            }
            service.update(ad);
            return "true";
        } else {
            return "false";
        }
    }
}
