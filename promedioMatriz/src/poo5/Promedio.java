package poo5;

import java.util.Arrays;

public class Promedio {

	public static int[][] sobreMedia() {

		int sobreMedia[][] = new int[6][9];

		for (int[] matriz : Matriz.Tabla()) {
			for (int dato : matriz) {
				if (dato > Matriz.media()) {
					for (int[] SobreMedia : sobreMedia) {
						Arrays.fill(SobreMedia, dato);
					}
				}
			}
		}

		return sobreMedia;
	}

	public static int[][] bajoMedia() {

		int bajoMedia[][] = new int[6][9];

		for (int[] matriz : Matriz.Tabla()) {
			for (int dato : matriz) {
				if (dato < Matriz.media()) {
					for (int[] BajoMedia : bajoMedia) {
						Arrays.fill(BajoMedia, dato);
					}
				}
			}
		}

		return bajoMedia;
	}
}