package com.victor.practice.factorymethod;

import com.victor.practice.simplefactory.Operation;
import com.victor.practice.simplefactory.OperationAdd;

public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
