package cap02;
import java.util.*;
public class EntradaComScanner {
    public static void main(String linha1[])  {
        float largura,comprimento,area,perimetro;
        Scanner sc;
        try {
            System.out.println("Digite o comprimento");
            sc = new Scanner(System.in);
            comprimento = sc.nextFloat();
            
            System.out.println("Digite a largura");
            sc = new Scanner(System.in);
            largura = sc.nextFloat();
            
            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println("Area do retangulo: " + area);
            System.out.println("Perimetro do retangulo: " + perimetro);
        } catch (NumberFormatException e) {
            System.out.println("Houve um erro, digite apenas caracteres numericos");
        }
    }
            
}
