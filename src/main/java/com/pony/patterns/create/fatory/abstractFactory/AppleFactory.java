package com.pony.patterns.create.fatory.abstractFactory;

import com.pony.patterns.entity.Bag;
import com.pony.patterns.entity.Fruit;
import com.pony.patterns.entity.bag.AppleBag;
import com.pony.patterns.entity.fruit.Apple;

/**
 * 水果工厂
 */
public class AppleFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
