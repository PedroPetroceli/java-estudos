import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um numero: ");
        int numero = scanner.nextInt();
        int fatorial = numero*(numero-1)*(numero-2);
        System.out.println("Fatorial do numero " + numero + " é igual a: " + fatorial);
    }
}
