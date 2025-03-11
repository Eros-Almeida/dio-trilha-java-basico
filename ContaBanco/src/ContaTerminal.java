import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner;
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exbir as mensagens para o usuário;

        System.out.println("Bem vindo ao ByteBank!");

        System.out.println("Digite o nome do titular da conta: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite a agência da conta: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();
                
        //Obter pela scanner os valores digitados pelo usuário;
        
        System.out.printf("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        //Exibir a mensagem de conta criada com sucesso;

        System.out.println("Conta criada com sucesso!");

        scanner.close();
    }
}
