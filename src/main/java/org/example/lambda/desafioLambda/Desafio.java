package org.example.lambda.desafioLambda;

import java.math.BigDecimal;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto produtoTeste = new Produto("Celular", 4000.00,0.15);
        Function<Produto, Double> valorDesconto = produto -> produto.preco - (produto.preco * produto.desconto);
        System.out.println("O valor com desconto é: " + valorDesconto.apply(produtoTeste));

        UnaryOperator<Double> imposto = preco -> preco >= 2500 ? preco + (preco * 0.085) : preco;
        System.out.println("Valor total com o imposto: " + valorDesconto.andThen(imposto).apply(produtoTeste));

        UnaryOperator<Double> frete = valorComImposto -> valorComImposto >= 3000 ? valorComImposto + 100 : valorComImposto + 50;
        Double valorTotalProduto = valorDesconto.andThen(imposto).andThen(frete).apply(produtoTeste);
        BigDecimal valorTotalFormatado = BigDecimal.valueOf(valorTotalProduto);

        System.out.println("O valor total do produto: R$" + valorTotalFormatado.setScale(2));
    }
}