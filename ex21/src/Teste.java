public class Teste {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Servico servico = new Servico();
        produto.calcularPrecoTotal(2,50.5,20);
        servico.calcularPrecoTotal(15,3.75,0.56);
    }
}
