package exercicio1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe sua idade: ");
		int idade = ler.nextInt();
		
		if(idade >= 18 && idade <= 65) {
			System.out.println("seu voto é obrigatorio");
		}else if(idade >= 16 || idade > 65) {
			System.out.println("Seu voto é Opcional");
		}else {
			System.out.println("Você não tem direito de voto");
		}

	}

}