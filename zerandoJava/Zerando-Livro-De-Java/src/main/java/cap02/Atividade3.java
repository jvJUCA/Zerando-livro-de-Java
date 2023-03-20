package cap02;
import javax.swing.JOptionPane;
public class Atividade3 {
    public static void main(String linha1[])  {
        String aux;
        float ITBI,Transação,Venal,percentual,MaiorValor;
        try {
            aux = JOptionPane.showInputDialog("Entre com o valor da Transação");
            Transação = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Entre com o valor venal");
            Venal = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Entre com o percentual");
            percentual = Float.parseFloat(aux);
            
            if (Venal > Transação){  
            MaiorValor = Venal; 
            }else{ MaiorValor = Transação;
            }
            ITBI = MaiorValor * percentual / 100;
    
            JOptionPane.showMessageDialog(null,"O valor do imposto a ser pago é;" + ITBI);
            
        }catch (NumberFormatException erro)  {
            JOptionPane.showMessageDialog(null, "Houve um erro, digite apenas caracteres numericos"
                    + erro.toString());
        }
        System.exit(0);
        }
    }
        
       
        
            
            
                

