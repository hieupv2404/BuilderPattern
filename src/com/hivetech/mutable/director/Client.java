package com.hivetech.mutable.director;

import com.hivetech.mutable.concretebuilder.FastFoodOrderBuilder;
import com.hivetech.mutable.product.order.Order;
import com.hivetech.mutable.product.type.BreadType;
import com.hivetech.mutable.product.type.OrderType;
import com.hivetech.mutable.product.type.SauceType;

public class Client {

    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
                .orderSauce(SauceType.SOY_SAUCE).build();
        System.out.println(order);
    }
}
