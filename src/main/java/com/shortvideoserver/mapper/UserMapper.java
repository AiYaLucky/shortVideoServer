package com.shortvideoserver.mapper;

import com.shortvideoserver.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author 10281
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-10-18 20:40:03
* @Entity com.shortvideoserver.entity.User
*/
@Mapper
public interface UserMapper {

    int insertUser(User user);

    List<User> getAllUsers();

    User getUserByAccount(String account);

    int updateUser(User user);

}
