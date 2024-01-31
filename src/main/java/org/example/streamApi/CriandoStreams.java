package org.example.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java ","PHP","JS\n");
        langs.forEach(print);

        //Criando uma stream a partir de um array:
        String[] maisLangs = {"Python ", "Go\n"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);

        List<String> outrasLangs = Arrays.asList("C", "PHP");
        outrasLangs.stream().forEach(print);
    }
}
