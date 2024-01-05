package org.example.lambda.predicate;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isExpensive = prod -> (prod.preco * (1 - prod.desconto)) >= 750;

        Produto produto = new Produto("Celular",1500.00,0.15);
        System.out.println(isExpensive.test(produto));
    }
}
