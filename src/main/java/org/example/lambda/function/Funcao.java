package org.example.lambda.function;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer,String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
        System.out.println(parOuImpar.apply(5));

        Function<String,String> resultado = valor -> "O resultado é " + valor;

        String resultadoFinal = parOuImpar.apply(8);
        System.out.println(resultado.apply(resultadoFinal));

        //E então
        System.out.println(parOuImpar.andThen(resultado).apply(1));
    }
}