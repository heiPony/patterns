package com.pony.patterns.create.fatory.fatoryMethod;

import com.pony.patterns.entity.fruit.Banana;
import com.pony.patterns.entity.Fruit;

/**
 * 工厂方法模式
 */
public class BananaFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Banana();
    }
}
