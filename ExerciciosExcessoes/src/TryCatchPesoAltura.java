import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class TryCatchPesoAltura {
    public static void main(String[] args) {   
        try{     
    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Digite o seu nome: ");
    String nome = scanner.next();

    System.out.println("Digite o seu peso: ");
    Double peso = scanner.nextDouble();

    System.out.println("Digite a sua altura: ");
    Double altura = scanner.nextDouble();

    System.out.println("Olá! " + nome);
    System.out.println("Você pesa " + peso);
    System.out.println("o seu peso é de: " + peso);
    }
    catch(InputMismatchException e){
        System.out.println("Os campos idade e altura precisam ser numéricos");
    }
}
    
}
