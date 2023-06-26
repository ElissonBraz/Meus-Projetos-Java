package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import classes.Carros;
import classes.NomeCarros;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);

        NomeCarros [] veiculos = new NomeCarros[8];
        Carros carros = new Carros(0);
        int opcao = 0, numero = 0, dias = 0;
        double valorTotal = 0.0;

        String tracker = "Chevrolet Tracker", onix = "Chevrolet Onix",spin = "Chevrolet Spin", 
        hb20 = "Hyundai HB20", tucson =  "Hyundai Tucson", uno =  "Fiat Uno" , mobi = "Fiat Mobi" ,
        pulse =  "Fiat Pulse";
        double rolet1 = 120.0, rolet2 = 90.0, rolet3 = 150.0, dai1 = 85.0, dai2 = 120.0, fiat1 = 60.0,
        fiat2 =  70.0, fiat3 =  130.0;

        veiculos[0] = new NomeCarros(tracker, rolet1);
        veiculos[1] = new NomeCarros(onix, rolet2);
        veiculos[2] = new NomeCarros(spin, rolet3);
        veiculos[3] = new NomeCarros(hb20, dai1);
        veiculos[4] = new NomeCarros(tucson, dai2);
        veiculos[5] = new NomeCarros(uno, fiat1);
        veiculos[6] = new NomeCarros(mobi, fiat2);
        veiculos[7] = new NomeCarros(pulse, fiat3);

        do {
            carros.inicioPrograma();
            opcao = ent.nextInt();

            if (opcao == 0) {
            carros.portifolio();
        }

        if (opcao == 1) {                       
            
            System.out.println("====================");
            System.out.println("escolha o codigo do carro:");
            numero = ent.nextInt();
            System.out.println("por quantos dias você deseja alugar?");
            dias = ent.nextInt();

            switch (numero) {

                case 0:
                System.out.println("Você escolheu"+ veiculos[0].getNome()  +" por " + dias );
                valorTotal = veiculos[0].getPreco() * dias;
                System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                    
                    break;
             case 1:
               System.out.println("Você escolheu"+ veiculos[1].getNome()  +" por " + dias );
                valorTotal = veiculos[1].getPreco() * dias;
               System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                    
                    break;
                     case 2:
                System.out.println("Você escolheu"+ veiculos[2].getNome()  +" por " + dias );
                valorTotal = veiculos[2].getPreco() * dias;
              System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                    
                    break;
                     case 3:
                System.out.println("Você escolheu"+ veiculos[3].getNome()  +" por " + dias );
                valorTotal = veiculos[3].getPreco() * dias;
               System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                    
                    break;
                    case 4:
                System.out.println("Você escolheu"+ veiculos[4].getNome()  +" por " + dias );
                valorTotal = veiculos[4].getPreco() * dias;
                System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                   
                    break;
                    case 5:
                System.out.println("Você escolheu"+ veiculos[5].getNome()  +" por " + dias );
                valorTotal = veiculos[5].getPreco() * dias;
               System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                   
                    break;
                    case 6:
                System.out.println("Você escolheu"+ veiculos[6].getNome()  +" por " + dias );
                valorTotal = veiculos[6].getPreco() * dias;
              System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                    
                    break;
                    case 7:
                System.out.println("Você escolheu"+ veiculos[7].getNome()  +" por " + dias );
                valorTotal = veiculos[7].getPreco() * dias;
              System.out.println(String.format("o aluguel totalizaria R$ %.2f", valorTotal));
                System.out.println("Deseja alugar?");                    
                    break;
                   
                default:
                System.out.println("Opção não encontrada");
            }

             System.out.println("Sim | Não");

        }

        } while (opcao != 0);

        ent.close();
    }
}
