package com.lxw.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lxw.entity.Class;
import com.lxw.entity.Student;
import com.lxw.service.ClassService;
import com.lxw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lxw
 * @since 2020-12-30
 */
@Controller
public class ClassController {
    @Autowired
    private ClassService classService;
    @Autowired
    private StudentService studentService;

    @RequestMapping("/index")
    public String index( String className, Integer state, Model model, Integer pageNum) {
        if (pageNum == null) {
            pageNum = 1;
        }
        Page<Class> page = new Page<>(pageNum, 1);
        QueryWrapper wrapper = new QueryWrapper();
        if (className != null && className != "") {
            wrapper.eq("class_name", className);
        }
        if (state != null && state != 0) {
            wrapper.eq("state", state);
        }
        IPage<Class> byName = classService.findByName(page, wrapper);
        model.addAttribute("byName", byName);
        return "index";
    }

    @RequestMapping("/insert")
    public String insert() {
        return "insert";
    }

    @RequestMapping("/selectStundent")
    public String selectStundent() {

        return "";
    }

    @RequestMapping("/student")
    public String student(Integer id,Model model) {
        List<Student> students = studentService.findStudent(id);
        model.addAttribute("list",students);
        return "student";
    }
}

