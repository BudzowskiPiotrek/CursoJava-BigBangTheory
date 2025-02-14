package proyecto;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Creo dos Scanner diferentes uno para texto y otro para numeros, texto de
		 * ejersio y poco mas por comentar
		 */
		Scanner st = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String nombre;
		System.out.println("\033[091mVecino, Vecino, Vecino");
		System.out.println("\033[092mEh... hola, ¿puedo ayudarte?");
		System.out
				.println("\033[091mAh, excelente! Me presento: soy el Dr. Sheldon Cooper,\nfisico teorico del Instituto"
						+ " Tecnologico de California.\nSegun las normas del edificio, es mi deber conocer a los"
						+ " nuevos inquilinos.¿ Cual es tu nombre?\033[092m");
		nombre = st.nextLine();
		System.out.printf("\033[092moh, eh... soy %s\n", nombre);
		System.out.printf("\033[091mPerfecto, %s. Ahora que hemos establecido una relacion cordial basada en normas"
				+ " sociales minimas,\ncreo que es un momento adecuado para desafiarte intelectualmente.\nTengo "
				+ "preparado un par de actividades para poner a prueba tus habilidades. ¿Estas listo?\n", nombre);
		System.out.println("\033[092mSupongo que si. ¿Que tienes en mente?");
		/*
		 * metodo de menu que vale 2 punticos!
		 */
		menu(sn);
	}

	/*
	 * un menu con try catch que protege por si metemos caracter en opciones que es
	 * int, lo hago en bucle do while con su salida en 5
	 */
	private static void menu(Scanner sn) {
		int opcion = 0;
		do {
			try {
				System.out.println("\n\033[033m1.Apostar.\n2.Adivinar.\n3.Jugar.\n4.Pelear.\n5.Salir");
				opcion = sn.nextInt();
				switch (opcion) {
				case 1:
					apostarMetodo(sn);
					break;
				case 2:
					adivinarMetodo(sn);
					break;
				case 3:
					opcion = jugarMetodo(sn, opcion);
					break;
				case 4:
					opcion = pelearMetodo(opcion);

					break;

				default:
					System.out.println("\033[092mAdios Sheldon");
				}
			} catch (InputMismatchException e) {
				System.out.println("\033[091mSolo numeros, vuelta al meno principal\033[033m");
				sn.next();
			}
		} while (opcion != 5);
	}

	private static void apostarMetodo(Scanner sn) {
		/*
		 * creo todas variables necesarias para apostar
		 */
		int[] apostar = new int[10];
		int lugar = 0, numeroUsuario = 0, numeroSheldon = 0;
		Random rn = new Random();
		int lugarSheldon = rn.nextInt(10);
		/*
		 * un bucle que inicializa de forma aleatoria todos los arrays de 1 a 100
		 */
		for (int i = 0; i < apostar.length; i++) {
			apostar[i] = rn.nextInt(100) + 1;
		}
		/*
		 * un try catch que si usuario no mete valor de entre 1 o 3 da fallo pero sigue
		 * el juego si nos equivocamos y no cuenta el intento de los tres igual con
		 * fallo de meter un caracter posteriormente decision de sheldon aleatorio a
		 * nosotros si nos lo preguntan despues if que lo comapra cual es as alta
		 */
		for (int i = 0; i < 1; i++) {
			try {
				try {
					System.out.println("¿Elige una posicion de 1 a 10?");
					lugar = sn.nextInt() - 1;
					if (!(lugar <= 9 && lugar >= 0)) {
						throw new IllegalArgumentException("Numero fuera de rango");
					}
					numeroUsuario = apostar[lugar];
					numeroSheldon = apostar[lugarSheldon];
					if (numeroUsuario > numeroSheldon) {
						System.out.println("Gana Usuario");
						System.out.println("Numero de Usuario fue: " + numeroUsuario);
						System.out.println("Numero de Usuario fue: " + numeroSheldon);
					} else if (numeroUsuario < numeroSheldon) {
						System.out.println("Gana Sheldon");
						System.out.println("Numero de Usuario fue: " + numeroUsuario);
						System.out.println("Numero de Usuario fue: " + numeroSheldon);
					} else {
						System.out.println("Empate");
						System.out.println("Numero de Usuario fue: " + numeroUsuario);
						System.out.println("Numero de Usuario fue: " + numeroSheldon);
					}
				} catch (IllegalArgumentException e) {
					System.out.println("\033[091mEsta fuera de rango posible\033[033m");
					i--;
				}
			} catch (InputMismatchException e) {
				System.out.println("\033[091mSolo numeros.\033[033m");
				i--;
				sn.next();
			}

		}

	}

	private static void adivinarMetodo(Scanner sn) {
		/*
		 * creo todas variables necesarias para apostar
		 */
		Random rn = new Random();
		int numeroUsuario = 0;
		int numeroSheldon = rn.nextInt(10) + 1;
		System.out.println("\033[091mDime que numero puede ser el mio?(entre 1 a 10)\033[033m");
		/*
		 * un try catch que si usuario no mete valor de entre 1 o 10 vuelve al menu
		 * posteriormente decision de sheldon aleatorio a nosotros si nos lo preguntan
		 * despues if que nos avisa si su numero es mas alto bajo o si ganamos, bucle
		 * for para dar dos oportunidades
		 */

		for (int i = 0; i < 2; i++) {
			try {
				try {
					numeroUsuario = sn.nextInt();
					if (!(numeroUsuario <= 10 && numeroUsuario >= 1)) {
						throw new IllegalArgumentException("Numero fuera de rango");
					}

					if (numeroSheldon == numeroUsuario) {
						System.out.println("\033[091mGanaste\033[033m");
						i = 2;
					} else if (numeroSheldon > numeroUsuario) {
						System.out.println("\033[091mEs mas alto que tuyo\033[033m");
					} else {
						System.out.println("\033[091mEs mas bajo que tuyo\033[033m");
					}
				} catch (IllegalArgumentException e) {
					System.out.println("\033[091mEsta fuera de rango, Intenta otra vez\033[033m");
					i--;
				}
			} catch (InputMismatchException e) {
				System.out.println("\033[091mSolo numeros.\033[033m");
				i--;
				sn.next();
			}
		}
		/*
		 * si no acertaste comunicado con risa
		 */
		if (!(numeroSheldon == numeroUsuario)) {
			System.out.println("\033[091mHaHahaha (mensaje humoristico)\033[033m");
		}
	}

	private static int jugarMetodo(Scanner sn, int opcion) {
		/*
		 * creo todas variables necesarias para apostar
		 */
		Random rn = new Random();
		int numeroSheldon = 0, numeroUsuario = 0, victoriaSheldon = 0, victoriaUsuario = 0;
		System.out.println("\033[091mVamos a jugar a Piedra, Papel, Tijeras a mejor de tres.\n"
				+ "\033[033m1.Para Piedra\n2.Para Tijera\n2.Para Papel\033[033m");
		for (int i = 0; i < 3; i++) {
			/*
			 * un try catch que si usuario no mete valor de entre 1 o 3 da fallo pero sigue
			 * el juego si nos equivocamos y no cuenta el intento de los tres igual con
			 * fallo de meter un caracter tampoco el empate posteriormente decision de
			 * sheldon aleatorio a nosotros si nos lo preguntan despues if que lo comapra
			 * cual es as alta
			 */
			try {
				try {
					numeroSheldon = rn.nextInt(3) + 1;
					numeroUsuario = sn.nextInt();
					if (!(numeroUsuario <= 3 && numeroUsuario >= 1)) {
						throw new IllegalArgumentException("Numero fuera de rango");
					}
					if (numeroSheldon == numeroUsuario) {
						System.out.println("Empate");
						i--;
					}
					if ((numeroSheldon == 1 && numeroUsuario == 2) || (numeroSheldon == 2 && numeroUsuario == 3)
							|| (numeroSheldon == 3 && numeroUsuario == 1)) {
						System.out.println("Gana Seldon");
						victoriaSheldon++;
					}
					if ((numeroSheldon == 1 && numeroUsuario == 3) || (numeroSheldon == 2 && numeroUsuario == 1)
							|| (numeroSheldon == 3 && numeroUsuario == 2)) {
						System.out.println("Gana Usuario");
						victoriaUsuario++;
					}

				} catch (IllegalArgumentException e) {
					System.out.println("\033[091mEsta fuera de rango posible\033[033m");
					i--;
				}
			} catch (InputMismatchException e) {
				System.out.println("\033[091mSolo numeros.\033[033m");
				i--;
				sn.next();
			}
			/*
			 * para saber quien gana
			 */
		}
		if (victoriaSheldon > victoriaUsuario) {
			System.out.println("\n\n\033[091mNo eres rival para mi!\033[033m");
			opcion = 5;
		} else {
			System.out.println("\n\nLa Partida Gana Usuario");
		}
		return opcion;
	}

	private static int pelearMetodo(int opcion) {
		/*
		 * texto final
		 */
		System.out.println("\033[091m¿De Verdad esperas que participe en una demostracion primitiva de fuerza bruta?\n"
				+ "Eso seria como pedirle a un premio Nobel que compita en un concurso de comer hot dogs\n"
				+ "No gracias");
		opcion = 5;
		return opcion;
	}

}
