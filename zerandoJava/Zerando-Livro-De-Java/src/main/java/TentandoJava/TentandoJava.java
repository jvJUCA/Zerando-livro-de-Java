package TentandoJava;

import java.util.Scanner;

public class TentandoJava {
    
    public static void main(String []jujera)  {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seja bem vindo a uma experiencia JAVA");
       
        System.out.println("Qual seu nome?");
        
        String nome = sc.next();
        
        System.out.println("Seja bem vindo " + nome + "!");
        
        System.out.println("Quantos anos você tem? ");
        
        int idade = sc.nextInt();
        
        if (idade >= 18) { 
                
            System.out.println("Você é maior de idade");  
          }
        
           else {
            
            System.out.println("Você é menor de idade"); }
            { 
                int y = 2023 - idade;
                 
                System.out.println("Você nasceu em " + y);
                        
        }
    }
}
     
            
    
