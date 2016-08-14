package com.qunar.hotel.api.bean;

import java.io.Serializable;

/**
 * Created by easonlian on 16-7-12.
 */
public class Param implements Serializable {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return "Param{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
