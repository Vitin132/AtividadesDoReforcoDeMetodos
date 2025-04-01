

package Reforço_Métodos;

/**
 *
 * @author Aluno
 */
public class ForEach_mediaNotas {
            
    public static void main(String[] args) {
        
        double[]notas = {8.5, 7.0,9.3,6.5};
        
        double media = calcularMedia(notas);
        
        System.out.println("Média das notas "+media);
        
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for(double nota : notas){
            
            soma+=nota;
            
            
        }
        return soma/notas.length;
        
        
    }
    
    
    
    
    
}
