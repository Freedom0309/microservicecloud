package com.freedom.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private long deptno;
    private String dname;
    private String db_source;

    public Dept(String deptName) {
        this.dname = deptName;
    }
}
