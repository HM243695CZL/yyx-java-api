package com.hl.project.model;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 创建时间
     */
    @Column(name = "createdTime")
    private Date createdtime;

    /**
     * 更新时间
     */
    @Column(name = "lastModifiedTime")
    private Date lastmodifiedtime;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态 0：禁用 1：启用
     */
    private Integer status;

    @Column(name = "userImgId")
    private String userimgid;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取创建时间
     *
     * @return createdTime - 创建时间
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * 设置创建时间
     *
     * @param createdtime 创建时间
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * 获取更新时间
     *
     * @return lastModifiedTime - 更新时间
     */
    public Date getLastmodifiedtime() {
        return lastmodifiedtime;
    }

    /**
     * 设置更新时间
     *
     * @param lastmodifiedtime 更新时间
     */
    public void setLastmodifiedtime(Date lastmodifiedtime) {
        this.lastmodifiedtime = lastmodifiedtime;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取状态 0：禁用 1：启用
     *
     * @return status - 状态 0：禁用 1：启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0：禁用 1：启用
     *
     * @param status 状态 0：禁用 1：启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return userImgId
     */
    public String getUserimgid() {
        return userimgid;
    }

    /**
     * @param userimgid
     */
    public void setUserimgid(String userimgid) {
        this.userimgid = userimgid;
    }
}