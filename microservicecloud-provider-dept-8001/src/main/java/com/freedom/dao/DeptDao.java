package com.freedom.dao;

import com.freedom.entity.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptDao {

    @Insert(value = "insert into dept(dname, db_source) value (#{dname}, DATABASE())")
    boolean addDept(Dept dept);

    @Select(value = "select deptno,dname,db_source from dept where deptno = #{id}")
    Dept findById(Long id);

    @Select(value = "select deptno,dname,db_source from dept")
    List<Dept> findAll();
}
