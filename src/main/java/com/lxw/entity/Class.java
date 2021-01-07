package com.lxw.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lxw
 * @since 2020-12-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Class对象", description="")
public class Class implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "class_id", type = IdType.AUTO)
    private Integer classId;

    private String className;

    private Integer estimate;

    private Integer actual;

    private Integer  state;


}
