package models;

public class Carro extends Automovel {
    
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {

        return "\n | Modelo: "+getModelo()+
        " | Placa: "+getPlaca()+
        " | cor: "+getCor();
    }


}
