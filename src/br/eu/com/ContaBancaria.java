package br.eu.com;

public class ContaBancaria {
   private String nome;
   private double saldo;

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public ContaBancaria(String nome, double saldo){
       this.nome = nome;
       this.saldo = saldo;
   }
}



