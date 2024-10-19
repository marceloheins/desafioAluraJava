import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite seu tipo de conta");
        String tipoConta = scanner.nextLine();

        System.out.println("Digite seu saldo Inicial");
        double saldoInicial = scanner.nextDouble();


        System.out.println("*******************************************************");
        System.out.println("Dados do Cliente");
        System.out.println("Nome: " + nome);
        System.out.println("Conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldoInicial);
        System.out.println("*******************************************************");

        String menu = """
                ** Digite sua opção **
                1- Consultar saldos
                2- Receber Valor
                3- Transferir Valor
                4- Sair
                """;


         int opcao = 0;
         double saldoAtualizado = 0;

         while (opcao != 4){
             System.out.println(menu);
              opcao = scanner.nextInt();

             if (opcao == 1){
                 System.out.println("Saldo: " + saldoInicial );
             }
             else if (opcao == 2){
                 System.out.println("Informe o valor que irá receber: ");
                 double recebendoTransferencia = scanner.nextDouble();
                 saldoAtualizado = saldoInicial + recebendoTransferencia;
                 saldoInicial = saldoAtualizado;
                 System.out.println("Saldo Atualizado: " + saldoInicial);
             }
             else if (opcao == 3){

                 System.out.println("Informe o valor que irá transferir: ");
                 double enviandoTransferencia = scanner.nextDouble();
                    if ( enviandoTransferencia > saldoInicial ) {
                     System.out.println("Essa operação não pode ser executada!! Saldo Abaixo do valor a ser transferido");
                        System.out.println("Saldo Atualizado: " + saldoInicial);
                    }else {
                        saldoAtualizado = saldoInicial - enviandoTransferencia;
                        saldoInicial = saldoAtualizado;
                        System.out.println("Saldo Atualizado: " + saldoInicial);
                    }

             }
             else if (opcao == 4){
                 break;
             }
             else {
                 System.out.println("Opção " + opcao + " Inexistente");
             }
         }
    }
}
