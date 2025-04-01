

package Reforço_Métodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class While_CalculadoraFatorial {

    public static void main(String[] args) {
        
        
        Scanner tc = new Scanner(System.in);
        
        
        int numero = solicitarNumeroNaoNegativo(tc);
        
        System.out.println("O fatorial de "+numero+" é "+calcularFatorial(numero));
        
        
        
    }

    public static int solicitarNumeroNaoNegativo(Scanner tc) {
        
        System.out.println("Digite um número inteiro não negativo:");
        int numero = tc.nextInt();
        while(numero < 0){
            
            System.out.println("Número inválido: Digiteum número inteiro positivo:");
            numero = tc.nextInt();
        }
        return numero;
        
        
    }

    public static int calcularFatorial(int numero) {
        
        int fatorial = 1;
        
        for(int cont = 1; cont <= numero; cont++){
            fatorial *= cont;
            
            
        }return fatorial;
        
        
        
    }
    
    
    
}
