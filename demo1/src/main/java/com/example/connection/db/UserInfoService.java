package com.example.connection.db;

import com.example.demo2.bean.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;

    public List<UserInfo> getUserInfo(){
        List<UserInfo> userInfos = userInfoMapper.selectAll();
        return userInfos;
    }
}
