package com.pony.patterns.create.fatory.fatoryMethod;

import com.pony.patterns.entity.Bag;
import com.pony.patterns.entity.bag.AppleBag;

/**
 * 工厂方法模式
 */
public class AppleBagFactory implements BagFactory{
    public Bag getBag(){
        return new AppleBag();
    }
}
