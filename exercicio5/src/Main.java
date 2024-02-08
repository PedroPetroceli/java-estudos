import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = leitura.nextInt();

        if (numero > 0){
            System.out.println("Numero Positivo");
        } else {
            System.out.println("Numero Negativo");
        }

    }
}