package com.hivetech.mutable.builder;

import com.hivetech.mutable.product.order.Order;
import com.hivetech.mutable.product.type.BreadType;
import com.hivetech.mutable.product.type.OrderType;
import com.hivetech.mutable.product.type.SauceType;
import com.hivetech.mutable.product.type.VegetableType;

public interface OrderBuilder {

    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();

}
