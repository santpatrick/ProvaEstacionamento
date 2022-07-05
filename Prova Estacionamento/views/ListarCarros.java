package views;

import controllers.AutomovelController;
import controllers.CarroController;
import models.Carro;
import views.contracts.IViews;

public class ListarCarros implements IViews{

    CarroController carroController = new CarroController();
    AutomovelController automovelController = new AutomovelController();   

    @Override
    public void renderizar(){
        System.out.println("\n == LISTAGEM CARROS == \n");
        for(Carro carroCadastrado : carroController.listar()){
            System.out.print(carroCadastrado);
        }
    }
}
