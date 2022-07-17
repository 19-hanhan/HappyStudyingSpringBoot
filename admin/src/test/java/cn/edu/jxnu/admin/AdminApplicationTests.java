package cn.edu.jxnu.admin;

import cn.edu.jxnu.admin.entity.Admin;
import cn.edu.jxnu.admin.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
class AdminApplicationTests {

    @Autowired
    private ActivityService activityService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private RequestService requestService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
//        System.out.println(userService.clacCount());
//        System.out.println(teacherService.clacCount());
//        Student stu = new Student("201926702044", "葛绍瑜", "男", "软件学院", "19级软件技术方向（1）班");
//        System.out.println(studentService.add(stu));
//        System.out.println(studentService.del("201926702044"));
//        System.out.println(studentService.findAll());
//        System.out.println(DigestUtils.md5DigestAsHex("password".getBytes()));
        Admin ad = adminService.findById(10000000); ad.setaPassword(DigestUtils.md5DigestAsHex("password".getBytes()));
        System.out.println(adminService.update(ad));
    }

}
