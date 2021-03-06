package views;

import controllers.CarroController;
import controllers.MotoController;
import models.Carro;
import models.Moto;
import utils.Console;
import views.contracts.IViews;

public class EntradaAutomovel implements IViews{

    @Override
    public void renderizar(){

        CarroController carroController = new CarroController();
        MotoController motoController = new MotoController();

        System.out.println("\n == ENTRADA ==\n");

        
        String modelo = Console.readString("Informe [carro/moto]: ");
        String placa = Console.readString("Informe a placa: ");
        switch (modelo) {
            case "carro":
                Carro carro = carroController.buscarPorPlaca(placa);
                if(carro != null){
                    System.out.println("Entrada REALIZADA!!");
                    }else{
                        System.out.println("Veiculo não cadastrado!!");
                    }
                break;
            case "moto":
                    Moto moto = motoController.buscarPorPlaca(placa);
                    if(moto != null){
                        System.out.println("Entrada REALIZADA!!");
                        }else{
                            System.out.println("Veiculo não cadastrado!!");
                        }
                    break;
            default:
                break;
        }

    }

}

    

