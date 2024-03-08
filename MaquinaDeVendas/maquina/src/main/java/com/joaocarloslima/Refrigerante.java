package com.joaocarloslima;

public class Refrigerante {
    private String nome;
    private double preco;
    private sabor sabor;

    public Refrigerante(String nome, double preco, sabor sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }    

    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }


    public sabor getSabor() {
        return sabor;
    }

}
