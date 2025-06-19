import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        
        //Exibir as mensagens para nosso usuário
        
        //Obter pela scanner os valores digitados pelo termnial
        
        //Exibir a mensagem conta criada

        System.out.println("Bem-vindo ao Banco GVS!");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();
            
            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Por favor, digite o saldo da Conta:");
            double saldo = scanner.nextDouble();
            
           NumberFormat formatoReal = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String saldoFormatado = formatoReal.format(saldo);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia + ", conta " + numero + " e seu saldo " + saldoFormatado + " já está disponível para saque.");

        scanner.close();
        }
    }
}