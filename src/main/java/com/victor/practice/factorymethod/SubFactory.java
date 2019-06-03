package com.victor.practice.factorymethod;

import com.victor.practice.simplefactory.Operation;
import com.victor.practice.simplefactory.OperationSub;

public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
