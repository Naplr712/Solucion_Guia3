package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		// Sumatoria
		// r = 1 + 2 + 3 + ... + n
		
		int x = 1;       // Contador
		int suma = 0;    // Acumulador
		
		while (x <= (n-1)) {
			System.out.print(x + "+");
			suma += x;
			x++;
		}
		
		System.out.println(n + "=" + (suma + n));
		
		/*
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Sumatoria........: " + suma); */
	}
}
