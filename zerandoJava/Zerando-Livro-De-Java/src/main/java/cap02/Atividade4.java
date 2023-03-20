package cap02;
import javax.swing.JOptionPane;
public class Atividade4 {
    public static void main(String linha1[])  {
        String aux;
        float nota1,nota2,notaT,media;
        try {
            aux = JOptionPane.showInputDialog("Insira a nota da prova do primeiro bimestre");
            nota1 = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Insira a nota da prova do segundo bimestre");
            nota2 = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Insira a nota do seu Trabalho");
            notaT = Float.parseFloat(aux);
            
            media = nota1 + nota2 + notaT /3;
            if (media >= 6){
                JOptionPane.showMessageDialog(null,"Aprovado irmão tu é foda");
        }else{
                JOptionPane.showMessageDialog(null, "Reprovado mané se fudeu");
        
            }}catch (NumberFormatException erro)  {
            JOptionPane.showMessageDialog(null, "Houve um erro, digite apenas caracteres numericos"
                    + erro.toString());
        }
        System.exit(0);
        }
    }

        
    



