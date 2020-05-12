package com.pony.patterns.entity.bag;

import com.pony.patterns.entity.Bag;

/**
 * 桔子包装
 * Created by Peter on 10/9 009.
 */
public class OrangeBag implements Bag {
    @Override
    public void pack() {
        System.out.print("--桔子使用网兜包装");
    }
}
