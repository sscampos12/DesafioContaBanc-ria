import java.util.Scanner;

public class DesafioContaBacaria {
    public static void main(String[] args) {
        String nomeDoCliente = "Suzy Soares Campos";
        String tipoConta = "ContaCorrente";
        double saldo = 2500.00;

        System.out.println("***************************************************");
        System.out.println("Extrato conta corretente");
        System.out.println("***************************************************");
        System.out.println("Dados iniciais do Cliente");
        System.out.println("***************************************************");

       System.out.println("\nNome do Cliente:  " + nomeDoCliente);
       System.out.println("Tipo Conta: " + tipoConta);
       System.out.println("Saldo Atual: " + saldo);
       System.out.println("***************************************************");

        String menu = """
                **Digite sua opção**
                1 - Consultar saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - SAir
                """;

        int opcao = 0;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
