package exercicio1;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero: ");
		numero = sc.nextInt();
		
		int sucessor = numero + 1;
		int antecessor = numero - 1 ;
		
		System.out.println("N�mero: " + numero);
		System.out.println("N�mero anterior: " + antecessor);
		System.out.println("N�mero sucessor: " + sucessor);
		sc.close();
	}

}