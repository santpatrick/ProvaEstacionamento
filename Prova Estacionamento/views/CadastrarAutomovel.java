package views;

import controllers.CarroController;
import controllers.MotoController;
import models.Carro;
import models.Moto;
import utils.Console;
import views.contracts.IViews;

public class CadastrarAutomovel implements IViews{
    
    @Override
    public void renderizar(){
        
        Carro carro = new Carro();
        CarroController carroController = new CarroController();

        Moto moto=new Moto();
        MotoController motoController = new MotoController();

        System.out.println("\n == CADASTRO DE AUTOMÓVEL == \n");
    
        String modelo = Console.readString("Informe [carro/moto]: ");
            switch (modelo) {
                case "carro":
                    carro.setModelo(modelo);
                    carro.setPlaca(Console.readString("Informe a placa:"));
                    carro.setCor(Console.readString("Informe a cor: "));
                    if(carroController.cadastrar(carro)){
                        System.out.println("\n Cadastrado com SUCESSO !! \n");
                    }else{
                        System.out.println("\n Ja cadastrado !! \n");
                    }
                    break;
                    case "moto":
                    moto.setModelo(modelo);
                    moto.setPlaca(Console.readString("Informe a placa:"));
                    moto.setCor(Console.readString("Informe a cor: "));
                    if(motoController.cadastrar(moto)){
                        System.out.println("\n Cadastrado com SUCESSO !! \n");
                    }else{
                        System.out.println("\n Placa Ja cadastrada !! \n");
                    }
                default:
                    break;
            }




    }
}
