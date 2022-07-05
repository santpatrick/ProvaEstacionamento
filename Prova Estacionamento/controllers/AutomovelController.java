package controllers;

import java.util.ArrayList;

import models.Automovel;

public class AutomovelController {
    
    private static ArrayList<Automovel> automoveis = new ArrayList<Automovel>();

    public boolean cadastrar(Automovel automovel) {
        if (buscarPorPlaca(automovel.getPlaca()) == null) {
            automoveis.add(automovel);
            return true;
        }
        return false;
    }




    public Automovel buscarPorPlaca(String placa) {
        for (Automovel automovelCadastrado : automoveis) {
            if (automovelCadastrado.getPlaca().equals(placa)) {
                return automovelCadastrado;
            }
        }
        return null;
    }


    public ArrayList<Automovel> listar() {
        return automoveis;
    }

    // public String verModelo(String veiculo){


    //     return veiculo;

    // }
}
