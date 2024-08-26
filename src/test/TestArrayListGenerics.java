package test;

import  java.util.ArrayList;
import model.Produto;

public class TestArrayListGenerics {

    //Exemplo com array list generics
    public static void main(String[] args) {

        // exemplo de Array list Generics
        ArrayList<Produto> lista = new ArrayList<>();

        Produto p1 = new Produto("Celular",2000);
        Produto p2 = new Produto("Geladeira",4000);
        Produto p3 = new Produto("Nootebook",3000);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        Produto celular = lista.get(0);
        System.out.println(celular.getNome());

        lista.remove(2); // remove o indice desejado
        lista.clear(); // remove o array inteiro


        //exemplo para pegar o tamanho do arrayList
        System.out.println("Tamanho do array: " + lista.size());

        // verifica se o array esta vazio com True ou False
        System.out.println(lista.isEmpty());
        System.out.println(lista);

        lista.contains(""); // verifica se existe dentro do array ou não

        lista.indexOf(""); // verifica qual é o indice do objeto

    }
}
