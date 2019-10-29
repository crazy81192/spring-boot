package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.Employee;

/**
 * @author ming
 * @create 2019-08-20 17:12
 */
//@Mapper或者@MapperScan将接口扫描到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
