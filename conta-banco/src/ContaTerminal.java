import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        // Obter pela Scanner os valores digitados no terminal

        // Exibir a mensagem conta criada

        Scanner dados = new Scanner(System.in);

            int numeroConta = 1021;
            String agencia = "067-8";
            String nomeCliente = "";
            double saldo = 1000.00;
            

            System.out.println("Vamos cadastrar sua conta.");

            System.out.println("");
            
            System.out.println("Informe o número da conta:");
            numeroConta = dados.nextInt();
            dados.nextLine();

            System.out.println("");

            System.out.println("Informe o número da agência com o - (hífen):");
            agencia = dados.nextLine();

            System.out.println("");
            
            System.out.println("Informe seu nome:");
            nomeCliente = dados.nextLine();

            System.out.println("");

            System.out.print("Informe o saldo da conta:");
            saldo= dados.nextDouble();
           //  String saldoStr = dados.nextLine();
            //saldo = Double.parseDouble(saldoStr);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
   

    }
}
