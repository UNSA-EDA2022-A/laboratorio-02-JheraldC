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
		return checkCuadradoPerfecto(1, numero);
	}
	
	public boolean checkCuadradoPerfecto(int aux, int num) {
		while(aux*aux <= num) {
			if(((num % 1) == 0) && ((num / (double)aux) == (double)aux)){
				return true;
			} else {
				return checkCuadradoPerfecto(aux + 1, num);
			}
		}
		return false;	
	}
}
