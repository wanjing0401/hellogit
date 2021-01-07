package com.lxw.service.impl;

import com.lxw.entity.Student;
import com.lxw.mapper.StudentMapper;
import com.lxw.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lxw
 * @since 2020-12-30
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Autowired(required = false)
    private StudentMapper studentMapper;
    @Override
    public List<Student> findStudent(Integer id) {
        return studentMapper.findStudent(id);
    }
}
