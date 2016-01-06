package com.persist;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description: User
 * @anthor: shi_lin
 * @CreateTime: 2016-01-05
 */
@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 2820473684086191843L;
    @Column(name = "password")
    private String password;

    @Column(name = "username")
    private String username;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "has_roles")
    private String hasRole;   //х╗оч

    @Column(name = "create_time")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createTime;

    @Column(name = "update_time")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updateTime;



    //========================getter and setter=================================

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getHasRole() {
        return hasRole;
    }

    public void setHasRole(String hasRole) {
        this.hasRole = hasRole;
    }
}
