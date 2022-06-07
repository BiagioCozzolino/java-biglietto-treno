package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dichiarazioni variabili
		int kilometriDaPercorrere;
		int etaPasseggero;
		double costoTratta;

		Scanner scan = new Scanner(System.in);

		// Inizio immissione dati
		System.out.print("Inserisci la tua Età: ");
		etaPasseggero = scan.nextInt();
		System.out.print("Inserisci i kilometri che vuoi percorrere: ");
		kilometriDaPercorrere = scan.nextInt();

		// Inizio calcolo costo kilometri
		costoTratta = kilometriDaPercorrere * 0.21;
		System.out.println("Il costo della tratta scelta è di: " + costoTratta + "€");

		// Inizio calcolo sconto
		double prezzoScontato = costoTratta;

		// Inizio sequenza per identificazione sconto
		if (etaPasseggero < 18) {
			prezzoScontato = costoTratta - costoTratta / 100 * 20;
			System.out.println("Complimenti hai diritto ad un sconto del 20%, prezzo finale: ");

		} else if (etaPasseggero > 65) {
			prezzoScontato = costoTratta - costoTratta / 100 * 40;
			System.out.println("Complimenti hai diritto ad un sconto del 40%, prezzo finale: ");

		} else {
			System.out.println("Mi dispiace non hai diritto a nessuno sconto prezzo finale: ");

		}
		System.out.println(prezzoScontato + "€");

		scan.close();
	}

}