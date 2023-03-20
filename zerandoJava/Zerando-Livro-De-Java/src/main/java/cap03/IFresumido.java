package cap03;
import java.util.*;
public class IFresumido {

	public static void main(String args[])  {
		int maior,idade,numero;Scanner sc;
		System.out.println("Insira sua idade");
		sc = new Scanner (System.in);
		 idade = sc.nextInt();
        System.out.println("insira um numero");
         numero = sc.nextInt();
        
         maior = (idade > numero) ? idade : numero;
         System.out.println("Usando if resumido o maior numero inserido é: " + maior);
	}
}
