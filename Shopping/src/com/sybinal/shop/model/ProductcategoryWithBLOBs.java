package com.sybinal.shop.model;

public class ProductcategoryWithBLOBs extends Productcategory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productcategory.name
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private byte[] name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productcategory.description
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productcategory.image
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    private byte[] image;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productcategory.name
     *
     * @return the value of productcategory.name
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public byte[] getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productcategory.name
     *
     * @param name the value for productcategory.name
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setName(byte[] name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productcategory.description
     *
     * @return the value of productcategory.description
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productcategory.description
     *
     * @param description the value for productcategory.description
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productcategory.image
     *
     * @return the value of productcategory.image
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productcategory.image
     *
     * @param image the value for productcategory.image
     *
     * @mbggenerated Thu Apr 15 21:45:38 CST 2021
     */
    public void setImage(byte[] image) {
        this.image = image;
    }
}