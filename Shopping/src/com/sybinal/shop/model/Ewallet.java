package com.sybinal.shop.model;

import java.util.Date;

public class Ewallet {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ewallet.id
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ewallet.amount
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    private Integer amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ewallet.updtime
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    private Date updtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ewallet.id
     *
     * @return the value of ewallet.id
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ewallet.id
     *
     * @param id the value for ewallet.id
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ewallet.amount
     *
     * @return the value of ewallet.amount
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ewallet.amount
     *
     * @param amount the value for ewallet.amount
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ewallet.updtime
     *
     * @return the value of ewallet.updtime
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    public Date getUpdtime() {
        return updtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ewallet.updtime
     *
     * @param updtime the value for ewallet.updtime
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    public void setUpdtime(Date updtime) {
        this.updtime = updtime;
    }
}