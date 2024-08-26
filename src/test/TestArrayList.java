package test;

import  java.util.ArrayList;
import model.Produto;

public class TestArrayList {

    public static void main(String[] args) {

        // exemplo de Array list
        ArrayList lista = new ArrayList();

        Produto p1 = new Produto("Celular",2000);
        Produto p2 = new Produto("Geladeira",4000);
        Produto p3 = new Produto("Nootebook",3000);

        // list .ADD para adicionar ao Array list
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        Produto celular = (Produto) lista.get(0);
        System.out.println(celular.getNome());



    }
}
