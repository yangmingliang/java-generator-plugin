package com.yangml.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yangml.demo.entity.IUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserMapper extends BaseMapper<IUser> {}