package vezbanjeKolekcije;

public class Main {

	public static void main(String[] args) {
		
		//Niz brojeva 4,5,6,7,8
		//Napraviti program koji taj niz ispisuje u obrnutom redosledu
		
		//Prvi nacin inicijalizacije niza
		int[] niz1 = {4,5,6,7,8};
		
		//Drugi nacin inicijalizacije niza
		int[] niz2 = new int[5];
		niz2[0] = 4;
		niz2[1] = 5;
		niz2[2] = 6;
		niz2[3] = 7;
		niz2[4] = 8;
		
		//Prolazak kroz niz
		for(int i = niz1.length-1; i>=0; i-- ) {
			System.out.print(niz1[i] + " ");
		}
		
		//Mnozenje svakog elementa sa 5
		int[] niz3 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println();
		
		for(int i = 0; i<niz3.length; i++) {
			System.out.print(niz3[i]*5 + " ");
		}

	}

}
