package org.lx.jiaocheng427.user.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.lx.jiaocheng427.user.entity.UserEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserDao {
    //去查数据库，查到之后返到Service实现类
    List<UserEntity> getAll(@Param("content") Map map);

    void delById(Integer id);

    public void save(UserEntity userEntity);

    public UserEntity getUserById(Integer id);

    public void updateUserById(UserEntity userEntity);
}
