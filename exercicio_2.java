package exercicio1;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int numero;
			
			System.out.println("Digite um numero: ");
			numero = ler.nextInt();
			
			if(numero % 10==0){
				System.out.println("O numero digitado � divisivel por 10");}
				else if(numero % 5== 0){
					System.out.println("seu numero � divisicel por 5");}
					else if (numero % 2== 0){
						System.out.println("Seu numero � divisivel por 2");
						}
else {System.out.println ("seu numero n�o � dif�cil por 2, nem por 5, muito menos por 10");
}
		}
}
}