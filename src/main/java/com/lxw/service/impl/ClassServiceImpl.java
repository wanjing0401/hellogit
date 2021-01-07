package com.lxw.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lxw.entity.Class;
import com.lxw.mapper.ClassMapper;
import com.lxw.service.ClassService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lxw
 * @since 2020-12-30
 */
@Service
public class ClassServiceImpl extends ServiceImpl<ClassMapper, Class> implements ClassService {
    @Autowired(required = false)
    private ClassMapper classMapper;

    @Override
    public IPage<Class> findByName(Page<Class> page, QueryWrapper<Class> wrapper) {
        return classMapper.findByName(page,wrapper);
    }
}
