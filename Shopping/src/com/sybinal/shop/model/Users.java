package com.sybinal.shop.model;

import java.util.Date;

public class Users {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.id
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.username
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.pwd
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private String pwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.enabled
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private Integer enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.lastlogintime
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private Date lastlogintime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.registertime
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private Date registertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.CREATEDAT
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private Date createdat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.userroleid
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private Integer userroleid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.id
     *
     * @return the value of users.id
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.id
     *
     * @param id the value for users.id
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.username
     *
     * @return the value of users.username
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.username
     *
     * @param username the value for users.username
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.pwd
     *
     * @return the value of users.pwd
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.pwd
     *
     * @param pwd the value for users.pwd
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.enabled
     *
     * @return the value of users.enabled
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.enabled
     *
     * @param enabled the value for users.enabled
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.lastlogintime
     *
     * @return the value of users.lastlogintime
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.lastlogintime
     *
     * @param lastlogintime the value for users.lastlogintime
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.registertime
     *
     * @return the value of users.registertime
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public Date getRegistertime() {
        return registertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.registertime
     *
     * @param registertime the value for users.registertime
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.CREATEDAT
     *
     * @return the value of users.CREATEDAT
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public Date getCreatedat() {
        return createdat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.CREATEDAT
     *
     * @param createdat the value for users.CREATEDAT
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.userroleid
     *
     * @return the value of users.userroleid
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public Integer getUserroleid() {
        return userroleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.userroleid
     *
     * @param userroleid the value for users.userroleid
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setUserroleid(Integer userroleid) {
        this.userroleid = userroleid;
    }
}