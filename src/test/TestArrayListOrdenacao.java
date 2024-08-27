package test;

import model.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestArrayListOrdenacao {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ícaro");
        nomes.add("Anna");
        nomes.add("Vanessa");
        nomes.add("Manu");

        /*
        formas de percorrer o array
        for(int i = 0; i < nomes.size(); i++){

            System.out.println(nomes.get(i));
        }
*/

        Collections.sort(nomes); // ordenar por ordem alfabética

        // listando o Array inteiro
        for(String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("-------------------------");

        // orenando produtos pelo nome exemplos
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("Armario",2000);
        Produto p2 = new Produto("Geladeira",4000);
        Produto p3 = new Produto("Nootebook",3000);
        Produto p4 = new Produto("Rider slx",300);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        Collections.sort(produtos); // ordena os produtos pelo Nome
        produtos.sort(new PrecoProdutoComparator()); // ordena os produtos pelo Preço

        for (Produto produto: produtos) {
            System.out.println("Produto: "+ produto.getNome() + ", Preço: " + produto.getPreco());
        }

    }
}

// Classe ordenar os produtos pelo preço
class PrecoProdutoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto produto1, Produto produto2) {
        // fazendo um "CASTING" no produto para retornar um int
        return (int ) (produto1.getPreco() - produto2.getPreco());
    }

}
