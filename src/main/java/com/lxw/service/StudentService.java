package com.lxw.service;

import com.lxw.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lxw
 * @since 2020-12-30
 */
public interface StudentService extends IService<Student> {
    public List<Student> findStudent(@Param("id") Integer id);
}
