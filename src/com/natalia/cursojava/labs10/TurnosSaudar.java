package com.natalia.cursojava.labs10;

import java.util.Scanner;

public class TurnosSaudar {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite o turno que você estuda: ");
			String turno = scan.next();
			
			switch(turno) {
			case "m":
			case "M": System.out.println("Bom dia!"); break;
			case "v":
			case "V": System.out.println("Boa tarde!"); break;
			case "n":
			case "N": System.out.println("Boa noite!"); break;
			default: System.out.println("Valor inválido.");
			}
		}

	}

}
