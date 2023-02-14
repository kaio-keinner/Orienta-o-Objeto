
package Principal_Class;
import java.util.Scanner;
import entities.Aluguel;
/**
 *
 * @author Kaio
 */
public class Clientes {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Aluguel aluguel = new Aluguel();
        
        System.out.print("How many rooms will be rentend? ");
        int n = sc.nextInt();
        System.out.println();
        
        Aluguel matriz []= new Aluguel[10];
        
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Rent #"+(1+i));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Room :");
            int room = sc.nextInt();
            /*if(matriz[room]!=null){
                System.out.println("rent alugado ");
                System.out.println("escolha um novo quarto: ");
                int roomm = sc.nextInt();
            }*/
            matriz[room] = new Aluguel(name, email);
        }
        System.out.println("--------------------Busy rooms-----------------------");
        //System.out.println(aluguel);
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if(matriz[i] != null){
                System.out.println(i +": "+matriz[i]);
            }
        }
        sc.close();
    }
}
