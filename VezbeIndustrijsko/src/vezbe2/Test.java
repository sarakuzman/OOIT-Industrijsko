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
		/*
		 * int korisnickiBroj; System.out.println("Unesite broj"); Scanner it = new
		 * Scanner(System.in);
		 * 
		 * korisnickiBroj = it.nextInt();
		 * 
		 * //FOR petlja int rezultat = 0; for(int i=0;i<=korisnickiBroj;i=i+2) {
		 * rezultat = rezultat+i; } System.out.println(rezultat);
		 * 
		 * //WHILE Petlja int brojac = 0; while(brojac<=korisnickiBroj) { rezultat =
		 * rezultat+brojac; brojac+=2;
		 * 
		 * } System.out.println(rezultat);
		 * 
		 * //DO-WHILE Petlja brojac = 0; do { rezultat = rezultat + brojac; brojac =
		 * brojac +2; } while(brojac <= korisnickiBroj); System.out.println(rezultat);
		 */
		
		int brojPrestupnihGodina = 0;
		/*for(int godina = 2022;godina<2100;godina++) {
			if(godina%4 == 0) {
				brojPrestupnihGodina++;
			}
		}*/
		for(int godina = 2022; godina<2100;godina = godina +4) {
			if(godina == 2022) {
				godina = 2024;
				brojPrestupnihGodina++;
				System.out.println(godina);
			}else {
				System.out.println(godina);
				brojPrestupnihGodina++;
			}
		}
		
		System.out.println(brojPrestupnihGodina);
	}

}
