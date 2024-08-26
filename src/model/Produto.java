package model;

public class Produto {

    // exemplo
    private  String nome;
    private double preco;

    // construtor
    public Produto(String nome, double preco){
        this.preco = preco;
        this.nome = nome;
    }

    // get
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
}
