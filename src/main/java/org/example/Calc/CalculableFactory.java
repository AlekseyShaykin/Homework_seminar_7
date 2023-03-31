package org.example.Calc;

import java.util.ArrayList;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(String primary) {
        return new Calculator(primary);
    }
}
