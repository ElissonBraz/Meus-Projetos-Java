package aplicacao;

import java.util.Scanner;

import classes.CalculoVenda;

public class ValorVenda {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        CalculoVenda venda;

        System.out.println("Olá, Digite o Valor de Custo do Item:");
        double custo = leia.nextDouble();
        System.out.println("Digite Agora o Imposto:");
        int imposto = leia.nextInt();
        System.out.println("Agora o Valor de Venda Proposto:");
        double valorVenda = leia.nextDouble();

        venda = new CalculoVenda(custo, valorVenda, imposto);

        System.out.println(venda);

        leia.close();
    }


}
