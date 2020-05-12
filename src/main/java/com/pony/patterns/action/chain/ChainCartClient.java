package com.pony.patterns.action.chain;

import com.pony.patterns.action.template.OtherPayShopping;
import com.pony.patterns.action.template.ShoppingCart;
import com.pony.patterns.create.fatory.simple.StaticFactory;
import com.pony.patterns.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板方法模式
 * 订单费用结算过程
 */
public class ChainCartClient {

    //初始化满减优惠券
    private static MultiplyDiscount multiplyDiscount = new FullMultiplyDiscount(null);
    static {
        multiplyDiscount = new NewerMultiplyDiscount(multiplyDiscount);
        multiplyDiscount = new SecondMultiplyDiscount(multiplyDiscount);
        multiplyDiscount = new HolidayMultiplyDiscount(multiplyDiscount);


    }

    public static void main(String[] args) {
        List<Fruit> products = new ArrayList();
        products.add(StaticFactory.getFruitApple());
        products.add(StaticFactory.getFruitBanana());
        products.add(StaticFactory.getFruitOrange());

        ShoppingCart cart = new OtherPayShopping(products);

        //注入优惠方案
        cart.setDiscount(multiplyDiscount);

        cart.submitOrder();
    }


}
