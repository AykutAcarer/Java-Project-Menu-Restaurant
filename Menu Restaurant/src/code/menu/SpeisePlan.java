package code.menu;

import java.util.Scanner;

public class SpeisePlan {
	
	/* instance Variable */
	public static Suppe karte []=new Suppe[3];
	
	public static void SuppenSpeisPlan() {
		
		karte [0]= new TomatenSuppe();
		karte [1]= new GulaschSuppe();
		karte [2]= new ErbsenSuppe();
		
		System.out.println("#################");
		System.out.println("      MENU	");
		System.out.println("#################");
		
		for (int i=0; i<karte.length; i++) {
			System.out.println((i+1)+"- "+karte[i].getName());
		}
		System.out.println("#################");
	}
	public static void main(String[] args) {
		int menu=0;
		String auswahl="";
		double kosten=0;
		double gesamtKosten=0;
		Scanner scan = new Scanner(System.in);
		
		//Aufruf Suppenspeisplan
		SuppenSpeisPlan();
		
		do {
			System.out.println("Was möchten Sie bestellen?");
			menu= Integer.parseInt(scan.nextLine());
		
			switch (menu) {
				case 1:	System.out.printf(karte[0].getName()+" kostet "+"%,.2f%n",karte[0].kostet());
						kosten=karte[0].kostet();
						break;
				case 2: System.out.printf(karte[1].getName()+" kostet "+"%,.2f%n",karte[1].kostet());
						kosten=karte[1].kostet();		
						break;
				case 3: System.out.printf(karte[2].getName()+" kostet "+"%,.2f%n",karte[2].kostet());
						kosten=karte[2].kostet();		
						break;
				default: System.out.println("Falsch Eingabe!");
						break;
			}
			gesamtKosten+=kosten;
			System.out.println("Möchten Sie weitergehen? J/N");
			auswahl = scan.nextLine();

		}while (auswahl.equalsIgnoreCase("J"));
		System.out.printf("Bezahlen Sie bitte %,.2f %1s",gesamtKosten,"€");
		
	}
}
