package com.sybinal.shop.model;

public class ProductWithBLOBs extends Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.name
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private byte[] name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.explain
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private String explain;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.generalexplain
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private byte[] generalexplain;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.externalid
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private byte[] externalid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.defaultimg
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private byte[] defaultimg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public byte[] getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setName(byte[] name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.explain
     *
     * @return the value of product.explain
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public String getExplain() {
        return explain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.explain
     *
     * @param explain the value for product.explain
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setExplain(String explain) {
        this.explain = explain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.generalexplain
     *
     * @return the value of product.generalexplain
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public byte[] getGeneralexplain() {
        return generalexplain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.generalexplain
     *
     * @param generalexplain the value for product.generalexplain
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setGeneralexplain(byte[] generalexplain) {
        this.generalexplain = generalexplain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.externalid
     *
     * @return the value of product.externalid
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public byte[] getExternalid() {
        return externalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.externalid
     *
     * @param externalid the value for product.externalid
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setExternalid(byte[] externalid) {
        this.externalid = externalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.defaultimg
     *
     * @return the value of product.defaultimg
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public byte[] getDefaultimg() {
        return defaultimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.defaultimg
     *
     * @param defaultimg the value for product.defaultimg
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setDefaultimg(byte[] defaultimg) {
        this.defaultimg = defaultimg;
    }
}