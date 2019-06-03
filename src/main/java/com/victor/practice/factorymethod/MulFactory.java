package com.victor.practice.factorymethod;

import com.victor.practice.simplefactory.Operation;
import com.victor.practice.simplefactory.OperationMul;

public class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
