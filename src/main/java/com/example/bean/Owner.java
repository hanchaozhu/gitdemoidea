package com.example.bean;

import java.io.Serializable;

/**
 * Created by zhuhanchao on 2019/1/4.
 */
public class Owner implements Serializable{
    private Integer id;
    private String name;

    private Integer chainid;

    public Integer getChainid() {
        return chainid;
    }

    public void setChainid(Integer chainid) {
        this.chainid = chainid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chainid=" + chainid +
                '}';
    }
}
