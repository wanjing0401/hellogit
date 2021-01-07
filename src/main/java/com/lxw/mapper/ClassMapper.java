package com.lxw.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lxw.entity.Class;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lxw
 * @since 2020-12-30
 */
public interface ClassMapper extends BaseMapper<Class> {
    /**
     * 根据班级名称查找班级信息
     * @param page
     * @param wrapper
     * @return
     */
     IPage<Class> findByName(Page<Class>page, @Param(Constants.WRAPPER) QueryWrapper<Class> wrapper);
}
