package br.edu.ProjetoJavatarefa1.main;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�rea do Terreno: ");
		int areaTerreno = scanner.nextInt();
		
		System.out.println("�rea Construida: ");
		int areaConstruida = scanner.nextInt();
		
		double valorterreno = 0;
		double valorconstruido = 0;
		
		
		if (areaTerreno<=200) {
			valorterreno = (areaTerreno*0.10);
		}
		
		if (areaTerreno>=201 && areaTerreno<= 450) {
			valorterreno = (areaTerreno*0.43);
		}
		
		if (areaTerreno>=451) {
			valorterreno = (areaTerreno*1.20);
		}
		
		if (areaConstruida<=50) {
			valorconstruido = (areaConstruida*0.00);
		}
		if (areaConstruida>=51 && areaConstruida<= 75) {
			valorconstruido = (areaConstruida*0.35);
		}
		if (areaConstruida>=95) {
			valorconstruido = (areaConstruida*0.45);
		}
		
		System.out.println("Valor da �rea do Terreno "+ valorterreno);
		System.out.println("Valor da �rea Construida "+ valorconstruido);
		System.out.printf("Valor do IPTU:  "+ (valorterreno + valorconstruido));
	}
	
	
}
