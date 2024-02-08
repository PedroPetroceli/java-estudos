import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um numero: ");
        int numero = scanner.nextInt();

        System.out.println("Escolha um numero: ");
        int numeroDois = scanner.nextInt();

        if (numero == numeroDois) {
            System.out.println("São iguais");
        }  else if (numero > numeroDois) {
            System.out.println("O primeiro numero é maior");
        } else{
            System.out.println("O segundo numero é maior");
        }

    }
}
