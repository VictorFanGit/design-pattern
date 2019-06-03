package com.victor.practice.factorymethod;

import com.victor.practice.simplefactory.Operation;
import com.victor.practice.simplefactory.OperationDiv;

public class DivFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
