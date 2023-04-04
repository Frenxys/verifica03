package verificaZani;

import java.util.Scanner;

public class Main {
	static Scanner s1=new Scanner(System.in);
	static Scanner s2=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veicoli v=new Veicoli();
		String scelta="no";
		int n;
		
			//Auto a1=new Auto("lambo","23super",45674,23,"mattia","toscani",2); 
			//Moto m1=new Moto("ferrari","f45",1200,234,"matteo","tondi");
			//Auto a2=new Auto("lambo","23super",45674,23,"mattia","toscani",5); 
			//Auto a3=new Auto("lambo","23super",45674,23,"mattia","toscani",5); 
			//Auto a4=new Auto("lambo","23super",45674,23,"mattia","toscani",3); 
			//Auto a5=new Auto("lambo","23super",45674,23,"mattia","toscani",3); 
			//Auto a6=new Auto("lambo","23super",45674,23,"mattia","toscani",5);
			do {
				System.out.println("cosa vuoi fare?\n1)aggiungi moto\n2)aggiungi auto\n3)quante auto con 3 porte\n4)quante auto con 5 porte\n5)aggiorna kmperc\n6)stampaVeicoli");
				n=s2.nextInt();
				switch(n) {
				case 1:v.addV(creaMoto());break;
				case 2:v.addV(creaAuto());break;
				case 3:v.quantiHanno(3);break;
				case 4:v.quantiHanno(5);break;
				case 5:aggiungiKm(v);break;
				case 6:v.stampaVeicoli();break;
				}
				System.out.println("vuoi continuare?\n inserisci 'si' se vuoi continuare");
				scelta=s1.nextLine();
			}while(scelta.equals("si"));
			
			
	}	
	public static void aggiungiKm(Veicoli v) {
		System.out.println("quanti chilometri vuoi aggiungere?");
		double km=s2.nextDouble();
		System.out.println("su che modello?");
		String modello=s1.nextLine();
		v.aggiungiKm(km, modello);
	}
	public static Auto creaAuto() {
		System.out.println("inserisci marca");
		String marca=s1.nextLine();
		System.out.println("inserisci modello");
		String modello=s1.nextLine();
		System.out.println("inserisci prezzo");
		double prezzo=s2.nextDouble();
		System.out.println("inserisci km percorsi");
		double kmperc=s2.nextDouble();
		System.out.println("inserisci nome");
		String nome=s1.nextLine();
		System.out.println("inserisci cognome");
		String cognome=s1.nextLine();
		System.out.println("inserisci numero porte");
		int numporte=s2.nextInt();
		return new Auto(marca,modello,prezzo,kmperc,nome,cognome,numporte);
	}
	public static Moto creaMoto() {
		System.out.println("inserisci marca");
		String marca=s1.nextLine();
		System.out.println("inserisci modello");
		String modello=s1.nextLine();
		System.out.println("inserisci prezzo");
		double prezzo=s2.nextDouble();
		System.out.println("inserisci km percorsi");
		double kmperc=s2.nextDouble();
		System.out.println("inserisci nome");
		String nome=s1.nextLine();
		System.out.println("inserisci cognome");
		String cognome=s1.nextLine();
		return new Moto(marca,modello,prezzo,kmperc,nome,cognome);
		
	}

}
