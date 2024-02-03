package org.example.streamApi.match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno luana = new Aluno("Luana", 8.5);
        Aluno eduardo = new Aluno("Eduardo",9.0);
        Aluno nelson = new Aluno("Nelson", 5.0);

        List<Aluno> alunos = Arrays.asList(luana,eduardo,nelson);
        Predicate<Aluno> aprovado = a -> a.nota >= 7.0;

        //Todos os alunos foram aprovados?
        System.out.println(alunos.stream().allMatch(aprovado));
        //Tem algum aluno aprovado?
        System.out.println(alunos.stream().anyMatch(aprovado));
        //Nenhum aluno foi aprovado?
        System.out.println(alunos.stream().noneMatch(aprovado));
    }
}