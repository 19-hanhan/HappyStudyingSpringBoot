package cn.edu.jxnu.admin.controller;

import cn.edu.jxnu.admin.entity.Admin;
import cn.edu.jxnu.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService service;

    @PostMapping("/login")
    public String Login(HttpServletResponse response, String username, String password) {
        List<Admin> ls = service.findByCondition(null, username);
//        System.out.println(ls);
        if (ls.size() == 0) {
            return "false";
        } else {
            Admin ad = ls.get(0);
//            System.out.println(DigestUtils.md5DigestAsHex(password.getBytes()));
            if (ad.getaPassword().equals(DigestUtils.md5DigestAsHex(password.getBytes()))) {
                // 添加cookie
                Cookie cookie = new Cookie("id",String.valueOf(ad.getaId()));
                //设置存活时间
                cookie.setMaxAge(7 * 24 * 60 * 60);
                // cookie放至响应头
                response.addCookie(cookie);
                return "true";
            } else {
                return "false";
            }
        }
    }

    @GetMapping("/logged")
    public Admin loggedAdmin(@CookieValue(value = "id", defaultValue = "") String id) {
        if (id.equals("")) return null;
        return service.findById(Integer.valueOf(id));
    }

    @PostMapping("/logout")
    public String Logout(HttpServletRequest request, HttpServletResponse response) {
        // 添加cookie
        Cookie cookie = new Cookie("id","");
        //设置存活时间
        cookie.setMaxAge(0);
        // cookie放至响应头
        response.addCookie(cookie);
        return "success";
    }

    @GetMapping("/oneAdmin")
    public Admin oneAdmin(String id) {
        return service.findById(Integer.valueOf(id));
    }

    @GetMapping("/allAdmin")
    public Map<String, Object> allAdmin() {
        Map<String, Object> mp = new HashMap<>();
        List<Admin> ls = service.findAll();
        mp.put("result", ls);
        mp.put("count", ls.size());
        return mp;
    }

    @GetMapping("/findAdmin")
    public Map<String, Object> findAdmin(String key) {
        Map<String, Object> mp = new HashMap<>();
        List<Admin> ls = service.findByCondition(key, null);
        mp.put("result", ls);
        mp.put("count", ls.size());
        return mp;
    }

    @PostMapping("/delAdmin")
    public String delAdmin(Integer id) {
        return "success";
    }

    @PostMapping("/updateAdmin")
    public String updateAdmin(String id, String name, String oldPassword, String newPassword, String email) {
        Admin ad = service.findById(Integer.valueOf(id));
        if (ad.getaPassword().equals(DigestUtils.md5DigestAsHex(oldPassword.getBytes()))) {
            ad.setaName(name); ad.setaEmail(email);
            if(newPassword != null && !newPassword.equals("")) {
                ad.setaPassword(newPassword);
            }
            service.update(ad);
            return "true";
        } else {
            return "false";
        }
    }

    @PostMapping("/addAdmin")
    public String addAdmin(String name, String password, String email) {
        Admin ad = new Admin(password, name, email);
        service.add(ad);
        return "true";
    }
}
