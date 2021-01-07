package com.lxw.mapper;

import com.lxw.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lxw
 * @since 2020-12-30
 */
public interface StudentMapper extends BaseMapper<Student> {
    public List<Student> findStudent(@Param("id") Integer id);
}
