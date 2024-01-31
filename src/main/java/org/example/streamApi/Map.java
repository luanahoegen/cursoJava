package org.example.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("Adidas ", "Nike ", "Puma");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        //Irei receber uma String e retornar uma String
        UnaryOperator<String> letraMaiuscula = letra -> letra.toUpperCase();
        //Irá retornar a primeira letra
        UnaryOperator<String> primeiraLetra = letra -> letra.charAt(0) + "";
        UnaryOperator<String> grito = letra ->  letra + "!!!";

        marcas.stream().map(letraMaiuscula).map(primeiraLetra).map(grito).forEach(print);
    }
}