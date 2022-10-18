package com.shortvideoserver.service;

import com.shortvideoserver.BackClient;
import com.shortvideoserver.vo.LoginVo;
import com.shortvideoserver.vo.RegisterVo;

/**
* @author 10281
* @description 针对表【user】的数据库操作Service
* @createDate 2022-10-18 20:40:03
*/
public interface UserService {
    /**
     * 用户登录
     * @param loginVo 登录信息
     * @return 返回通用结构
     */
    BackClient login(LoginVo loginVo);

    /**
     * 用户注册处
     * @param registerVo 注册信息
     * @return 返回通用结构
     */
    BackClient register(RegisterVo registerVo);

}
