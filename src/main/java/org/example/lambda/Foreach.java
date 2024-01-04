package org.example.lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Luaninha","Cachorrinha","Nelson");

        //Foreach "tradicional":
        for (String nome : aprovados){
            System.out.println("Os alunos aprovados foram: " + nome);
        }

        //Utilizando o lambda:
        aprovados.forEach((nome) -> {
            System.out.println("Nome dos alunos aprovados: " + nome);
        });

        //Utilizando o lambda, chamando a função imprimirNomes:
        aprovados.forEach((nome) -> imprimirNomes(nome));
    }

    static void imprimirNomes(String nome){
        System.out.println("Oi! " + nome);
    }
}