package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_7 {
	public void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double n1 = 8;
		double n2 = 9;
		double n3 = 7;
		double n4 = 4;
		double n5 = 5;
		double n6 = 6;
		
		double media1 = (n1 + n2 + n3) /3;
		double media2 = (n4 + n5 + n6) /3;
		
		System.out.println("o valor da media aritimetica 1 é: "+ media1);
		System.out.println("o valor da media aritimetica 2 é: "+ media2 );
		System.out.println("a soma das medias é igual á: "+ (media1+media2));
		System.out.println("e a media das media é igual é" + (media1+media2/ 2));
		
		sc.close();
		
	}

}
