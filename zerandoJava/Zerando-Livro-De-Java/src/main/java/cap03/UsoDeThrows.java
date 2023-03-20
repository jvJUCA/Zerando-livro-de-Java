package cap03;

import java.io.*;

import javax.swing.JOptionPane;

public class UsoDeThrows {
	public static void main(String args[]) throws IOException {
		String frase = JOptionPane.showInputDialog("Escreva sua frase!");
		try {
			FileWriter file = new FileWriter("c:/Temp/frases.txt", true);
			PrintWriter out = new PrintWriter(file);
			out.println(frase);
			file.close();
			out.close();
			JOptionPane.showMessageDialog(null, "Frase armazenada no arquivo!");
		}catch (FileNotFoundException erro) {
			JOptionPane.showMessageDialog(null, "Erro, verifique se o arquivo existe!");
		}
	}

}
