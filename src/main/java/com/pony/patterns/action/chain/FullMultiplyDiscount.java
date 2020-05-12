package com.pony.patterns.action.chain;

/**
 * 满减
 */
public class FullMultiplyDiscount extends MultiplyDiscount {
    public FullMultiplyDiscount(MultiplyDiscount nextMultiplyDiscount) {
        super(nextMultiplyDiscount);
    }

    @Override
    public int calculate(int money) {
        if (money > 200){
            System.out.println("优惠满减20元");
            money = money - 20;
        }
        return super.calculate(money);
    }
}
