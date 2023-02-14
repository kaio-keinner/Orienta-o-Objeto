/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import entities.Salario;
import java.util.List;
/**
 *
 * @author Kaio
 */
public class util {
    public static boolean temId(List<Salario> lista, int id){
        Salario salario = lista.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
        return salario != null;
    }
}
