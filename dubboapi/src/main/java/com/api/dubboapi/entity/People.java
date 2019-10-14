package com.api.dubboapi.entity;


import java.io.Serializable;
/**
 * 分销中心
 *
 * @author: liuhongshan
 * @email: liuhongshan@sinovatech.com
 * @date:2019/10/14 20:44
 */

public class People implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1415852192397895853L;
    // 人员编号
    private int id;
    // 姓名
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People [id=" + id + ", name=" + name + "]";
    }

}
