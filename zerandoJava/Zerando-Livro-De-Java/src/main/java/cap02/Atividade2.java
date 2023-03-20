package cap02;
import java.util.*;
public class Atividade2{
    public static void main(String linha1[])  {
        int Lider,lanterna,QuantidadeDeVitoriasNecessarias;
        Scanner sc;
        try {
            System.out.println("Escreva a quantidade de pontos do time Líder");
            sc = new Scanner (System.in);
            Lider = sc.nextInt();
            
            System.out.println("Escreva a quantidade de pontos do time lanterna");
            sc = new Scanner (System.in);
            lanterna = sc.nextInt();
            
            QuantidadeDeVitoriasNecessarias = (Lider - lanterna) / 3;
            
            System.out.println("O numero de vitorias que precisa para o time lanterna alcançar o time líder é: " + QuantidadeDeVitoriasNecessarias);
            
        } catch (NumberFormatException e) {
            System.out.println("Houve um erro, digite apenas caracteres numericos");
        }
            
            
        }
    }
    

