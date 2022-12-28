package poo5;

public class Principal {// clase pricpal
	public static void main(String[] args) {/* Metodo main */

		System.out.println("la media es de " + Matriz.media());

		System.out.println("datos sobre la media");

		for (int[] matriz : Promedio.sobreMedia()) {
			for (int sobreMedia : matriz) {
				System.out.print(" " + sobreMedia + " ");
			}
			System.out.println("");
		}

		System.out.println("datos bajo la media");

		for (int[] matriz : Promedio.bajoMedia()) {
			for (int bajoMedia : matriz) {
				System.out.print(" " + bajoMedia + " ");
			}
			System.out.println("");
		}

		/* Metodo main */}
	/* clase pricpal */}