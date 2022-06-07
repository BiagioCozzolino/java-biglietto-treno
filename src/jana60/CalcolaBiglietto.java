package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kilometriDaPercorrere;
		int et‡Passeggero;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci la tua Et‡: ");
		et‡Passeggero = scan.nextInt();
		System.out.print("Inserisci i kilometri che vuoi percorrere: ");
		kilometriDaPercorrere = scan.nextInt();

		scan.close();
	}

}