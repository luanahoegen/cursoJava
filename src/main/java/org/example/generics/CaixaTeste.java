package org.example.generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Abrindo a porta hehe");

        System.out.println(caixaA.abrir());

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.14);

        System.out.println(caixaB.abrir());
    }
}
