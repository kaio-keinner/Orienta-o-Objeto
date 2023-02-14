package Class_unicas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Kaio
 */
public class Lista_PT_2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");
        
        //numero de elementos na lista
        System.out.println(list.size());
        
        //imprimir a lista
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println();

        System.out.println("================================");
        
        //remover 1 elemento da lista que começa com "M";
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }
    }
}
