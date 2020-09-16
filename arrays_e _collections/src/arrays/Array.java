package arrays;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		//System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 9.5;
		notasAlunoA[1] = 5.6;
		notasAlunoA[2] = 7.4;
		
		System.out.println(Arrays.toString(notasAlunoA));
		double total_notas_aluna_a = 0; 
		for (int i = 0; i < notasAlunoA.length; i++) {
			total_notas_aluna_a += notasAlunoA[i];
		}
		System.out.println(total_notas_aluna_a / notasAlunoA.length);
		
		double[] notasAlunaB = {9.5, 8.6, 7.4};
		double total_notas_aluna_b = 0;
		for (int i = 0; i < notasAlunaB.length; i++) {
			total_notas_aluna_b += notasAlunaB[i];
		}
		System.out.println(Arrays.toString(notasAlunaB));
		System.out.println(total_notas_aluna_b / notasAlunaB.length);
	}
	
}
