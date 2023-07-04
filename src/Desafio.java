import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String  nome, tipoConta;
        double saldo = 2500.00;
        int opcaoDesejada = 0;

        System.out.println("Nome do cliente: ");
        nome = sc.nextLine();
        System.out.println("Tipo conta");
        tipoConta = sc.nextLine();

        System.out.println("************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("\n************************");

        String menu = """
                ** ---> Digite sua opção <--- **
                
                1 - Consultar saldos
                
                2 - Receber valor
                
                3 - Transferir valor
                
                4 - sair
                """;

        while (opcaoDesejada != 4){
            System.out.println("\n" + menu);
            opcaoDesejada = sc.nextInt();

            if (opcaoDesejada == 1) {
                System.out.println("\nSaldo atual: " + saldo);
            }
            else if (opcaoDesejada == 2) {
                System.out.println("Informe o valor a receber: ");
                double valor = sc.nextDouble();

                saldo += valor;
                System.out.println("Novo saldo: R$" + saldo);
            } else if (opcaoDesejada == 3) {
                System.out.println("Informe o valor a transferir");
                double valor = sc.nextDouble();

                if (valor > saldo) {
                    System.out.println("Saldo insuficiente para concluir a tranasferência. Informe um valor disponível");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: R$" + saldo);
                }
            } else {
                System.out.println("Opção inválida!");
            }
        }




        sc.close();
    }
}
