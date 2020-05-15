package org.lx.jiaocheng427.user.entity;

import java.util.Date;

/**
 * @author linxin
 * @data 2020/4/2719:39
 */
public class UserEntity {
    private Integer id;
    private String username;
    private String password;
    private Date createtime;
    private Integer staus;

    public UserEntity() {
    }

    public UserEntity(Integer id, String username, String password, Date createtime, Integer staus) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createtime = createtime;
        this.staus = staus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStaus() {
        return staus;
    }

    public void setStaus(Integer staus) {
        this.staus = staus;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createtime=" + createtime +
                ", staus=" + staus +
                '}';
    }
}
