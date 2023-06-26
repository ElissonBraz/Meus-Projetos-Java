package aplicacao;

import java.util.Scanner;

import classes.Compra;

public class AplicacaoTeste {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Compra compra = new Compra(0, 0, null);

        double total = 0;  
        while (true) {
            System.out.println("Informe o Produto:");// Usuario digita o nome do produto
            compra.setResposta(ent.nextLine());
            compra.setPreco(compra.lerPreco(ent, "Digite o valor do Produto"));
            compra.setQuantidade(compra.lerQuantidade(ent, "Digite a quantidade do Produto"));
            double valor = compra.getQuantidade() * compra.getPreco();

            System.out.printf("A Quantidade de produtos é %d\nTotal a pagar é R$%.2f\n\nObrigado por comprar %s\n", compra.getQuantidade(),
                    valor, compra.getResposta());
            total += valor;

            // Nova Compra
            compra.setResposta(compra.lerOpcao(ent, "\nRealizar outra compra? (S/N): "));
            if ("n".equalsIgnoreCase(compra.getResposta()))
                break; // sai do while(true)

            System.out.println("\n\"Nova compra\"\n");
            System.out.println("Favor iniciar com as informações\n");
        }
        System.out.printf("Total das compras: R$%.2f\n", total);
        System.out.println("\n\n\"Volte sempre!\"\n\n");

        ent.close();
    }


}
