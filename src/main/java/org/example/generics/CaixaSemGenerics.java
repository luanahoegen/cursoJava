package org.example.generics;

public class CaixaSemGenerics {
    public static void main(String[] args) {
        CaixaObjSemGenerics caixaA = new CaixaObjSemGenerics();
        caixaA.guardar(2.6); //double -> Double
        //Será necessário um CAST
        Double coisa = (Double) caixaA.abrir();
        System.out.println(coisa);

        CaixaObjSemGenerics caixaB = new CaixaObjSemGenerics();
        caixaB.guardar("Olá"); //string -> String
        //Será necessário um CAST
        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);
    }
}
