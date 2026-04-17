package com.joaomonteiro.model;

public class Produto {
    private String nome;
    private double preco;
    private int qInicial;
    private int qVendida = 0;

    public Produto(){

    }

    public void exibirDados(){
        System.out.println("\n--- Detalhes do Produto ---\n");
        System.out.printf("Produto: %s\n", nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.printf("Estoque antes da Venda: %d unidades\n", qInicial);
        System.out.printf("Venda realizada: %d unidades\n", qVendida);
        System.out.printf("Estoque atualizado: %d unidades\n", qInicial - qVendida);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getqInicial() {
        return qInicial;
    }

    public void setqInicial(int qInicial) {
        this.qInicial = qInicial;
    }

    public int getqVendida() {
        return qVendida;
    }

    public void setqVendida(int qVendida) {
        this.qVendida = qVendida;
    }


}
