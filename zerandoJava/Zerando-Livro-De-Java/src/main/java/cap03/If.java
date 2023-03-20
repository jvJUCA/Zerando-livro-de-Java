package cap03;
import javax.swing.JOptionPane;
public class If {
    public static void main(String []args)  {
        Object[] op = {"Masculino", "Feminino"};
        String sexo = (String) JOptionPane.showInputDialog(null, "selecione o sexo:\n", "Pesquisa",
                JOptionPane.PLAIN_MESSAGE,
                null, op, "Masculino");
        if (sexo == null)  {
            JOptionPane.showMessageDialog(null, "voce pressionou cancel.");
        }
        if (sexo == "Masculino") {
            JOptionPane.showMessageDialog(null, "voce é do sexo Masculino.");
        }
        if (sexo == "Feminino") {
            JOptionPane.showMessageDialog(null, "voce é do sexo Feminino.");
        }
        System.exit(0);
    }
}
