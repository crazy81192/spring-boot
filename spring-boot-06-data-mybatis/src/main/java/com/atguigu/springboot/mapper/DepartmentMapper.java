package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author ming
 * @create 2019-08-20 16:27
 */
//指定这是一个操作数据库的mapper
//@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id = #{id}")
    public Department getDeptBuId(Integer id);

    @Delete("delete from department where id = #{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set department_name = #{departmentName} where id = #{id}")
    public int updateDept(Department department);
}
