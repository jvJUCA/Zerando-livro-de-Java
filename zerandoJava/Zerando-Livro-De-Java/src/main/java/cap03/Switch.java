package cap03;

import javax.swing.JOptionPane;

public class Switch {
	public static void main(String []args)  {
        String aux = JOptionPane.showInputDialog("insira o numero do mês");
        if (aux != null)  {
                int mes = Integer.parseInt(aux);
                switch (mes) {
				case 1:
					aux = "Janeiro";
					break;
				case 2:
					aux = "Fevereiro";
					break;
				case 3:
					aux = "Março";
					break;
				case 4:
					aux = "Abril";
					break;
				case 5:
					aux = "Maio";
					break;
				case 6:
					aux = "Junho";
					break;
				case 7:
					aux = "Julho";
					break;
				case 8:
					aux = "Agosto";
					break;
				case 9:
					aux = "Setembro";
					break;
				case 10:
					aux = "Outubro";
					break;
				case 11:
					aux = "Novembro";
					break;
				case 12:
					aux = "Dezembro";
					break;
				default:
					aux = "Mês Invalido!";
					break;
				}
                JOptionPane.showMessageDialog(null, aux);
            
           System.exit(0);               
        }
                
    }
}


