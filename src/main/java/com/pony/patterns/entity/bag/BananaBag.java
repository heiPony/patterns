package com.pony.patterns.entity.bag;

import com.pony.patterns.entity.Bag;

/**
 * 香蕉包装
 * Created by Peter on 10/9 009.
 */
public class BananaBag implements Bag {
    @Override
    public void pack() {
        System.out.print("--香蕉使用竹萝包装");
    }
}
