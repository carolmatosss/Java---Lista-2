/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package Lista2;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		double n, raiz, pot;
		System.out.println ("Insira um número: ");
		n = leia.nextDouble();

		if(n%2==0) {
			raiz = Math.sqrt(n);
			System.out.printf("O número é par. E sua raíz quadrada é: %.2f",raiz);

		}else {

			pot= Math.pow(n,2);
			System.out.printf("O número é ímpar. Sua potência ao quadrado é: %.2f ",pot);
		}


	}

}
