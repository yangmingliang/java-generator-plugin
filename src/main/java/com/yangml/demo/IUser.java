package com.yangml.demo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("t_user")
public class IUser {
    /**
     * 指定主键名、主键生产策略
     */
    @TableId(value = "u_id", type = IdType.AUTO)
    private Integer uId;
    /**
     *指定列名,若一致可以不用指定
     */
    @TableField("user_name")
    private String userName;

    private String email;
    private String passWord;
    private Date birth;
    private int gender;
}