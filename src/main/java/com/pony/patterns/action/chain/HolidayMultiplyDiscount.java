package com.pony.patterns.action.chain;

/**
 * 假日一律减5元
 */
public class HolidayMultiplyDiscount extends MultiplyDiscount {
    public HolidayMultiplyDiscount(MultiplyDiscount nextMultiplyDiscount) {
        super(nextMultiplyDiscount);
    }

    @Override
    public int calculate(int money) {
        if (money > 20){
            System.out.println("假日一律减5元");
            money = money - 5;
        }
        return super.calculate(money);
    }
}
