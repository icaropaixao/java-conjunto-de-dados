package model;

public class CamisasDeTime {

    private final String time;
    private final int numero;

    // construtor
    public CamisasDeTime(String time, int numero){
        this.time = time;
        this.numero = numero;
    }

    // get
    public String getTime(){
        return time;
    }
    public double getNumero(){
        return numero;
    }

}
