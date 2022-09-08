/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/
package Lista2;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);

		int idade;

		System.out.println("Insira a idade: ");
		idade = leia.nextInt();

		if (idade>10 && idade<=14) {

			System.out.println("Permitido na categoria infantil");
		}else if(idade>=15 && idade<=17) {
			System.out.println("Permitido na categoria juvenil");
		}else if(idade>=18 && idade<=25) {
			System.out.println("Permitido na categoria adulto");

		}else {
			System.out.println("Não é permitido em nenhuma categoria");
		}
	}

}
