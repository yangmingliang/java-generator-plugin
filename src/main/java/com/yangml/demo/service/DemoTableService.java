package com.yangml.demo.service;

import com.yangml.demo.entity.DemoTable;

/**
 * (DemoTable)表服务接口
 *
 * @author makejava
 * @since 2022-12-19 17:02:51
 */
public interface DemoTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DemoTable queryById(Long id);


    /**
     * 新增数据
     *
     * @param demoTable 实例对象
     * @return 实例对象
     */
    DemoTable insert(DemoTable demoTable);

    /**
     * 修改数据
     *
     * @param demoTable 实例对象
     * @return 实例对象
     */
    DemoTable update(DemoTable demoTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
