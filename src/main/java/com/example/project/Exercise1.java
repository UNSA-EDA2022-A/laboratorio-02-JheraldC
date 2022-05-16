package com.example.project;
import java.util.*;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));
		}
	}

	public boolean esCuadradoPerfecto(int numero) {
		return checkCuadradoPerfecto(1, numero); //Usando la recursividad indirecta para resolver el ejercicio
	}
	
	public boolean checkCuadradoPerfecto(int aux, int num) { //Necesitare del auxiliar en los parametros y empezará en 1, el n es el numero ingresado
		while(aux*aux <= num) { //Mientras que aux*aux sea menor e igual al numero que continue con el bucle
			if(((num / (double)aux) == (double)aux)){ //Si la condicion se cumplió, verifica si son iguales, para encontrar el Cuadrado Perfecto
				return true; //Si son iguales, entonces es un Cuadrado Perfecto y retorna true
			} else { //En caso la condicion no se cumpla, o sea no son iguales
				return checkCuadradoPerfecto(aux + 1, num); //Hará otro ciclo pero esta vez con el aux+1, de esa manera recorrera del 1 al n elemento
			}
		}
		return false; //En caso no cumplir la condición retornar false, porque no cumple la condicion de ser Cuadrado Perfecto
	}
}
