package org.lx.jiaocheng427.user.service;

import org.lx.jiaocheng427.user.entity.UserEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface UserService {
    //接收Controller层的getAll方法
    List<UserEntity> getAll(Map map);

    void delById(Integer id);

    //保存用户
    public void save(UserEntity userEntity);

    //根据id查询用户
    public UserEntity getUserById(Integer id);

    //根据id修改用户
    public void updateUserById(UserEntity userEntity);
}
