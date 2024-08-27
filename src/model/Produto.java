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

    // Equals, sobescrevendo o metodo para que faça a comparação pelo nome e não pela referencia de memoria

    @Override
    public boolean equals(Object ref) {
        Produto produto = (Produto) ref;

        if(this.nome != produto.getNome()){
            return false;
        }else {
            return true;
        }
    }
}
