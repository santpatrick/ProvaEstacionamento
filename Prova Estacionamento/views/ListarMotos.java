package views;


import controllers.MotoController;
import models.Moto;
import views.contracts.IViews;

public class ListarMotos implements IViews{

    MotoController motoController = new MotoController();   

    @Override
    public void renderizar(){
        System.out.println("\n == LISTAGEM MOTOS == \n");
        for(Moto motoCadastrado : motoController.listar()){
            System.out.print(motoCadastrado);
        }
    }
}