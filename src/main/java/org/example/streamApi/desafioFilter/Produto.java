package org.example.streamApi.desafioFilter;

public class Produto {
    final double preco;
    final String nomeProduto;
    final double desconto;
    final boolean freteGratis;

    public Produto(double preco, String nomeProduto, double desconto, boolean freteGratis) {
        this.preco = preco;
        this.nomeProduto = nomeProduto;
        this.desconto = desconto;
        this.freteGratis = freteGratis;
    }
}
