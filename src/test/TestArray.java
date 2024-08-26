package test;

import model.Produto;

public class TestArray {

    public static void main(String[] args) {

        // exemplo de array       |0|1|2
        double[] precos = new double[3];

        precos[2] = 12;
        precos[0] = 22000;
        precos[1] = 500000;

        // FOR em arrays
        for (int i = 0; i < precos.length;i++){
            // imprime todos os Arrays
            System.out.println(precos[i]);
        }

    }
}
