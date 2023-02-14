package Principal_Class;
import entities.Conta;
import java.util.Scanner;

/**
 *
 * @author Kaio
 */
public class Example2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();

        double valor = 0;

        System.out.print("Entre accont number: ");
        int numero = sc.nextInt();
        System.out.print("Enter account holder: ");
        String nome = sc.next();

        System.out.print("Is there na inital deposit (y/n)? ");
        String n = sc.next();

        System.out.println();
        //System.out.println("Accout data:");
        //System.out.println(conta);

        if (n.equalsIgnoreCase("y")) {
            System.out.print("entre initial deposit value: ");
            valor = sc.nextDouble();
            conta = new Conta(numero, nome, valor);
        }
        if (n.equalsIgnoreCase("n")) {
            System.out.println("Enter a deposit value: ");
            valor = sc.nextDouble();
            conta = new Conta(numero, nome);
            conta.remconta(valor);

            System.out.println("Updated account :");
            System.out.println(conta);
        }
        System.out.println();
        System.out.println("Updated accout data:");
        System.out.print(conta);
        System.out.println();

        System.out.println("Enter a deposit value: ");
        double f = sc.nextDouble();
        conta.addconta(valor);

        System.out.println("Updated account :");
        System.out.println(conta);
    }
}
