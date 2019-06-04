package com.freedom.controller;

import com.freedom.entity.Dept;
import com.freedom.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list(){
        return deptService.list();
    }
}
