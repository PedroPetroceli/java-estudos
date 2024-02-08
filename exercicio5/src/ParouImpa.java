import java.util.Scanner;

public class ParouImpa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um numero: ");
        double numero = scanner.nextDouble();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else{
            System.out.println("Impar");
        }


    }
}
