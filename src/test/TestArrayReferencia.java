package test;
import model.Produto;

public class TestArrayReferencia {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[3];

        produtos[0] = new Produto("placa RTX",3000);
        produtos[1] = new Produto("Iphone",5050);
        produtos[2] = new Produto("Acer nitro",4000);

        for(int i = 0; i < produtos.length; i++){
            System.out.println("Produto: " + produtos[i].getNome() + ", Preço: " + produtos[i].getPreco());

        }


    }
}
