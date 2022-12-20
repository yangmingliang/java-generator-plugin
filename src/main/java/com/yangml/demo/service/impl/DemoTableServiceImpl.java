package com.yangml.demo.service.impl;

import com.yangml.demo.entity.DemoTable;
import com.yangml.demo.mapper.DemoTableMapper;
import com.yangml.demo.service.DemoTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (DemoTable)表服务实现类
 *
 * @author makejava
 * @since 2022-12-19 17:02:52
 */
@Service("demoTableService")
public class DemoTableServiceImpl implements DemoTableService {
    @Resource
    private DemoTableMapper mapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DemoTable queryById(Long id) {
        return mapper.selectById(id);
    }



    /**
     * 新增数据
     *
     * @param demoTable 实例对象
     * @return 实例对象
     */
    @Override
    public DemoTable insert(DemoTable demoTable) {
        this.mapper.insert(demoTable);
        return demoTable;
    }

    /**
     * 修改数据
     *
     * @param demoTable 实例对象
     * @return 实例对象
     */
    @Override
    public DemoTable update(DemoTable demoTable) {
        this.mapper.update(demoTable,null);
        return this.queryById(demoTable.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.mapper.deleteById(id) > 0;
    }
}
