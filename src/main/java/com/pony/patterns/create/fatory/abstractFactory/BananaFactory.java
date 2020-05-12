package com.pony.patterns.create.fatory.abstractFactory;

import com.pony.patterns.entity.Bag;
import com.pony.patterns.entity.Fruit;
import com.pony.patterns.entity.bag.BananaBag;
import com.pony.patterns.entity.fruit.Banana;

/**
 * 水果工厂
 */
public class BananaFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
