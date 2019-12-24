package com.offcn.mapper;

import com.offcn.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

//mybatis框架中的注解
@Mapper
public interface UserMapper {

    @Insert("insert into tb_user values(#{id},#{name},#{birthday})")
    public void saveUser(User user);

    @Select("select * from tb_user")
    public List<User> findAll();

    @Select("select * from tb_user where id =#{id}")
    public User findOne(Integer id);

    @Delete("delete  from tb_user where id =#{id}")
    public void deleteById(Integer id);

    @Update("update tb_user set name=#{name} , birthday=#{birthday} where id = #{id}")
    public void updateUser(User user);
}
