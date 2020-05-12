package com.pony.patterns.create.fatory.fatoryMethod;

import com.pony.patterns.entity.Fruit;
import com.pony.patterns.entity.fruit.Orange;

/**
 * 工厂方法模式
 */
public class OrangeFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Orange("Peter",80);
    }
}
