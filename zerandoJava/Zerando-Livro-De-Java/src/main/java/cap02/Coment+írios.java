package cap02;
//Isso é um exemplo de um comentário de somente 1 linha começado em 2 barras e tudo dentro desta linha é um comentário
/*Isso é um exemplo de comentário de multiplas linhas onde comeca com barra asterisco e termina em asterisco barra tendo um espaço qualquer
para ser ultilizado*/
/**Esse tipo é semelhante ao comentário de múltiplas linhas, entretanto tem o propósito 
 de possibilitar a documentação do programa por meio de um utilitário (javadoc)
 fornecido pela Oracle junto com o JDK. Esse tipo de comentário inicia-se com /** e é encerrado com */
public class Comentários {
    public static void main(String args[])  {
        int matricula = 1089, idade = 20; //declaração de variaveis do tipo inteiro
        double dolar = 2.62;
        /* As linhas seguintes enviam o conteudo das
        variaveis para a tela */
        System.out.println("idade " + idade + " matricula " + matricula + " dolar " + dolar);
    }
    
}
