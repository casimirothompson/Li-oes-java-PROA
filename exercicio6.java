package exercicio1;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		int sucessor = numero + 1;
		int antecessor = numero - 1 ;
		
		System.out.println("Número: " + numero);
		System.out.println("Número anterior: " + antecessor);
		System.out.println("Número sucessor: " + sucessor);
		sc.close();
	}

}