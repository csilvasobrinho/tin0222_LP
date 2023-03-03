/*
 * Se informar 2 repito de 1 a 10
 * se informar 1 repito de 11 a 20
 */

import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		int num=0;
		int cont = 0;
		
		Scanner lerNum = new Scanner(System.in);
		System.out.println("Opção: [ 2 ]repito de 11 a 20 ou [ 1 ]repito de 1 a 10");
		
		num = lerNum.nextInt();
		
		if(num == 1) {
			num=1;
			while(cont <= 10) {
				System.out.println("Repetindo de 1 a 10: " + cont);
				cont++;
			}
		}else if(num == 2) {
			cont = 11;
			while(cont <= 20) {
				System.out.println("Repetindo de 1 a 10: " + cont);
				cont++;
			}
		}



	}

}
