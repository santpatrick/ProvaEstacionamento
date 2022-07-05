package views;

import controllers.CarroController;
import controllers.MotoController;
import models.Carro;
import models.Moto;
import utils.Calculos;
import utils.Console;
import views.contracts.IViews;

public class Saida implements IViews{
    
    @Override
    public void renderizar(){

        Calculos calculo = new Calculos();
        CarroController carroController = new CarroController();
        MotoController motoController = new MotoController();

        System.out.println("\n == SAIDA ==\n");

        String modelo = Console.readString("Informe [carro/moto]: ");
        String placa = Console.readString("Informe a placa: ");
        switch (modelo) {
            case "carro":
                Carro carro = carroController.buscarPorPlaca(placa);

                System.out.println("\n DADOS \n");
                int tempoC = carro.getTempo(); 
    
                int valorC = calculo.calcular(tempoC, 5);
    
                System.out.println("\n DADOS \n");
                System.out.println("\n Tempo: "+tempoC);
                System.out.println("\n Tempo: "+valorC);
                break;
            case "moto":
                    Moto moto = motoController.buscarPorPlaca(placa);

                    System.out.println("\n DADOS \n");
                    int tempoM = moto.getTempo(); 
        
                    int valorM = calculo.calcular(tempoM, 5);
        
                    System.out.println("\n DADOS \n");
                    System.out.println("\n Tempo: "+tempoM);
                    System.out.println("\n Tempo: "+valorM);
                    break;
            default:
                break;
        }
    }
}
