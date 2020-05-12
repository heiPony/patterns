package com.pony.patterns.create.fatory.abstractFactory;

import com.pony.patterns.entity.Bag;
import com.pony.patterns.entity.Fruit;
import com.pony.patterns.entity.bag.OrangeBag;
import com.pony.patterns.entity.fruit.Orange;

/**
 * 水果工厂
 */
public class OrangeFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Orange("Peter",50);
    }

    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
