package org.example.lambda.binaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1 , n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(5.0,6.0));

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
        //Utilizando composição de funções
        System.out.println(media.andThen(conceito).apply(5.1,9.7));

        BiFunction<Double,Double,String> resultado = (n1,n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado.apply(7.0,5.5));
    }
}
