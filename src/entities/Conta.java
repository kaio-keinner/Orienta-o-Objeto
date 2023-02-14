/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Kaio
 */
public class Conta {
    public int numero;
    public String nome;
    private double valor;

public Conta(){}

    public Conta(int numero, String nome, double valor) {
        this.numero = numero;
        this.nome = nome;
        this.valor = valor;
    }

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }
    public void addconta(double valor){
        this.valor+=valor;
    }
    public void remconta(double valor){
        this.valor = valor-3;
    }
    /*public void valorf(double valor){
        this.valor += valor;
    }*/
    public String toString(){
        return numero
                +", "
                +"Holder: "+nome+
                String.format(", %.2f",valor);
    }

}
