package test;

import model.Produto;

import java.util.ArrayList;
import java.util.Collections;

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

        Collections.sort(produtos);
        // é necessario sobecrever a classe Produto com compareblee para funcionar
        for (Produto produto: produtos) {
            System.out.println("Produto: "+ produto.getNome() + ", Preço: " + produto.getPreco());
        }

    }
}
