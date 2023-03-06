import java.util.Scanner;

public class LE04_Q02_Rev01 {

	public static void main(String[] args) {
		int num = 0;
		String numExtenso= null;
		
		Scanner lerNum = new Scanner(System.in);
		
		System.out.println("Número: ");
		num = lerNum.nextInt();
		
		if(num == 1) {
			numExtenso = "um.";
			System.out.println("\n Número por extenso: " + numExtenso);
		} else if(num == 2) {
			numExtenso = "dois.";
			System.out.println("\n Número por extenso: " + numExtenso);
		} else if(num == 3) {
			numExtenso = "três.";
			System.out.println("\n Número por extenso: " + numExtenso);
		} else if(num == 4) {
			numExtenso = "quatro.";
			System.out.println("\n Número por extenso: " + numExtenso);
		} else if(num == 5) {
			numExtenso = "cinco.";
			System.out.println("\n Número por extenso: " + numExtenso);
		} else if(num == 6) {
			numExtenso = "seis.";
			System.out.println("\n Número por extenso: " + numExtenso);
		} else if(num == 7) {
			numExtenso = "sete.";
			System.out.println("\n Número por extenso: " + numExtenso);
		} else if(num == 8) {
			numExtenso = "oito.";
			System.out.println("\n Número por extenso: " + numExtenso);
		} else if(num == 9) {
			numExtenso = "nove.";
			System.out.println("\n Número por extenso: " + numExtenso);
		} else if(num == 10) {
			numExtenso = "dez.";
			System.out.println("\n Número por extenso: " + numExtenso);
		}

	}

}
