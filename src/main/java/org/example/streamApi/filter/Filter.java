package org.example.streamApi.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Eduardo",7.8);
        Aluno aluno2 = new Aluno("Luana", 5.8);
        Aluno aluno3 = new Aluno("Nelson", 9.8);
        Aluno aluno4 = new Aluno("Cachorrinha", 6.8);
        Aluno aluno5 = new Aluno("Ana", 7.1);
        Aluno aluno6 = new Aluno("Ariana", 8.8);

        //Utilizando Predicate que retorna true or false
        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno,String> saudacao = aluno -> "Parabéns aluno: " + aluno.nome;

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);
        alunos.stream().filter(aprovado).map(saudacao).forEach(System.out::println);
    }
}