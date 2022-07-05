package views;

import utils.Console;

public class Principal {
    public static void main(String[] args) {
        
        int opcao = 0;
        do{
            System.out.println("\n\n\n\t  ====  Estacionamento  ==== \n");
            System.out.println("\t| 0 - Sair\t\t");
            System.out.println("\t|=======================");
            System.out.println("\t| 1 - Cadastrar automóvel");
            System.out.println("\t| 2 - Entrada do automóvel");
            System.out.println("\t| 3 - Saída do automóvel");
            System.out.println("\t| 4 - Listar carros");
            System.out.println("\t| 5 - Listar motos\n");

            opcao = Console.readInt("\t Digite uma opção: ");

            switch (opcao) {
                case 1:
                    CadastrarAutomovel cadastrarAutomovel = new CadastrarAutomovel();
                    cadastrarAutomovel.renderizar();
                    break;
                case 2:
                    EntradaAutomovel entradaAutomovel =  new EntradaAutomovel();
                    entradaAutomovel.renderizar();
                    break;
                case 3:
                    Saida saida = new Saida();
                    saida.renderizar();
                case 4:
                    ListarCarros listarCarros = new ListarCarros();
                    listarCarros.renderizar();
                    break;
                case 5:
                    ListarMotos listarMotos = new ListarMotos();
                    listarMotos.renderizar();
                    break;
                default:
                    System.out.println("\t| *Opcão Invalida!!* |");

                    break;
            }
        } while(opcao != 0);
    }
}
