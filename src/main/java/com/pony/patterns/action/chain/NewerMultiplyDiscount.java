package com.pony.patterns.action.chain;

/**
 * 首次购
 */
public class NewerMultiplyDiscount extends MultiplyDiscount {
    public NewerMultiplyDiscount(MultiplyDiscount nextMultiplyDiscount) {
        super(nextMultiplyDiscount);
    }

    @Override
    public int calculate(int money) {
        if (money > 100){
            System.out.println("首次购买减20元");
            money = money - 30;
        }
        return super.calculate(money);
    }
}
