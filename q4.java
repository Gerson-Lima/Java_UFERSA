import java.util.Scanner;

public class q4{

	public static void main(String[] args) {

		Scanner intro = new Scanner(System.in);
		double C, F; 

		System.out.println("Digite a temperatura em Centígrados: ");
		C = intro.nextDouble();
		
		F = (C * 9/5) + 32;

		System.out.print("\n A medida convertida é: " + F + "ºF \n");
		intro.close();
	}

}
