package org.example.streamApi.DesafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        Produto celular = new Produto(1700,"Celular",0.15,false);
        Produto notbook = new Produto(3000,"Notbook",0.30,true);
        List<Produto> produtos = Arrays.asList(celular,notbook);
        Predicate<Produto> freteProduto = frete -> frete.freteGratis;
        Predicate<Produto> descontoPromocao = valor -> valor.preco >= 0.30;
        Function<Produto, String> print = produto -> produto.nomeProduto + produto.preco + "Super Promoção";

        produtos.stream().filter(freteProduto).filter(descontoPromocao).map(print).forEach(System.out::println);
    }
}
