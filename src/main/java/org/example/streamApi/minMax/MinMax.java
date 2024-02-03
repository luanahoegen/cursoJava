package org.example.streamApi.minMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Aluno luana = new Aluno("Luana", 5.5);
        Aluno eduardo = new Aluno("Eduardo", 7.5);
        Aluno nelson = new Aluno("Nelson", 3.5);

        List<Aluno> alunos = Arrays.asList(luana, eduardo, nelson);

        //Critério de comparação irá ser a melhor nota
        Comparator<Aluno> melhorNota = (aluno1, aluno2)  -> {
          if (aluno1.nota > aluno2.nota) return 1;
          if (aluno1.nota < aluno2.nota) return -1;
          return 0;
        };
        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
    }
}