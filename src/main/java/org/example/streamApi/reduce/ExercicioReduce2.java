package org.example.streamApi.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExercicioReduce2 {
    public static void main(String[] args) {
        Aluno luana = new Aluno("Luana", 8.5);
        Aluno eduardo = new Aluno("Eduardo",9.0);
        Aluno nelson = new Aluno("Nelson", 5.0);

        List<Aluno> alunos = Arrays.asList(luana,eduardo,nelson);

        Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
        Function<Aluno,Double> notasAlunos = aluno -> aluno.nota;
        BinaryOperator<Double> somatorio  = (a, b) -> a + b;
        alunos.stream().filter(aprovado).map(notasAlunos).reduce(somatorio).ifPresent(System.out::println);
    }
}