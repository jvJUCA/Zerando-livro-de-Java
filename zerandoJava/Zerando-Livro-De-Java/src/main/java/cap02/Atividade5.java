package cap02;
import javax.swing.JOptionPane;
public class Atividade5 {
    public static void main (String juca[]) {
        Float idade,Anos;
        String aux;
   try {
       aux = JOptionPane.showInputDialog("insira sua idade");
       idade = Float.valueOf(aux);
       
       aux = JOptionPane.showInputDialog("insira quantos anos de contribuição");
       Anos = Float.valueOf(aux);
       
       Object[] op = {"Masculino", "Feminino"};
        String sexo = (String) JOptionPane.showInputDialog(null, "selecione o sexo:\n", "Pesquisa",
                JOptionPane.PLAIN_MESSAGE,
                null, op, "Masculino");
       
          if(sexo == null) {
              JOptionPane.showMessageDialog(null, "voce pressionou cancel");
        
          }if("Feminino".equals(sexo) && idade >= 60 || "Feminino".equals(sexo) && Anos >=30){
          JOptionPane.showMessageDialog(null,"  você já tem o direito a aposentadoria");
          
          }else { JOptionPane.showMessageDialog(null,"  Você ainda nao tem direito a aposentadoria");
          }
          
          if ("Masculino".equals(sexo) && idade >= 65 || "Masculino".equals(sexo) && Anos >=35){
          JOptionPane.showMessageDialog(null,"  você já tem o direito a aposentadoria");
          
          }else{ JOptionPane.showMessageDialog(null,"  Você ainda nao tem direito a aposentadoria");
          }
          }catch (NumberFormatException erro)  {
            JOptionPane.showMessageDialog(null, "Houve um erro, digite apenas caracteres numericos"
                    + erro.toString());
        }
        System.exit(0);
        }
    }

            
            
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

