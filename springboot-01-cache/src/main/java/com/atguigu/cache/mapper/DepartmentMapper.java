package com.atguigu.cache.mapper;

import com.atguigu.cache.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author ming
 * @create 2019-08-21 16:07
 */
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    Department getDeptById(Integer id);
}
