package TesteAlura.Desafios;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);

        String nomeCliente = "Kurosagi Ichigo";
        String tipoConta = "Corrente";
        double saldo = 9999.99;
        int opcao = 0;

        System.out.println("------------------------------------");
        System.out.println(" - Nome do cliente: " + nomeCliente + " -");
        System.out.println(" - Tipo de conta: " + tipoConta + " -");
        System.out.println(" - Saldo atual: " + saldo + " -");
        System.out.println("------------------------------------");

        String menu = """
                 --- Digite sua opcao ---
                  1 -> Consultar saldo
                  2 -> Transferir valor
                  3 -> Receber valor
                  4 -> Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = insert.nextInt();

            if (opcao == 1) {
                System.out.println(" ->O saldo atual e: " + saldo);
            } else if (opcao == 2) {
                System.out.println(" ->Qual o valor desejado para a transferencia");
                double valor = insert.nextDouble();
                if (valor > saldo) {
                    System.out.println(" ->Saldo insuficiente para transferencia!");
                } else {
                    saldo -= valor;
                    System.out.println(" ->Novo saldo: " + saldo);
                }
            }else if (opcao == 3) {
                System.out.println(" ->Valor recebido: ");
                double valor = insert.nextDouble();
                saldo += valor;
                System.out.println(" ->Novo saldo: " + saldo);
            } else if (opcao !=4) {
                System.out.println(" ->Opcao invalida!ne");
            }
        }
    }
}
