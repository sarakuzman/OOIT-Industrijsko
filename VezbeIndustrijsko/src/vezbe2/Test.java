package vezbe2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*int prviBroj = 24;
		int drugiBroj = 44;
		char operation = '-';
		if(operation == '+') {
			System.out.println(prviBroj + drugiBroj);
		}
		else if(operation == '-') {
			if(prviBroj > drugiBroj) {
				System.out.println(prviBroj-drugiBroj);
			}
			else {
				System.out.println(drugiBroj-prviBroj);
			}
		}*/
		
		//Sluzi za input sa konzole
		int korisnickiBroj;
		System.out.println("Unesite broj");
		Scanner it = new Scanner(System.in);
		
		korisnickiBroj = it.nextInt();
		
		//FOR petlja
		int rezultat = 0;
		for(int i=0;i<=korisnickiBroj;i=i+2) {
			rezultat = rezultat+i;
		}
		System.out.println(rezultat);
		
		//WHILE Petlja
		int brojac = 0;
		while(brojac<=korisnickiBroj) {
			rezultat = rezultat+brojac;
			brojac+=2;
			
		}
		System.out.println(rezultat);
		
		//DO-WHILE Petlja
		do {
			
		}
		while();

	}

}
