package models;

import java.util.Random;

public  class Automovel {

    Random random = new Random();

    private String placa;
    private String cor;

    private int tempo = random. nextInt(60);



    public String getPlaca() {
        return placa;
    }
    public int getTempo() {
        return tempo;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        
        return
        " | Placa: "+getPlaca()+
        " | cor: "+getCor();
    }
    // public abstract boolean calc(int n, int n2);
}