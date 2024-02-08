public class Produto implements Vendavel{
    @Override
    public void calcularPrecoTotal(double qtd, double preco, double desconto) {
        double precoTotal = (qtd * preco) - desconto;
        System.out.println("Preço final do produto: " + precoTotal);
    }
}
