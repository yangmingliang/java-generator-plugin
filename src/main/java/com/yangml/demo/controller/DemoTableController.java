package com.yangml.demo.controller;

import com.yangml.demo.entity.DemoTable;
import com.yangml.demo.service.DemoTableService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DemoTable)表控制层
 *
 * @author makejava
 * @since 2022-12-19 17:02:45
 */
@RestController
@RequestMapping("demoTable")
public class DemoTableController {
    /**
     * 服务对象
     */
    @Resource
    private DemoTableService demoTableService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<DemoTable> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.demoTableService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param demoTable 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<DemoTable> add(DemoTable demoTable) {
        return ResponseEntity.ok(this.demoTableService.insert(demoTable));
    }

    /**
     * 编辑数据
     *
     * @param demoTable 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<DemoTable> edit(DemoTable demoTable) {
        return ResponseEntity.ok(this.demoTableService.update(demoTable));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.demoTableService.deleteById(id));
    }

}

