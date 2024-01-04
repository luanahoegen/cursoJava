package org.example.lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        //int -> Double (não permitido)
        //double -> Double
        BinaryOperator<Double> calc = (x,y) -> {
            return x + y;
        };
        System.out.println(calc.apply(4.0,4.0));
        calc = (x,y) -> x * y;
        System.out.println(calc.apply(4.0,4.0));
    }
}