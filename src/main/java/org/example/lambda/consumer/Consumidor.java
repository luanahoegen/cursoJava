package org.example.lambda.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        //Não está retornando nada apenas imprimindo o nome
        Consumer<Pessoa> imprimirPessoa = pessoa -> System.out.println(pessoa.nome + ":)");

        Pessoa luana = new Pessoa("Luana",20);
        Pessoa eduardo = new Pessoa("Eduardo",24);
        imprimirPessoa.accept(luana);

        List<Pessoa> pessoas = Arrays.asList(luana,eduardo);
        //Não foi preciso chamar o accept pois o foreach já recebe um Consumer
        pessoas.forEach(imprimirPessoa);
        pessoas.forEach(pessoa -> System.out.println(pessoa.idade));
    }
}
