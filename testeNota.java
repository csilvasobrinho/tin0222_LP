import java.util.Scanner;
public class testeNota {

	public static void main(String[] args) {
		float n1=0;
		float n2=0;
		float n3=0;
		float media=0;
		
		Scanner lerNota = new Scanner(System.in);
		
		System.out.print("1a Nota: ");
		n1 = lerNota.nextFloat();
		System.out.print("2a Nota: ");
		n2 = lerNota.nextFloat();
		System.out.print("3a Nota: ");
		n3 = lerNota.nextFloat();
		
		media = (n1 + n2 + n3) / 3;
		
		System.out.printf("Media: %.1f", media);

	}

}
