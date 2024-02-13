import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Pedro", 27);
        Pessoa pessoa2 = new Pessoa("Juliana", 30);
        Pessoa pessoa3 = new Pessoa("Bernardo", 5);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira Pessoa da lista: " + listaDePessoas.get(0));
        System.out.println("Lista de Pessoas");
        for (Pessoa pessoa: listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
