package com.example.springboot.mapper;

import com.example.springboot.model.User;
import org.apache.ibatis.annotations.Mapper;
/*import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;*/

import java.util.List;

/*@Mapper
public interface UserMapper {
    @Select("select * from users")
    List<User> getAll();

    @Select("select * from users where id=#{id}")
    User getOne(Long id);

    @Insert("INSERT INTO users(username,email)VALUES(#{username},#{email})")
    void insert(User user);

    @Update("UPDATE users set username=#{username},email=#{email} where id=#{id}")
    void update(User user);

    @Delete("DELETE FROM users where id=#{id}")
    void delete(Long id);
}*/

@Mapper
public interface UserMapper {
    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);
}

