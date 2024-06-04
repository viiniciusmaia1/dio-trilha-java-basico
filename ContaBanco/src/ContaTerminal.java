import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) throws Exception {

        //Import scanner
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para usuario
        //Obter pelo scanner a conta e valores digitados no terminal
        System.out.println("Por favor, digite o número da conta desejada: " );
        int accountNumber = sc.nextInt() ;

        sc.nextLine();

        System.out.println("Digite o número da agência desejada: " );
        String agency = sc.nextLine();

        System.out.println("Digite o nome do cliente: " );
        String clientName = sc.nextLine();

        System.out.println("O saldo que deseja depositar: " );
        double balance = sc.nextDouble();
        

        //Exibir a mensagem de conta criada
        String message = showMessageString(accountNumber, agency, clientName, balance);
        System.out.println(message);
        
        sc.close();
    }

    public static String showMessageString(int accountNumber, String agency, String clientName, double balance) {
        String message = "Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency +
        ", conta " +  accountNumber +" e seu saldo de R$ " + balance + " já está disponível para saque";

        return message;
    }
}
