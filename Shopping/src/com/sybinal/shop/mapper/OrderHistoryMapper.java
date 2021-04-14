package com.sybinal.shop.mapper;

import com.sybinal.shop.model.OrderHistory;
import com.sybinal.shop.model.OrderHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_history
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    int countByExample(OrderHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_history
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    int deleteByExample(OrderHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_history
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_history
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    int insert(OrderHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_history
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    int insertSelective(OrderHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_history
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    List<OrderHistory> selectByExample(OrderHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_history
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    OrderHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_history
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    int updateByExampleSelective(@Param("record") OrderHistory record, @Param("example") OrderHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_history
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    int updateByExample(@Param("record") OrderHistory record, @Param("example") OrderHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_history
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    int updateByPrimaryKeySelective(OrderHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_history
     *
     * @mbggenerated Wed Apr 14 21:24:32 CST 2021
     */
    int updateByPrimaryKey(OrderHistory record);
}