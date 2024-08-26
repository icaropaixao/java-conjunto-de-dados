package test;

import model.CamisasDeTime;

public class TestCamisasDeTime {

    public static void main(String[] args) {

        CamisasDeTime[] camisas = new CamisasDeTime[2];

        camisas[0] = new CamisasDeTime("Real madrid",7);
        camisas[1] = new CamisasDeTime("Flamengo",10);

        for (int i = 0; i< camisas.length; i++){

            System.out.println("Camisas:" + camisas[i].getTime() + ", Numero: " + camisas[i].getNumero() );

        }

    }
}
