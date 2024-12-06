package com.co.bdb.utilidad;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Leer {

	// Scanner para pedir datos
	private Scanner sc;

	public Leer() {
		sc = new Scanner(System.in);
		//sc.useDelimiter("\n"); // Usado para nextLine()
		//sc.useLocale(Locale.US); // Para double
	}

	public byte pedirByte() {

		byte num = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println("Introduce un numero entero byte");
				num = sc.nextByte();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			// En caso de error, muestro el error
			if (!correcto) {
				System.out.println("Error, introducce un numero entero byte");
			}

		} while (!correcto);

		return num;
	}

	public byte pedirByte(String mensaje) {

		byte num = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				num = sc.nextByte();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			// En caso de error, muestro el error
			if (!correcto) {
				System.out.println("Error, introducce un numero entero byte");
			}

		} while (!correcto);

		return num;
	}

	public byte pedirByte(String mensaje, String mensajeError) {

		byte num = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				num = sc.nextByte();
			} catch (InputMismatchException ex) {
				// En caso de error se marca como incorrecto
				correcto = false;
				sc.next();
			}

			// En caso de error muestro el error
			if (!correcto) {
				System.out.println(mensajeError);
			}

		} while (!correcto);

		return num;
	}

	public byte pedirBytePositivo() {

		byte num;
		do {
			try {
				System.out.println("Introduce un numero entero byte positivo");
				num = sc.nextByte();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno negativo
				num = -1;
				sc.next();
			}

			if (num < 0) {
				System.out.println("Error, introducce un numero entero byte positivo");
			}

		} while (num < 0);

		return num;
	}

	public byte pedirBytePositivo(String mensaje) {

		byte num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextByte();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno negativo
				num = -1;
				sc.next();
			}

			if (num < 0) {
				System.out.println("Error, introducce un numero entero byte positivo");
			}

		} while (num < 0);

		return num;
	}

	public byte pedirBytePositivo(String mensaje, String mensajeError) {

		byte num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextByte();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno negativo
				num = -1;
				sc.next();
			}

			if (num < 0) {
				System.out.println(mensajeError);
			}

		} while (num < 0);

		return num;
	}

	public byte pedirByteNegativo() {
		byte num;
		do {
			try {
				System.out.println("Introduce un numero entero byte negativo");
				num = sc.nextByte();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno positivo
				num = 1;
				sc.next();
			}

			if (num >= 0) {
				System.out.println("Error, introducce un numero entero byte negativo");
			}

		} while (num >= 0);

		return num;
	}

	public byte pedirByteNegativo(String mensaje) {
		byte num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextByte();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno positivo
				num = 1;
				sc.next();
			}

			if (num >= 0) {
				System.out.println("Error, introducce un numero entero byte negativo");
			}

		} while (num >= 0);

		return num;
	}

	public byte pedirByteNegativo(String mensaje, String mensajeError) {
		byte num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextByte();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno positivo
				num = 1;
				sc.next();
			}

			if (num >= 0) {
				System.out.println(mensajeError);
			}

		} while (num >= 0);

		return num;
	}

	public byte pedirByteRango(byte minimo, byte maximo) {
		byte num;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			byte aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println("Introduce un numero byte entre " + minimo + " y " + maximo);
				num = sc.nextByte();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como un numero no valido
				num = (byte) (maximo + 1);
				sc.next();
			}

			if (!(num >= minimo && num <= maximo)) {
				System.out.println("Error, Introduce un numero byte entre " + minimo + " y " + maximo);
			}

		} while (!(num >= minimo && num <= maximo));

		return num;
	}

	public byte pedirByteRango(byte minimo, byte maximo, String mensaje) {
		byte num;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			byte aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println(mensaje);
				num = sc.nextByte();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como un numero no valido
				num = (byte) (maximo + 1);
				sc.next();
			}

			if (!(num >= minimo && num <= maximo)) {
				System.out.println("Error, Introduce un numero byte entre " + minimo + " y " + maximo);
			}

		} while (!(num >= minimo && num <= maximo));

		return num;
	}

	public byte pedirByteRango(byte minimo, byte maximo, String mensaje, String mensajeError) {
		byte num;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			byte aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println(mensaje);
				num = sc.nextByte();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como un numero no valido
				num = (byte) (maximo + 1);
				sc.next();
			}

			if (!(num >= minimo && num <= maximo)) {
				System.out.println(mensajeError);
			}

		} while (!(num >= minimo && num <= maximo));

		return num;
	}

	public int pedirInt() {

		int num = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println("Introduce un numero entero integer");
				num = sc.nextInt();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			// En caso de error, muestro el error
			if (!correcto) {
				System.out.println("Error, introducce un numero entero integer");
			}

		} while (!correcto);

		return num;
	}

	public int pedirInt(String mensaje) {

		int num = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.print(mensaje + "\t");
				num = sc.nextInt();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			// En caso de error, muestro el error
			if (!correcto) {
				System.out.println("Error, introducce un numero entero integer");
			}

		} while (!correcto);

		return num;
	}

	public int pedirInt(String mensaje, String mensajeError) {

		int num = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				num = sc.nextInt();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			// En caso de error, muestro el error
			if (!correcto) {
				System.out.println(mensajeError);
			}

		} while (!correcto);

		return num;
	}

	public int pedirIntPositivo() {

		int num;
		do {
			try {
				System.out.println("Introduce un numero entero positivo integer");
				num = sc.nextInt();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno negativo
				num = -1;
				sc.next();
			}

			if (num < 0) {
				System.out.println("Error, introducce un numero entero positivo integer");
			}

		} while (num < 0);

		return num;
	}

	public int pedirIntPositivo(String mensaje) {

		int num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextInt();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno negativo
				num = -1;
				sc.next();
			}

			if (num < 0) {
				System.out.println("Error, introducce un numero entero positivo integer");
			}

		} while (num < 0);

		return num;
	}

	public int pedirIntPositivo(String mensaje, String mensajeError) {

		int num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextInt();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno negativo
				num = -1;
				sc.next();
			}

			if (num < 0) {
				System.out.println(mensajeError);
			}

		} while (num < 0);

		return num;
	}

	public int pedirIntNegativo() {
		int num;
		do {
			try {
				System.out.println("Introduce un numero entero negativo integer");
				num = sc.nextInt();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno positivo
				num = 1;
				sc.next();
			}

			if (num >= 0) {
				System.out.println("Error, introducce un numero entero negativo integer");
			}

		} while (num >= 0);

		return num;
	}

	public int pedirIntNegativo(String mensaje) {
		int num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextInt();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno positivo
				num = 1;
				sc.next();
			}

			if (num >= 0) {
				System.out.println("Error, introducce un numero entero negativo integer");
			}

		} while (num >= 0);

		return num;
	}

	public int pedirIntNegativo(String mensaje, String mensajeError) {
		int num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextInt();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno positivo
				num = 1;
				sc.next();
			}

			if (num >= 0) {
				System.out.println(mensajeError);
			}

		} while (num >= 0);

		return num;
	}

	public int pedirIntRango(int minimo, int maximo) {
		int num;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			int aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println("Introduce un numero integer entre " + minimo + " y " + maximo);
				num = sc.nextInt();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como un numero no valido
				num = maximo + 1;
				sc.next();
			}

			if (!(num >= minimo && num <= maximo)) {
				System.out.println("Error, Introduce un numero integer entre " + minimo + " y " + maximo);
			}

		} while (!(num >= minimo && num <= maximo));

		return num;
	}

	public int pedirIntRango(int minimo, int maximo, String mensaje) {
		int num;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			int aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println(mensaje);
				num = sc.nextInt();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como un numero no valido
				num = maximo + 1;
				sc.next();
			}

			if (!(num >= minimo && num <= maximo)) {
				System.out.println("Error, Introduce un numero integer entre " + minimo + " y " + maximo);
			}

		} while (!(num >= minimo && num <= maximo));

		return num;
	}

	public int pedirIntRango(int minimo, int maximo, String mensaje, String mensajeError) {
		int num;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			int aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println(mensaje);
				num = sc.nextInt();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como un numero no valido
				num = maximo + 1;
				sc.next();
			}

			if (!(num >= minimo && num <= maximo)) {
				System.out.println(mensajeError);
			}

		} while (!(num >= minimo && num <= maximo));

		return num;
	}

	public String pedirString() {

		System.out.println("Introduce una cadena");
		String cadena = sc.next();

		return cadena;

	}

	public String pedirString(String mensaje) {

		System.out.print(mensaje + "\t");
		String cadena = sc.next();

		return cadena;

	}

	public String pedirString(int longitudMaxima) {

		String cadena = "";
		do {
			System.out.println("Introduce una cadena");
			cadena = sc.next();

			if (!(cadena.length() < longitudMaxima)) {
				System.out.println("Error, la longitud maxima es " + longitudMaxima + " caracteres");
			}

		} while (!(cadena.length() < longitudMaxima));

		return cadena;

	}

	public String pedirString(int longitudMaxima, String mensaje) {

		String cadena = "";
		do {
			System.out.println(mensaje);
			cadena = sc.next();

			if (!(cadena.length() < longitudMaxima)) {
				System.out.println("Error, la longitud maxima es " + longitudMaxima + " caracteres");
			}

		} while (!(cadena.length() < longitudMaxima));

		return cadena;

	}

	public String pedirString(int longitudMaxima, String mensaje, String mensajeError) {

		String cadena = "";
		do {
			System.out.println(mensaje);
			cadena = sc.next();

			if (!(cadena.length() < longitudMaxima)) {
				System.out.println(mensajeError);
			}

		} while (!(cadena.length() < longitudMaxima));

		return cadena;

	}

	public long pedirLong() {

		long num = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println("Introduce un numero entero long");
				num = sc.nextLong();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			// En caso de error, muestro el error
			if (!correcto) {
				System.out.println("Error, introducce un numero entero long");
			}

		} while (!correcto);

		return num;
	}

	public long pedirLong(String mensaje) {

		long num = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				num = sc.nextLong();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			// En caso de error, muestro el error
			if (!correcto) {
				System.out.println("Error, introducce un numero entero long");
			}

		} while (!correcto);

		return num;
	}

	public long pedirLong(String mensaje, String mensajeError) {

		long num = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				num = sc.nextLong();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			// En caso de error, muestro el error
			if (!correcto) {
				System.out.println(mensajeError);
			}

		} while (!correcto);

		return num;
	}

	public long pedirLongPositivo() {

		long num;
		do {
			try {
				System.out.println("Introduce un numero entero positivo long");
				num = sc.nextLong();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno negativo
				num = -1;
				sc.next();
			}

			if (num < 0) {
				System.out.println("Error, introducce un numero entero positivo long");
			}

		} while (num < 0);

		return num;
	}

	public long pedirLongPositivo(String mensaje) {

		long num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextLong();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno negativo
				num = -1;
				sc.next();
			}

			if (num < 0) {
				System.out.println("Error, introducce un numero entero positivo long");
			}

		} while (num < 0);

		return num;
	}

	public long pedirLongPositivo(String mensaje, String mensajeError) {

		long num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextLong();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno negativo
				num = -1;
				sc.next();
			}

			if (num < 0) {
				System.out.println(mensajeError);
			}

		} while (num < 0);

		return num;
	}

	public long pedirLongNegativo() {
		long num;
		do {
			try {
				System.out.println("Introduce un numero entero negativo long");
				num = sc.nextLong();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno positivo
				num = 1;
				sc.next();
			}

			if (num >= 0) {
				System.out.println("Error, introducce un numero entero negativo long");
			}

		} while (num >= 0);

		return num;
	}

	public long pedirLongNegativo(String mensaje) {
		long num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextLong();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno positivo
				num = 1;
				sc.next();
			}

			if (num >= 0) {
				System.out.println("Error, introducce un numero entero negativo long");
			}

		} while (num >= 0);

		return num;
	}

	public long pedirLongNegativo(String mensaje, String mensajeError) {
		long num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextLong();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno positivo
				num = 1;
				sc.next();
			}

			if (num >= 0) {
				System.out.println(mensajeError);
			}

		} while (num >= 0);

		return num;
	}

	public long pedirLongRango(long minimo, long maximo) {
		long num;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			long aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println("Introduce un numero long entre " + minimo + " y " + maximo);
				num = sc.nextLong();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como un numero no valido
				num = (byte) (maximo + 1);
				sc.next();
			}

			if (!(num >= minimo && num <= maximo)) {
				System.out.println("Error, Introduce un numero long entre " + minimo + " y " + maximo);
			}

		} while (!(num >= minimo && num <= maximo));

		return num;
	}

	public long pedirLongRango(long minimo, long maximo, String mensaje) {
		long num;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			long aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println(mensaje);
				num = sc.nextLong();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como un numero no valido
				num = (byte) (maximo + 1);
				sc.next();
			}

			if (!(num >= minimo && num <= maximo)) {
				System.out.println("Error, Introduce un numero long entre " + minimo + " y " + maximo);
			}

		} while (!(num >= minimo && num <= maximo));

		return num;
	}

	public long pedirLongRango(long minimo, long maximo, String mensaje, String mensajeError) {
		long num;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			long aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println(mensaje);
				num = sc.nextLong();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como un numero no valido
				num = (byte) (maximo + 1);
				sc.next();
			}

			if (!(num >= minimo && num <= maximo)) {
				System.out.println(mensajeError);
			}

		} while (!(num >= minimo && num <= maximo));

		return num;
	}

	public short pedirShort() {

		short num = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println("Introduce un numero entero short");
				num = sc.nextShort();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			// En caso de error, muestro el error
			if (!correcto) {
				System.out.println("Error, introducce un numero entero short");
			}

		} while (!correcto);

		return num;
	}

	public short pedirShort(String mensaje) {

		short num = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				num = sc.nextShort();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			// En caso de error, muestro el error
			if (!correcto) {
				System.out.println("Error, introducce un numero entero short");
			}

		} while (!correcto);

		return num;
	}

	public short pedirShort(String mensaje, String mensajeError) {

		short num = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				num = sc.nextShort();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			// En caso de error, muestro el error
			if (!correcto) {
				System.out.println(mensajeError);
			}

		} while (!correcto);

		return num;
	}

	public short pedirShortPositivo() {

		short num;
		do {
			try {
				System.out.println("Introduce un numero entero positivo short");
				num = sc.nextShort();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno negativo
				num = -1;
				sc.next();
			}

			if (num < 0) {
				System.out.println("Error, introducce un numero entero positivo short");
			}

		} while (num < 0);

		return num;
	}

	public short pedirShortPositivo(String mensaje) {

		short num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextShort();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno negativo
				num = -1;
				sc.next();
			}

			if (num < 0) {
				System.out.println("Error, introducce un numero entero positivo short");
			}

		} while (num < 0);

		return num;
	}

	public short pedirShortPositivo(String mensaje, String mensajeError) {

		short num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextShort();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno negativo
				num = -1;
				sc.next();
			}

			if (num < 0) {
				System.out.println(mensajeError);
			}

		} while (num < 0);

		return num;
	}

	public short pedirShortNegativo() {
		short num;
		do {
			try {
				System.out.println("Introduce un numero entero negativo short");
				num = sc.nextShort();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno positivo
				num = 1;
				sc.next();
			}

			if (num >= 0) {
				System.out.println("Error, introducce un numero entero negativo short");
			}

		} while (num >= 0);

		return num;
	}

	public short pedirShortNegativo(String mensaje) {
		short num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextShort();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno positivo
				num = 1;
				sc.next();
			}

			if (num >= 0) {
				System.out.println("Error, introducce un numero entero negativo short");
			}

		} while (num >= 0);

		return num;
	}

	public short pedirShortNegativo(String mensaje, String mensajeError) {
		short num;
		do {
			try {
				System.out.println(mensaje);
				num = sc.nextShort();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como uno positivo
				num = 1;
				sc.next();
			}

			if (num >= 0) {
				System.out.println(mensajeError);
			}

		} while (num >= 0);

		return num;
	}

	public short pedirShortRango(long minimo, long maximo) {
		short num;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			long aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println("Introduce un numero short entre " + minimo + " y " + maximo);
				num = sc.nextShort();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como un numero no valido
				num = (byte) (maximo + 1);
				sc.next();
			}

			if (!(num >= minimo && num <= maximo)) {
				System.out.println("Error, Introduce un numero short entre " + minimo + " y " + maximo);
			}

		} while (!(num >= minimo && num <= maximo));

		return num;
	}

	public short pedirShortRango(short minimo, short maximo, String mensaje) {
		short num;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			short aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println(mensaje);
				num = sc.nextShort();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como un numero no valido
				num = (byte) (maximo + 1);
				sc.next();
			}

			if (!(num >= minimo && num <= maximo)) {
				System.out.println("Error, Introduce un numero short entre " + minimo + " y " + maximo);
			}

		} while (!(num >= minimo && num <= maximo));

		return num;
	}

	public short pedirShortRango(short minimo, short maximo, String mensaje, String mensajeError) {
		short num;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			short aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println(mensaje);
				num = sc.nextShort();
			} catch (InputMismatchException ex) {
				// En caso de error, el num se marca como un numero no valido
				num = (byte) (maximo + 1);
				sc.next();
			}

			if (!(num >= minimo && num <= maximo)) {
				System.out.println(mensajeError);
			}

		} while (!(num >= minimo && num <= maximo));

		return num;
	}

	public double pedirDouble() {

		double real = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println("Introduce un numero real double");
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			if (!correcto) {
				System.out.println("Error, introduce un numero real double");
			}

		} while (!correcto);

		return real;

	}

	public double pedirDouble(String mensaje) {

		double real = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			if (!correcto) {
				System.out.println("Error, introduce un numero real");
			}

		} while (!correcto);

		return real;

	}

	public double pedirDouble(String mensaje, String mensajeError) {

		double real = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			if (!correcto) {
				System.out.println(mensajeError);
			}

		} while (!correcto);

		return real;

	}

	public double pedirDoublePositivo() {

		double real;
		do {
			try {
				System.out.println("Introduce un numero real positivo double");
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				real = -1;
				sc.next();
			}

			if (real < 0) {
				System.out.println("Error, introducce un numero real positivo double");
			}

		} while (real < 0);

		return real;
	}

	public double pedirDoublePositivo(String mensaje) {

		double real;
		do {
			try {
				System.out.println(mensaje);
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				real = -1;
				sc.next();
			}

			if (real < 0) {
				System.out.println("Error, introducce un numero real positivo double");
			}

		} while (real < 0);

		return real;
	}

	public double pedirDoublePositivo(String mensaje, String mensajeError) {

		double real;
		do {
			try {
				System.out.println(mensaje);
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				real = -1;
				sc.next();
			}

			if (real < 0) {
				System.out.println(mensajeError);
			}

		} while (real < 0);

		return real;
	}

	public double pedirDoubleNegativo() {
		double real;
		do {
			try {
				System.out.println("Introduce un numero real negativo double");
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				real = 1;
				sc.next();
			}

			if (real >= 0) {
				System.out.println("Error, introducce un numero real negativo double");
			}

		} while (real >= 0);

		return real;
	}

	public double pedirDoubleNegativo(String mensaje) {
		double real;
		do {
			try {
				System.out.println(mensaje);
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				real = 1;
				sc.next();
			}

			if (real >= 0) {
				System.out.println("Error, introducce un numero real negativo double");
			}

		} while (real >= 0);

		return real;
	}

	public double pedirDoubleNegativo(String mensaje, String mensajeError) {
		double real;
		do {
			try {
				System.out.println(mensaje);
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				real = 1;
				sc.next();
			}

			if (real >= 0) {
				System.out.println(mensajeError);
			}

		} while (real >= 0);

		return real;
	}

	public double pedirDoubleRango(double minimo, double maximo) {

		double real;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			double aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println("Introduce un numero double entre " + minimo + " y " + maximo);
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				real = maximo + 1;
				sc.next();
			}

			if (!(real >= minimo && real <= maximo)) {
				System.out
						.println("Error, Introduce un numero double entre " + minimo + " y " + maximo + " como maximo");
			}

		} while (!(real >= minimo && real <= maximo));

		return real;
	}

	public double pedirDoubleRango(double minimo, double maximo, String mensaje) {

		double real;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			double aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println(mensaje);
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				real = maximo + 1;
				sc.next();
			}

			if (!(real >= minimo && real <= maximo)) {
				System.out
						.println("Error, Introduce un numero double entre " + minimo + " y " + maximo + " como maximo");
			}

		} while (!(real >= minimo && real <= maximo));

		return real;
	}

	public double pedirDoubleRango(double minimo, double maximo, String mensaje, String mensajeError) {

		double real;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			double aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println(mensaje);
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				real = maximo + 1;
				sc.next();
			}

			if (!(real >= minimo && real <= maximo)) {
				System.out.println(mensajeError);
			}

		} while (!(real >= minimo && real <= maximo));

		return real;
	}

	public double pedirDoubleDecimales(int decimales) {

		if (decimales < 1) {
			decimales = 1;
		}

		double real = 0;
		boolean correcto;
		String[] parteDecimal;
		do {
			correcto = true;
			try {
				System.out.println("Introduce un numero real double con " + decimales + " decimales como maximo");
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				correcto = false;
				sc.next();
			}

			if (!correcto) {
				System.out.println("Error, introduce un numero real double");
			} else {
				parteDecimal = String.valueOf(real).split("\\.");

				if (parteDecimal[1].length() > decimales) {
					correcto = false;
					System.out.println("Error, el numero de decimales debe ser " + decimales + " como maximo");
				}
			}

		} while (!correcto);

		return real;

	}

	public double pedirDoubleDecimales(int decimales, String mensaje) {

		if (decimales < 1) {
			decimales = 1;
		}

		double real = 0;
		boolean correcto;
		String[] parteDecimal;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				correcto = false;
				sc.next();
			}

			if (!correcto) {
				System.out.println("Error, introduce un numero real double");
			} else {
				parteDecimal = String.valueOf(real).split("\\.");

				if (parteDecimal[1].length() > decimales) {
					correcto = false;
					System.out.println("Error, el numero de decimales debe ser " + decimales + " como maximo");
				}
			}

		} while (!correcto);

		return real;

	}

	public double pedirDoubleDecimales(int decimales, String mensaje, String mensajeError) {

		if (decimales < 1) {
			decimales = 1;
		}

		double real = 0;
		boolean correcto;
		String[] parteDecimal;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				correcto = false;
				sc.next();
			}

			if (!correcto) {
				System.out.println(mensajeError);
			} else {
				parteDecimal = String.valueOf(real).split("\\.");

				if (parteDecimal[1].length() > decimales) {
					correcto = false;
					System.out.println("Error, el numero de decimales debe ser " + decimales + " como maximo");
				}
			}

		} while (!correcto);

		return real;

	}

	public double pedirDoublePositivoDecimales(int decimales) {

		double real;
		String[] parteDecimal;
		do {
			try {
				System.out.println(
						"Introduce un numero real positivo double con " + decimales + " decimales como maximo");
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				real = -1;
				sc.next();
			}

			if (real < 0) {
				System.out.println("Error, introducce un numero real positivo double");
			} else {
				parteDecimal = String.valueOf(real).split("\\.");

				if (parteDecimal[1].length() > decimales) {
					real = -1;
					System.out.println("Error, el numero de decimales debe ser " + decimales);
				}
			}

		} while (real < 0);

		return real;
	}

	public double pedirDoublePositivoDecimales(int decimales, String mensaje) {

		double real;
		String[] parteDecimal;
		do {
			try {
				System.out.println(mensaje);
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				real = -1;
				sc.next();
			}

			if (real < 0) {
				System.out.println("Error, introducce un numero real positivo double");
			} else {
				parteDecimal = String.valueOf(real).split("\\.");

				if (parteDecimal[1].length() > decimales) {
					real = -1;
					System.out.println("Error, el numero de decimales debe ser " + decimales);
				}
			}

		} while (real < 0);

		return real;
	}

	public double pedirDoublePositivoDecimales(int decimales, String mensaje, String mensajeError) {

		double real;
		String[] parteDecimal;
		do {
			try {
				System.out.println(mensaje);
				real = sc.nextDouble();
			} catch (InputMismatchException ex) {
				real = -1;
				sc.next();
			}

			if (real < 0) {
				System.out.println(mensajeError);
			} else {
				parteDecimal = String.valueOf(real).split("\\.");

				if (parteDecimal[1].length() > decimales) {
					real = -1;
					System.out.println("Error, el numero de decimales debe ser " + decimales);
				}
			}

		} while (real < 0);

		return real;
	}

	public float pedirFloat() {

		float real = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println("Introduce un numero real float");
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			if (!correcto) {
				System.out.println("Error, introduce un numero real float");
			}

		} while (!correcto);

		return real;

	}

	public float pedirFloat(String mensaje) {

		float real = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.print(mensaje + "\t");
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			if (!correcto) {
				System.out.println("Error, introduce un numero real float");
			}

		} while (!correcto);

		return real;

	}

	public float pedirFloat(String mensaje, String mensajeError) {

		float real = 0;
		boolean correcto;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				// En caso de error, se marca como incorrecto
				correcto = false;
				sc.next();
			}

			if (!correcto) {
				System.out.println(mensajeError);
			}

		} while (!correcto);

		return real;

	}

	public float pedirFloatPositivo() {

		float real;
		do {
			try {
				System.out.println("Introduce un numero real positivo float");
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				real = -1;
				sc.next();
			}

			if (real < 0) {
				System.out.println("Error, introducce un numero real positivo float");
			}

		} while (real < 0);

		return real;
	}

	public float pedirFloatPositivo(String mensaje) {

		float real;
		do {
			try {
				System.out.println(mensaje);
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				real = -1;
				sc.next();
			}

			if (real < 0) {
				System.out.println("Error, introducce un numero real positivo float");
			}

		} while (real < 0);

		return real;
	}

	public float pedirFloatPositivo(String mensaje, String mensajeError) {

		float real;
		do {
			try {
				System.out.println(mensaje);
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				real = -1;
				sc.next();
			}

			if (real < 0) {
				System.out.println(mensajeError);
			}

		} while (real < 0);

		return real;
	}

	public float pedirFloatNegativo() {
		float real;
		do {
			try {
				System.out.println("Introduce un numero real negativo float");
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				real = 1;
				sc.next();
			}

			if (real >= 0) {
				System.out.println("Error, introducce un numero real negativo float");
			}

		} while (real >= 0);

		return real;
	}

	public float pedirFloatNegativo(String mensaje) {
		float real;
		do {
			try {
				System.out.println(mensaje);
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				real = 1;
				sc.next();
			}

			if (real >= 0) {
				System.out.println("Error, introducce un numero real negativo float");
			}

		} while (real >= 0);

		return real;
	}

	public float pedirFloatNegativo(String mensaje, String mensajeError) {
		float real;
		do {
			try {
				System.out.println(mensaje);
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				real = 1;
				sc.next();
			}

			if (real >= 0) {
				System.out.println(mensajeError);
			}

		} while (real >= 0);

		return real;
	}

	public float pedirFloatRango(float minimo, float maximo) {

		float real;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			float aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println("Introduce un numero float entre " + minimo + " y " + maximo);
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				real = maximo + 1;
				sc.next();
			}

			if (!(real >= minimo && real <= maximo)) {
				System.out
						.println("Error, Introduce un numero float entre " + minimo + " y " + maximo + " como maximo");
			}

		} while (!(real >= minimo && real <= maximo));

		return real;
	}

	public float pedirFloatRango(float minimo, float maximo, String mensaje) {

		float real;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			float aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println(mensaje);
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				real = maximo + 1;
				sc.next();
			}

			if (!(real >= minimo && real <= maximo)) {
				System.out
						.println("Error, Introduce un numero float entre " + minimo + " y " + maximo + " como maximo");
			}

		} while (!(real >= minimo && real <= maximo));

		return real;
	}

	public float pedirFloatRango(float minimo, float maximo, String mensaje, String mensajeError) {

		float real;

		// En caso de el minimo sea mas grande, se intercambia
		if (minimo > maximo) {
			float aux = minimo;
			minimo = maximo;
			maximo = aux;
		}

		do {
			try {
				System.out.println(mensaje);
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				real = maximo + 1;
				sc.next();
			}

			if (!(real >= minimo && real <= maximo)) {
				System.out.println(mensajeError);
			}

		} while (!(real >= minimo && real <= maximo));

		return real;
	}

	public float pedirFloatDecimales(int decimales) {

		if (decimales < 1) {
			decimales = 1;
		}

		float real = 0;
		boolean correcto;
		String[] parteDecimal;
		do {
			correcto = true;
			try {
				System.out.println("Introduce un numero real float con " + decimales + " decimales como maximo");
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				correcto = false;
				sc.next();
			}

			if (!correcto) {
				System.out.println("Error, introduce un numero real float");
			} else {
				parteDecimal = String.valueOf(real).split("\\.");

				if (parteDecimal[1].length() > decimales) {
					correcto = false;
					System.out.println("Error, el numero de decimales debe ser " + decimales + " como maximo");
				}
			}

		} while (!correcto);

		return real;

	}

	public float pedirFloatDecimales(int decimales, String mensaje) {

		if (decimales < 1) {
			decimales = 1;
		}

		float real = 0;
		boolean correcto;
		String[] parteDecimal;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				correcto = false;
				sc.next();
			}

			if (!correcto) {
				System.out.println("Error, introduce un numero real float con " + decimales + " decimales como maximo");
			} else {
				parteDecimal = String.valueOf(real).split("\\.");

				if (parteDecimal[1].length() > decimales) {
					correcto = false;
					System.out.println("Error, el numero de decimales debe ser " + decimales + " como maximo");
				}
			}

		} while (!correcto);

		return real;

	}

	public float pedirFloatDecimales(int decimales, String mensaje, String mensajeError) {

		if (decimales < 1) {
			decimales = 1;
		}

		float real = 0;
		boolean correcto;
		String[] parteDecimal;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				correcto = false;
				sc.next();
			}

			if (!correcto) {
				System.out.println(mensajeError);
			} else {
				parteDecimal = String.valueOf(real).split("\\.");

				if (parteDecimal[1].length() > decimales) {
					correcto = false;
					System.out.println("Error, el numero de decimales debe ser " + decimales + " como maximo");
				}
			}

		} while (!correcto);

		return real;

	}

	public float pedirFloatPositivoDecimales(int decimales) {

		float real;
		String[] parteDecimal;
		do {
			try {
				System.out
						.println("Introduce un numero real positivo float con " + decimales + " decimales como maximo");
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				real = -1;
				sc.next();
			}

			if (real < 0) {
				System.out.println("Error, introducce un numero real positivo float");
			} else {
				parteDecimal = String.valueOf(real).split("\\.");

				if (parteDecimal[1].length() > decimales) {
					real = -1;
					System.out.println("Error, el numero de decimales debe ser " + decimales);
				}
			}

		} while (real < 0);

		return real;
	}

	public float pedirFloatPositivoDecimales(int decimales, String mensaje) {

		float real;
		String[] parteDecimal;
		do {
			try {
				System.out.println(mensaje);
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				real = -1;
				sc.next();
			}

			if (real < 0) {
				System.out.println("Error, introducce un numero real positivo float");
			} else {
				parteDecimal = String.valueOf(real).split("\\.");

				if (parteDecimal[1].length() > decimales) {
					real = -1;
					System.out.println("Error, el numero de decimales debe ser " + decimales);
				}
			}

		} while (real < 0);

		return real;
	}

	public float pedirFloatPositivoDecimales(int decimales, String mensaje, String mensajeError) {

		float real;
		String[] parteDecimal;
		do {
			try {
				System.out.println(mensaje);
				real = sc.nextFloat();
			} catch (InputMismatchException ex) {
				real = -1;
				sc.next();
			}

			if (real < 0) {
				System.out.println(mensajeError);
			} else {
				parteDecimal = String.valueOf(real).split("\\.");

				if (parteDecimal[1].length() > decimales) {
					real = -1;
					System.out.println("Error, el numero de decimales debe ser " + decimales);
				}
			}

		} while (real < 0);

		return real;
	}

	public char pedirChar() {

		System.out.println("Introduce un caracter (en caso de tener mas de un caracter, se cogera el primer caracter)");
		char caracter = sc.next().charAt(0);

		return caracter;

	}

	public char pedirChar(String mensaje) {

		System.out.println(mensaje);
		char caracter = sc.next().charAt(0);

		return caracter;

	}

	public boolean pedirBoolean() {

		boolean booleano = false, correcto;
		do {
			correcto = true;
			try {
				System.out.println("Introduce un booleano (true o false)");
				booleano = sc.nextBoolean();
			} catch (Exception ex) {
				correcto = false;
				sc.next();
			}
			if (!correcto) {
				System.out.println("Error, introduce un valor booleano");
			}

		} while (!correcto);

		return booleano;
	}

	public boolean pedirBoolean(String mensaje) {

		boolean booleano = false, correcto;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				booleano = sc.nextBoolean();
			} catch (Exception ex) {
				correcto = false;
				sc.next();
			}
			if (!correcto) {
				System.out.println("Error, introduce un valor booleano");
			}

		} while (!correcto);

		return booleano;
	}

	public boolean pedirBoolean(String mensaje, String mensajeError) {

		boolean booleano = false, correcto;
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				booleano = sc.nextBoolean();
			} catch (Exception ex) {
				correcto = false;
				sc.next();
			}
			if (!correcto) {
				System.out.println(mensajeError);
			}

		} while (!correcto);

		return booleano;
	}

	public boolean pedirBooleanSiNo() {

		boolean correcto, booleano = false;
		String respuesta = "";
		do {
			correcto = true;
			try {
				System.out.println("Introduce Si o No");
				respuesta = sc.next();
				respuesta = respuesta.toLowerCase().trim();
			} catch (Exception ex) {
				correcto = false;
				sc.next();
			}

			if (respuesta.equals("si")) {
				booleano = true;
			} else if (respuesta.equals("no")) {
				booleano = false;
			} else {
				correcto = false;
			}

			if (!(respuesta.equals("si")) || respuesta.equals("no")) {
				correcto = false;
			}

			if (!correcto) {
				System.out.println("Error, introduce un valor booleano");
			}

		} while (!correcto);

		return booleano;
	}

	public boolean pedirBooleanSiNo(String mensaje) {

		boolean correcto, booleano = false;
		String respuesta = "";
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				respuesta = sc.next();
				respuesta = respuesta.toLowerCase().trim();
			} catch (Exception ex) {
				correcto = false;
				sc.next();
			}

			if (respuesta.equals("si")) {
				booleano = true;
			} else if (respuesta.equals("no")) {
				booleano = false;
			} else {
				correcto = false;
			}

			if (!(respuesta.equals("si")) || respuesta.equals("no")) {
				correcto = false;
			}

			if (!correcto) {
				System.out.println("Error, introduce un valor booleano");
			}

		} while (!correcto);

		return booleano;
	}

	public boolean pedirBooleanSiNo(String mensaje, String mensajeError) {

		boolean correcto, booleano = false;
		String respuesta = "";
		do {
			correcto = true;
			try {
				System.out.println(mensaje);
				respuesta = sc.next();
				respuesta = respuesta.toLowerCase().trim();
			} catch (Exception ex) {
				correcto = false;
				sc.next();
			}

			if (respuesta.equals("si")) {
				booleano = true;
			} else if (respuesta.equals("no")) {
				booleano = false;
			} else {
				correcto = false;
			}

			if (!(respuesta.equals("si")) || respuesta.equals("no")) {
				correcto = false;
			}

			if (!correcto) {
				System.out.println(mensajeError);
			}

		} while (!correcto);

		return booleano;
	}

}