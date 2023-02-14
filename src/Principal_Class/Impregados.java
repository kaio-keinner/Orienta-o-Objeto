/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal_Class;

import java.util.Scanner;
import entities.Salario;
import java.util.ArrayList;
import java.util.List;
import Util.util;

/**
 *
 * @author Kaio
 */
public class Impregados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Salario salario = new Salario();
        List<Salario> lista = new ArrayList<>();

        System.out.print("How many employyes will be registeres?");
        int n = sc.nextInt();

        //Parte 1: Lendo os dados
        for (int i = 0; i < n; i++) {
            System.out.println("Emploee #" + (i + 1));
            System.out.println();

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (util.temId(lista, id)) {
                System.out.println("ID informaddo já cadastrado! Informe novamente o ID: "); 
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Salary: ");
            double mony = sc.nextDouble();

            //Existe 3 formas :           
            salario = new Salario(id, name, mony);
            //lista.add(funcionario);
            //lista.add(new Funcionario(id, nome, salario));

            System.out.println();
        }
        System.out.print("Entre com o Id do Funcionario: ");
        int id = sc.nextInt();
         Salario func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(func ==null){
            System.out.println("This id dows not exist! ");
        }else{
            System.out.print("Enter the percentage: ");
            double porcentagem = sc.nextDouble();
            func.aulmentarSalario(porcentagem);
        }
        System.out.println();
        
        System.out.println("List of employees:");
        System.out.println(salario);
    }
}
