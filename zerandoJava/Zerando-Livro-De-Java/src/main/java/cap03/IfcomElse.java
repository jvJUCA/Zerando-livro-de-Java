package cap03;
import javax.swing.*;
public class IfcomElse {
    public static void main(String []args)  {
        String aux = JOptionPane.showInputDialog("Forneça o numero do mês");
        if (aux!= null) {
            try {
                int mes = Integer.parseInt(aux);
                if (mes >=1 && mes <= 12)  {
                    JOptionPane.showMessageDialog(null, "Numero do mês valido:\n" + mes);
                }else{
                    JOptionPane.showMessageDialog(null, "Numero do mês invalido:\n" + mes);
                }
            } catch (NumberFormatException erro)  {
                JOptionPane.showMessageDialog(null, "Digite apenas numeros!");}
            } else {
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
            }
            System.exit(0);
        }
    }

