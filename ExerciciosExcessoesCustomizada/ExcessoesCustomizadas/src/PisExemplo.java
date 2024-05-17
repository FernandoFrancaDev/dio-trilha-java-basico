import java.util.Scanner;

import Excecoes2.PisInvalidoException;

public class PisExemplo {

    public static void main(String[] args) {
        try {
            
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu PIS: ");        
        Double pis = scanner.nextDouble();
        String pisFormatado = formatarPis("12345678911");
        
        System.out.println("Olá " + nome + " O número do seu PIS é: " + pisFormatado);
        }catch(PisInvalidoException e){
            System.out.println("PIS precisa ter 11 digitos");
        }
    }
    static String formatarPis(String pis) throws PisInvalidoException{
        if(pis.length() !=11)
        throw new PisInvalidoException();
        return "123.733.105.21";

    }
    
}
