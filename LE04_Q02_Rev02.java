import java.util.Scanner;

public class LE04_Q02_Rev02 {

	public static void main(String[] args) {
		int num = 0;
		String numExtenso= null;
		
		Scanner lerNum = new Scanner(System.in);
		
		System.out.print("Informe um Número entre 1 e 10: ");
		num = lerNum.nextInt();
		
		switch(num) {
		case 1:
			numExtenso = "um.";
			System.out.println("\n Número por extenso: " + numExtenso);
			break;
		case 2:
			numExtenso = "dois.";
			System.out.println("\n Número por extenso: " + numExtenso);
			break;
		case 3:
			numExtenso = "três.";
			System.out.println("\n Número por extenso: " + numExtenso);
			break;
		case 4:
			numExtenso = "quatro.";
			System.out.println("\n Número por extenso: " + numExtenso);
			break;
		case 5:
			numExtenso = "cinco.";
			System.out.println("\n Número por extenso: " + numExtenso);
			break;
		case 6:
			numExtenso = "seis.";
			System.out.println("\n Número por extenso: " + numExtenso);
			break;
		case 7:
			numExtenso = "sete.";
			System.out.println("\n Número por extenso: " + numExtenso);
			break;
		case 8:
			numExtenso = "oito.";
			System.out.println("\n Número por extenso: " + numExtenso);
			break;
		case 9:
			numExtenso = "nove.";
			System.out.println("\n Número por extenso: " + numExtenso);
			break;
		case 10:
			numExtenso = "dez.";
			System.out.println("\n Número por extenso: " + numExtenso);
			break;
			default:
				System.out.println("Número informado não atende ao solicitado.");
		}

	}

}
