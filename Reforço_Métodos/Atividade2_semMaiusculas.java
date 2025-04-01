package Reforço_Métodos;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade2_semMaiusculas {
    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        ArrayList<String> palavras = new ArrayList<>();
        
        System.out.println("Digite o número de palavras que deseja inserir: ");
        
        int qtd = tc.nextInt();
        tc.nextLine();
        for (int i = 0; i < qtd; i++) {
            
            System.out.println("Digite uma palavra: ");
            String palavra = tc.nextLine();
            palavras.add(palavra);
            
            
        }
        exibirSemMaiusculas(palavras);
        
    }

    private static void exibirSemMaiusculas(ArrayList<String> palavras) {
        
        palavras.forEach(palavra -> System.out.println(palavra.toLowerCase()));
        
        
        
        
    }
    
    
    

}
