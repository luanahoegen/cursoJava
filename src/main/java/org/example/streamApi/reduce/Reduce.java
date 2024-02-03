package org.example.streamApi.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> nums  = Arrays.asList(1,2,4,5,6,7);
        BinaryOperator<Integer> soma = (acumulador,n) -> acumulador + n;
        //int total = nums.stream().reduce(soma).get();
        Integer total2 = nums.stream().reduce(100,soma);
        System.out.println(total2);

        //Resultado foi um Opcional<Integer>
        nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);
    }
}