package cap02;
import javax.swing.JOptionPane;
public class EntradaComJOptionPane {
    public static void main(String linha1[])  {
        String aux;
        float largura,comprimento,area,perimetro;
        try {
            aux = JOptionPane.showInputDialog("Entre com o comprimento");
            comprimento = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Entre com a largura");
            largura = Float.parseFloat(aux);
            
            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            JOptionPane.showMessageDialog(null, "Área : " + area + ", Perimetro: " + perimetro);
        }catch (NumberFormatException erro)  {
            JOptionPane.showMessageDialog(null, "Houve um erro, digite apenas caracteres numericos"
                    + erro.toString());
        }
        System.exit(0);
        }
    }

