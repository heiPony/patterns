package com.pony.patterns.create.fatory.abstractFactory;

import com.pony.patterns.entity.Bag;
import com.pony.patterns.entity.Fruit;

/**
 * 抽象水果工厂
 */
public abstract class AbstractFactory {

    public abstract  Fruit getFruit();

    public abstract Bag getBag();

}
