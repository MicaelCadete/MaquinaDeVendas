package com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Maquina {
    private double saldo; 
    private double totalArrecadado;
    private List<Refrigerante> refrigerantes = new ArrayList<Refrigerante>();

    public Maquina(){
        this.refrigerantes.add(new Refrigerante("Coca" , 5.0, sabor.COLA));
        this.refrigerantes.add(new Refrigerante("Sukita" , 5.0, sabor.LARANJA));
        this.refrigerantes.add(new Refrigerante("Fanta" , 5.0, sabor.UVA));
        this.refrigerantes.add(new Refrigerante("Sprinte" , 5.0, sabor.LIMAO));
        this.refrigerantes.add(new Refrigerante("Coca" , 5.0, sabor.COLA));
        this.refrigerantes.add(new Refrigerante("Coca" , 5.0, sabor.COLA));
        this.refrigerantes.add(new Refrigerante("Coca" , 5.0, sabor.COLA));
        this.refrigerantes.add(new Refrigerante("Coca" , 5.0, sabor.COLA));
        this.refrigerantes.add(new Refrigerante("Coca" , 5.0, sabor.COLA));
        this.refrigerantes.add(new Refrigerante("Coca" , 5.0, sabor.COLA));
    }

    public void adicionarRefrigerante(Refrigerante refrigerante){
        this.refrigerantes.add(refrigerante);
    }

    public void inserirDinheiro(double valor){
        this.saldo += valor;
    }
    public void sacarDinheiro(){
        totalArrecadado = 0;
        
    }

    public void comprarRefrigerante(Refrigerante refrigerante){

        if (this.getSaldo() >= refrigerante.getPreco()) {
            // Remover o valor do refrigerante do saldo do banco
            // Remover refrigerante do estoque da máquina
            // Adicionar valor de venda ao total de vendas

            this.saldo -= refrigerante.getPreco();
            this.totalArrecadado += refrigerante.getPreco();
            this.refrigerantes.remove(refrigerante);


        } else if (this.getSaldo() == 0) {
            System.out.println("Saldo insuficiente!");
            
        }
       
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTotalArrecadado() {
        return totalArrecadado;
    }

    public List<Refrigerante> getRefrigerantes() {
        return refrigerantes;
    }
}
