package com.joaomonteiro.apps;

import com.joaomonteiro.model.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto p1 = new Produto();

        System.out.println("Digite o nome do produto 1: ");
        p1.setNome(sc.nextLine());
        System.out.println("Digite o preço do produto 1: ");
        p1.setPreco(sc.nextDouble());
        System.out.println("Digite a quantidade inicial do produto 1: ");
        p1.setqInicial(sc.nextInt());
        sc.nextLine(); // Limpar o buffer do scanner
        p1.exibirDados();


        System.out.println("\n--- Realizando Venda ---\n");
        System.out.println("Quanto você deseja vender do produto 1? ");
        if (p1.getqVendida() + sc.nextInt() > p1.getqInicial()) {
            System.out.println("Quantidade insuficiente em estoque para realizar a venda.");
        } else {
            p1.setqVendida(sc.nextInt());
            p1.exibirDados();
        }














    }
}
