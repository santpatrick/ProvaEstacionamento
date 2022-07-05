package controllers;

import java.util.ArrayList;

import models.Carro;

public class CarroController {

    private static ArrayList<Carro> carros = new ArrayList<Carro>();

    public boolean cadastrar(Carro carro) {
        if (buscarPorPlaca(carro.getPlaca()) == null) {
            carros.add(carro);
            return true;
        }
        return false;
    }

    public Carro buscarPorPlaca(String placa) {
        for (Carro carroCadastrado : carros) {
            if (carroCadastrado.getPlaca().equals(placa)) {
                return carroCadastrado;
            }
        }
        return null;
    }

    public ArrayList<Carro>listar(){
        return carros;
    }


}
