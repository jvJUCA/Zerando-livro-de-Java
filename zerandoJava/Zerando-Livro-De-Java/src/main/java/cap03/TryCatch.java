package cap03;

import javax.swing.JOptionPane;

public class TryCatch {
	public static void main(String args[])	{
		try	{
			String aux1 = JOptionPane.showInputDialog("Escreva o valor do primeiro numero!");
			int num1 = Integer.parseInt(aux1.toString());
			String aux2 = JOptionPane.showInputDialog("Escreva o valor do segundo numero!");
			int num2 = Integer.parseInt(aux2.toString());
			JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2) + "\nSubtração = " + (num1 - num2) + "\nDivisão = " + (num1 / num2) +
					"\nMultiplicação = " + (num1 * num2));
		}catch (ArithmeticException erro){
			JOptionPane.showMessageDialog(null,"erro na Divisão por zero! \n*" + erro.toString(),
					"erro",JOptionPane.ERROR_MESSAGE);
		}catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null,"erro de conversão!\n" + erro.toString(),
					"erro",JOptionPane.ERROR_MESSAGE);
		}catch (NullPointerException erro) {
			JOptionPane.showMessageDialog(null,"tecla cancel pressionada\n " + erro.toString(),
					"erro",JOptionPane.ERROR_MESSAGE);
		} finally {
			JOptionPane.showMessageDialog(null, "Obrigado por participar! :)");
		}
		System.exit(0);
			
			
		}
	}


