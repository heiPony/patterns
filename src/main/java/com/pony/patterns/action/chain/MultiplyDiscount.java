package com.pony.patterns.action.chain;

import com.pony.patterns.action.strategy.Discount;

/**
 * Created by Peter on 10/29 029.
 */
public abstract class MultiplyDiscount implements Discount{
    protected MultiplyDiscount nextMultiplyDiscount;

    public MultiplyDiscount(MultiplyDiscount nextMultiplyDiscount){
        this.nextMultiplyDiscount = nextMultiplyDiscount;
    }

    public int calculate(int money){
        if (this.nextMultiplyDiscount != null){
            return this.nextMultiplyDiscount.calculate(money);
        }
        return money;
    }

}
