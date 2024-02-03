package org.example.streamApi.desafioMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8 ,9);
        Function<Integer,String> numeroBinario = n -> Integer.toBinaryString(n);
        UnaryOperator<String> reverterString = binarios -> new StringBuilder(binarios).reverse().toString();

        numeros.stream().map(numeroBinario).map(reverterString).forEach(print);
    }
}