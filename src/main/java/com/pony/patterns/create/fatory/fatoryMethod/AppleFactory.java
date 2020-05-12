package com.pony.patterns.create.fatory.fatoryMethod;

import com.pony.patterns.entity.fruit.Apple;
import com.pony.patterns.entity.Fruit;

/**
 * 工厂方法模式
 */
public class AppleFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Apple();
    }
}
