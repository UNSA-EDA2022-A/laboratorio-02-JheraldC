package com.example.project;
import java.util.*;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

			int n = sc.nextInt(), suma;
			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			suma = sc.nextInt();
			System.out.println(obj.esSubconjuntoSumaExt(a, suma));
		}
	}

	public boolean esSubconjuntoSumaExt(int a[], int suma) {		
		for (int i = 0; i < a.length; i++) { //Inicia bucle para recorrer el arreglo
			if(a[i]%7 == 0 && a[i+1] == 1) { //Verifica si a[i] es multiplo de 7 y si a[i+1]. o sea el que sigue es 1
				for (int j = 0; j < a.length; j++) { //En caso cumpla, recorre el arreglo para verificar si el a[i] coincide con algun a[j] 
					if(a[i] == a[j]) { //En caso coincidan se elimina ese multiplo de 7 
						a[i] = 0; //Se eliminó el multiplo de 7 del arreglo
					}
				}
				return esSubconjuntoSuma(a, 0, suma); //Retorna si la suma objetivo cumple
			} else if(a[i]%7 == 0 && a[i+1] != 1){ //Verifica si a[i] es multiplo de 7 y si a[i+1]. o sea el que sigue es diferente de 1
				suma -= a[i]; //En caso se cumpla, resta de la suma objetivo el 7, para que lo asuma en la recursion
				a[i] = 0; //El multiplo será 0 para que no haya repeticion al borrar el multiplo de 7
				return esSubconjuntoSuma(a, 0, suma); //Retorna si la suma objetivo sin 7 cumple
			}
		}
		return false;
	}

	public boolean esSubconjuntoSuma(int a[], int n, int suma) {
		// Casos base
		if (suma == 0) //Si la suma es 0, hay un subgrupo que su suma es igual a la suma objetivo
			return true;
		if (n == a.length) // Si n es a.lenght, se buscaron todas las posibilidades y no encontro la suma objetivo
			return false;
		/*
		 * verificamos si conseguimos la suma por alguna de las siguientes formas:
		 * (a)incluyendo el primer elemento (b)excluyendo el primer elemento
		 */
		return esSubconjuntoSuma(a, n + 1, suma - a[n]) || esSubconjuntoSuma(a, n + 1, suma);
	}
}
