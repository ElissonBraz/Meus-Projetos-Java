import java.util.Scanner;

import classes.Carros;

public class ProgramaAlug {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int opcao = 0;

        Carros carros = new Carros(0);


        do {

        carros.inicioPrograma();
        opcao = ent.nextInt();
        int numero = 0;
        int dias = 0;
        double valor = 0.0;
        double valorTotal = 0.0;

        if (opcao == 0) {
            carros.portifolio();
            
        } if (opcao == 1) {
            carros.portifolio();
            System.out.println("====================");
            System.out.println("escolha o codigo do carro:");
            numero = ent.nextInt();
            System.out.println("por quantos dias você deseja alugar?");
            dias = ent.nextInt();

            switch (numero) {
                case 0:
                System.out.println("Você escolheu Chevrolet Tracker por "+ dias );
                valor = 120;
                valorTotal = valor * dias;
                System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                    
                    break;
             case 1:
                System.out.println("Você escolheu Chevrolet Onix por "+ dias );
                valor = 90;
                valorTotal = valor * dias;
               System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                    
                    break;
                     case 2:
                System.out.println("Você escolheu Chevrolet Spin por "+ dias );
                valor = 150;
                valorTotal = valor * dias;
              System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                    
                    break;
                     case 3:
                System.out.println("Você escolheu Hyundai HB20 por "+ dias );
                valor = 85;
                valorTotal = valor * dias;
               System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                    
                    break;
                    case 4:
                System.out.println("Você escolheu Hyundai Tucson por "+ dias );
                valor = 120;
                valorTotal = valor * dias;
                System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                   
                    break;
                    case 5:
                System.out.println("Você escolheu Fiat Uno por "+ dias );
                valor = 60;
                valorTotal = valor * dias;
               System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                   
                    break;
                    case 6:
                System.out.println("Você escolheu Fiat Mobi por "+ dias );
                valor = 70;
                valorTotal = valor * dias;
              System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                    
                    break;
                    case 7:
                System.out.println("Você escolheu Fiat Pulse por "+ dias );
                valor = 130;
                valorTotal = valor * dias;
              System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                    
                    break;
                   
                default:
                System.out.println("Opção não encontrada");
            }

            System.out.println("0 - Sim| 1 - Não");
        }
            
         if (opcao == 2) {
            
        } else {
            
        }

        } while (opcao != 3);
        ent.close();

    }
}
