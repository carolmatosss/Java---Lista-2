/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/

package Lista2;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int n1, n2, n3;
        
		System.out.println("Insira o primeiro número:");
		n1= leia.nextInt();
		System.out.println("\nInsira o segundo número:");
		n2= leia.nextInt();
		System.out.println("\nInsira o terceiro número");
		n3= leia.nextInt();
		
		if(n1==n2 || n2==n3 || n3==n1) {
			System.out.println("Você inseriu números iguais");
		}
		
		else if(n1>n2 && n1>n3) {
			System.out.println("O primeiro número é o maior");
			
		}else if (n2>n1 && n2>n3){
			System.out.println("O segundo número é o maior");
		}else {
			System.out.println("O terceiro número é o maior");
		}




 

	}

}
