package controllers;

import java.util.ArrayList;

import models.Moto;

public class MotoController {

    private static ArrayList<Moto> motos = new ArrayList<Moto>();

    public boolean cadastrar(Moto moto) {
        if (buscarPorPlaca(moto.getPlaca()) == null) {
            motos.add(moto);
            return true;
        }
        return false;
    }

    public Moto buscarPorPlaca(String placa) {
        for (Moto carroCadastrado : motos) {
            if (carroCadastrado.getPlaca().equals(placa)) {
                return carroCadastrado;
            }
        }
        return null;
    }

    public ArrayList<Moto>listar(){
        return motos;
    }

}