/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Kaio
 */
public class Salario {
    private int id;
    private String name;
    private double mony;
    
    //Construtor vazio
    public Salario(){}

    //Construtor cheio
    public Salario(int id, String name, double mony) {
        this.id = id;
        this.name = name;
        this.mony = mony;
    }
    
    //Métodos getters e setters
    public double getMony() {
        return mony;
    }

    /*public void setSalary(double salary) {
        this.salary = salary;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   public void aulmentarSalario(Double porcentagem){
       mony += mony * porcentagem/100.0;
   }
    public String toString(){
        return id+", "+name+", "+String.format("%.2f", mony);
    }
}
