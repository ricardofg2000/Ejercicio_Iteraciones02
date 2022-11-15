package unico;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Un centro educativo nos ha pedido que diseñemos una aplicación para calcular
		 * datos estadísticos de los alumnos. Se introducirán las edades de los elumnos
		 * hasta que una de ellas sea negativa. La aplicación mostrará la suma de las
		 * edades, la media, de cuántos alumnos hemos introducido su edad, y cuántos
		 * alumnos son mayores de edad.
		 */

		Scanner leer = new Scanner(System.in);

		int edad = 0;
		int suma = 0;
		int n_alumnos = 0;
		double media = 0;
		int mayor_edad = 0;

		System.out.print("Introduzca la edad de un alumno[Introduzca un número negativo para salir]: ");
		edad = Integer.parseInt(leer.nextLine());

		while (edad > 0) {

			n_alumnos++;
			suma += edad;

			if (edad > 18) {
				mayor_edad++;
			}
			media = suma / n_alumnos;
			System.out.print("Introduzca la edad de otro alumno [Introduzca un número negativo para salir]");
			edad = Integer.parseInt(leer.nextLine());
		}

		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Cantidad alumnos: " + n_alumnos);
		System.out.println("Cantidad alumnos mayores de edad: " + mayor_edad);
	}

}
