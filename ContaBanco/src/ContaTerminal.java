import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int contaCorrente = scanner.nextInt();

        System.out.println("Digite o número da agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite o seu saldo");
        double valorSaldo = scanner.nextDouble();

        System.out.println("Ola " + nome + " " + sobrenome +" Obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agência é " + agencia + " conta " + contaCorrente);
        System.out.println("e seu saldo " + valorSaldo + " já está disponível para saque");
        
    }
    
}
