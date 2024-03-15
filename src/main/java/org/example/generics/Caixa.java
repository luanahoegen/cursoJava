package org.example.generics;

public class Caixa<T> {
    //Tipo mais genérico
    private T coisa;

    //Basicamente get and setter
    public void guardar(T coisa) {
        this.coisa = coisa;
    }

    public T abrir() {
        return coisa;
    }
}
