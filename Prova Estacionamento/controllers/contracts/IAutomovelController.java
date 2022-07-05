package controllers.contracts;

import java.util.ArrayList;

import models.Automovel;

public interface IAutomovelController {
    
    boolean cadastrar(Automovel automovel);

    Automovel buscarPorPlaca(String placa);

    ArrayList<Automovel> listar();

}
