import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o numerador");
        int numerador = scanner.nextInt();
        System.out.println("Escolha o denominador");
        int denominador = scanner.nextInt();

        try {
            int resultado = numerador / denominador;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Erro: Divisão por zero. Verifique se o número é válido.");

        }
    }
}
