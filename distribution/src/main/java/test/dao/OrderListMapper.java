package test.dao;

import java.util.List;
import nf.com.model.OrderList;

public interface OrderListMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(OrderList record);

    OrderList selectByPrimaryKey(String orderid);

    List<OrderList> selectAll();

    int updateByPrimaryKey(OrderList record);
}