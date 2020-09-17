package arrays_collections.desafio;

import java.util.Arrays;

public class Array_2 {

	public static void main(String[] args) {
		double[] notasAluna = {9.5, 8.6, 7.4};
		double total_notas_aluna = 0;
		for (double notas : notasAluna) {
			total_notas_aluna += notas;
			
		}
		System.out.println(Arrays.toString(notasAluna));
		System.out.println(total_notas_aluna / notasAluna.length);
	}
}
