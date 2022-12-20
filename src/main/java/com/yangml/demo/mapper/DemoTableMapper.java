package com.yangml.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yangml.demo.entity.DemoTable;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoTableMapper  extends BaseMapper<DemoTable> {
}
