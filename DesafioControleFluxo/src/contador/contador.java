package contador;

import java.util.Locale;
import java.util.Scanner;

public class contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);		
		System.out.println("Digite o primeiro numero: ");
		int parametroUm = terminal.nextInt();		
		System.out.println("Digite o segundo numero: ");
		int parametroDois = terminal.nextInt();
		
		for(int X = parametroUm; parametroUm <= parametroDois; parametroUm++) {
			System.out.println("Imprimindo o número: " + parametroUm);
		}
		
		try {
			contar(parametroUm, parametroDois);
		}
		catch(ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro precisa ser maior primeiro");
			
		}
		int contagem = parametroDois - parametroUm;	
		System.out.println("O valor de contagem é: " + contagem);
		System.out.println("Iniciando o incremento com base na variavel contagem");
		for(int x = contagem; contagem <= parametroDois; contagem++) {			
			System.out.println("Imprimindo variavel o numero: " + contagem);
		}
	
	}
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		if(parametroUm > parametroDois) 
			throw new ParametrosInvalidosException();
				
	}
	

}
