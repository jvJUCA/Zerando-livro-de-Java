package cap02;
import java.io.*;
public class Atividade1 {
    public static void main(String linha1[]) {
        String s;
        float valor,desconto,ValorDoDesconto,ValorComDesconto;
        BufferedReader dado;
        try {
            System.out.println("Escreva o valor do produto");
            dado = new BufferedReader (new InputStreamReader (System.in));
            s = dado.readLine();
            valor = Float.parseFloat(s);
            
            
            System.out.println("Escreva a porcentagem de desconto do produto");
            dado = new BufferedReader (new InputStreamReader (System.in));
            s = dado.readLine();
            desconto = Float.parseFloat(s);
            
            ValorDoDesconto = valor * desconto / 100;
            ValorComDesconto = valor - ValorDoDesconto;
            System.out.println("O valor do seu desconto é " + ValorDoDesconto);
            System.out.println("O valor que ficou com desconto é " + ValorComDesconto);
        } catch (IOException erro)  {
            System.out.println("Houve um erro entrada dos dados " + erro.toString());
        } catch (NumberFormatException erro)  {
            System.out.println("Houve um erro na conversão, digite apenas caracteres numericos "
                    + erro.toString());
        }
            
        
        }
        
    }

