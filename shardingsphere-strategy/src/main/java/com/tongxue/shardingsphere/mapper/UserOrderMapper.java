package com.tongxue.shardingsphere.mapper;

import com.tongxue.shardingsphere.entity.UserOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserOrderMapper {
    /**
     * @author 学相伴-飞哥
     * @description 保存订单
     * @params [user]
     * @date 2021/3/10 17:14
     */
    @Insert("insert into ksd_user_order(order_number,user_id,create_time,yearmonth) values(#{orderNumber},#{userId},#{createTime},#{yearmonth})")
    @Options(useGeneratedKeys = true, keyColumn = "order_id", keyProperty = "orderId")
    void addUserOrder(UserOrder userOrder);
}
