package exercicio1;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int prato;
		int sobremesa;
		int bebida;
		int cal=0;
		
		System.out.println("Informe seu prato: ");
		System.out.printf("1- Vegetariano 180cal %n 2- Peixe 280cal%n 3- Frango 250cal%n 4- Carne 350cal");
			prato = sc.nextInt();
			
			switch (prato) {
			case 1: cal += 180;
			break;
			case 2: cal += 280;
			break;
			case 3: cal += 250;
			break;
			case 4: cal += 350;
			break;
			}
			
		System.out.println("Informe sua sobremesa: ");
		System.out.printf("1- Abacaxi 75cal %n2- Sorvete Diet 110cal%n3- Mousse Diet 170cal%n4- Mousse Chocolate 200cal");
			sobremesa = sc.nextInt();
			switch (sobremesa) {
			case 1: cal += 75;
			break;
			case 2: cal += 110;
			break;
			case 3: cal += 170;
			break;
			case 4: cal += 200;
			break;
			}
				
		System.out.println("Informe sua bebida: ");
		System.out.printf("1- Ch� 20cal %n 2- Suco de laranja 70cal%n 3- Suco de mel�o 100cal%n 4- Refri Diet 65cal");
			bebida = sc.nextInt();
			switch (bebida) {
			case 1: cal += 20;
			break;
			case 2: cal += 70;
			break;
			case 3: cal += 100;
			break;
			case 4: cal += 65;
			break;
			}
			
			System.out.println("Total de calorias da sua refei��o: " + cal + " calorias");
			
			sc.close();
	}
}