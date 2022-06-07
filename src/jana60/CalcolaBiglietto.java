package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dichiarazioni variabili
		int kilometriDaPercorrere;
		int et‡Passeggero;
		double costoTratta;
		double prezzoScontatoGiovani;
		double prezzoScontatoAnziani;
		
		Scanner scan = new Scanner(System.in);
		
		//Inizio immissione dati
		System.out.print("Inserisci la tua Et‡: ");
		et‡Passeggero = scan.nextInt();
		System.out.print("Inserisci i kilometri che vuoi percorrere: ");
		kilometriDaPercorrere = scan.nextInt();
		
		//Inizio calcolo costo kilometri
		costoTratta = kilometriDaPercorrere * 0.21;
		System.out.println("Il costo della tratta scelta Ë di: " + costoTratta + "Ä");
		
		//Inizio calcolo sconto
		prezzoScontatoGiovani = costoTratta / 100 * 20 ;
		prezzoScontatoAnziani = costoTratta / 100 * 40 - costoTratta;
		
		//Inizio sequenza per identificazione sconto
		if (et‡Passeggero<18) { System.out.println("Complimenti, hai diritto ad uno sconto del 20%! il prezzo scontato Ë di: " + prezzoScontatoGiovani + "Ä");
			
		} else if (et‡Passeggero>65) { System.out.println("Complimenti, hai diritto ad uno sconto del 40%! il prezzo scontato Ë di: " + prezzoScontatoAnziani + "Ä"); 
			
		}
		else {
			System.out.println("Mi dispiace non hai diritto a nessuno sconto");
 
		
		scan.close();
		}
		
	}

}