package test;

import  java.util.ArrayList;
import model.Produto;

public class TestArrayListEquals{

    //Exemplo com array list generics
    public static void main(String[] args) {

        // exemplo de Array list Generics
        ArrayList<Produto> lista = new ArrayList<>();

        Produto p1 = new Produto("Celular",2000);
        Produto p2 = new Produto("Geladeira",4000);
        Produto p3 = new Produto("Nootebook",3000);
        Produto p4 = new Produto("Nootebook",3000);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        System.out.println(lista.contains(p4)); // verifica se existe algo na array | true or false
        System.out.println(lista.indexOf(p4)); // retorna em qual posição esta no array

        // verifica se o nome dos produtos é o mesmo
        if(p3.equals(p4)){
            System.out.println("Exato");
        }else {
            System.out.println("Errado");
        }
    }
}
