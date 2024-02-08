public class Main {
    public static void main(String[] args) {
        double temperaturaEmCelsiu = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsiu * 1.8) + 32;
        String mensagem = String.format("A temperatura %f celsius, nos retorna a  temperatura %f fahrenheit",temperaturaEmCelsiu, temperaturaEmFahrenheit);
        System.out.println(mensagem);
    }
}