import java.util.Scanner;

public class ContaBanco {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("Dados iniciais do cliente:");

        System.out.println("Nome: Antonio Alves Ferreira Junior");
        System.out.println("Tipo de conta: corrente");
        System.out.println("Saldo inicial: R$ 2500,00");
        System.out.println("****************************");

        int opc = 0;
        double saldoInicial = 2500;
        double valorReceber;
        double transferir;

        String menu = """
                **** Digite a opção desejada **** 
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        while(opc != 4){

            System.out.println(menu);
            opc = scan.nextInt();

            switch (opc){

                case 1:
                    System.out.println("O saldo atual é " + saldoInicial);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber ");
                    valorReceber = scan.nextDouble();
                    saldoInicial += valorReceber;
                    System.out.println("Saldo atualizado " + saldoInicial);
                    break;
                case 3:
                    System.out.println("Informe o Valor que deseja transferir ");
                    transferir = scan.nextDouble();
                    if (transferir < saldoInicial) {
                        saldoInicial -= transferir;
                        System.out.println("Saldo atualizado " + saldoInicial);
                    }else
                        System.out.println("Não há saldo o suficiente para realizar essa transferência!! ");
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;

            }
        }
        scan.close();
    }
}
