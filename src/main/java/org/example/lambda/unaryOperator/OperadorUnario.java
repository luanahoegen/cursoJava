package org.example.lambda.unaryOperator;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        //Pega o valor 0 e adiciona mais dois
        int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
        System.out.println(resultado1);

        //Compose é o contrário do andThen
        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
        System.out.println(resultado2);
    }
}
