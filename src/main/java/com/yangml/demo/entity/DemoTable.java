package com.yangml.demo.entity;

import java.io.Serializable;

/**
 * (DemoTable)实体类
 *
 * @author makejava
 * @since 2022-12-19 17:02:45
 */
public class DemoTable implements Serializable {
    private static final long serialVersionUID = -67466708075690761L;

    private Long id;

    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

