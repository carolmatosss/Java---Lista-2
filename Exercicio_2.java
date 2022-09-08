/*2- Faça um programa que entre com três números e coloque em ordem crescente.*/

/* MENOR     MEIO     MAIOR
 * N1        N2       N3
 * N1        N3       N2
 * N2        N1       N3
 * N2        N3       N1
 * N3       N1        N2
 * N3        N2       N1
 */
package Lista2;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);

		double n1, n2, n3;

		System.out.println("Leia o primeiro número");
		n1 = leia.nextDouble();
		System.out.println("Leia o segundo número");
		n2 = leia.nextDouble();
		System.out.println("Leia o terceiro número:");
		n3 = leia.nextDouble();

		if (n1<=n2  && n2<=n3) {
			System.out.println("A sequencia é: "+n1+", "+n2+" e "+n3);


		}else if(n1<=n3  && n3<=n2) {
			System.out.println("A sequencia é: "+n1+", "+n3+" e "+n2);

		}else if(n2<=n1  && n1<=n3) {
			System.out.println("A sequencia é: "+n2+", "+n1+" e "+n3);

		}else if(n2<=n3  && n3<=n1) {
			System.out.println("A sequencia é: "+n2+", "+n3+" e "+n1);

		}else if(n3<=n1  && n1<=n2) {
			System.out.println("A sequencia é: "+n3+", "+n1+" e "+n2);

		}else {
			System.out.println("A sequencia é: "+n3+", "+n2+" e "+n1);
		}

	}

}
