package com.lxw.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lxw.entity.Class;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lxw
 * @since 2020-12-30
 */
public interface ClassService extends IService<Class> {
    IPage<Class> findByName(Page<Class> page, @Param(Constants.WRAPPER) QueryWrapper<Class> wrapper);
}
