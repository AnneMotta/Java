package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String exemplo1 = JOptionPane.showInputDialog("Digite um n�mero real: ");
		String exemplo2 = JOptionPane.showInputDialog("Digite outro n�mero real: ");
		
		double converter1 = Double.parseDouble(exemplo1);
		double converter2 = Double.parseDouble(exemplo2);
		
		double soma = converter1 + converter2;
		System.out.println(soma);
	}
}
