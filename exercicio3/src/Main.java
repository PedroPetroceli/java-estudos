public class Main {
    public static void main(String[] args) {
        double notaUm = 5.7;
        double notaDois = 6.4;
        double media = (notaUm + notaDois) / 2;
        System.out.println(media);

        double variavelUm = 7.3;
        int variavelDois = (int)variavelUm;
        System.out.println("numero inteiro:" + variavelDois);

        char letra = 'P';
        String palavra = "edro";
        System.out.println(letra + palavra);

        double precoProduto = 3.5;
        int quantidade = 5;
        double valorTotal = quantidade * precoProduto;
        System.out.println("Valor total" + valorTotal);

        double valorEmDolares = 15;
        double conversao = valorEmDolares * 4.94;
        String mensagem = "quantidade de dolares" + valorEmDolares + "valor em reais" + conversao;
        System.out.println(mensagem);

        double precoOriginal = 150.0;
        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;
        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);
    }
}