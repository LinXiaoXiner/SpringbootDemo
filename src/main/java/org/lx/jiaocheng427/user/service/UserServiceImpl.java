package org.lx.jiaocheng427.user.service;

import org.lx.jiaocheng427.user.dao.UserDao;
import org.lx.jiaocheng427.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author linxin
 * @data 2020/4/2719:34
 */
@Service
//@Repository
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    //处理后，给Dao层的getAll()
    @Override
    public List<UserEntity> getAll(Map map) {
        return userDao.getAll(map);
    }
    /*
    @Override
    public List<UserEntity> getAll() {
        return null;
    }*/

    @Override
    public void delById(Integer id) {
        userDao.delById(id);
    }

    @Override
    public void save(UserEntity userEntity) {
        userEntity.setCreatetime(new Date());
        userEntity.setStaus(1);

        userDao.save(userEntity);
    }

    @Override
    public UserEntity getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public void updateUserById(UserEntity userEntity) {
        userDao.updateUserById(userEntity);
    }
}
