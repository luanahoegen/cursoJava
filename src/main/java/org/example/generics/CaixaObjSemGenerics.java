package org.example.generics;

public class CaixaObjSemGenerics {

    //Tipo mais genérico
    private Object coisa;

    //Basicamente get and setter
    public void guardar(Object coisa) {
        this.coisa = coisa;
    }

    public Object abrir() {
        return coisa;
    }
}