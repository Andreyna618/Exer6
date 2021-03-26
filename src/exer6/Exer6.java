
package exer6;

import java.util.Scanner;


public class Exer6 {

    
    public static void main(String[] args) {
        Scanner entrada;
        entrada =  new Scanner (System.in);
        
        float base;
        float altura;
        float resultado;
        
        System.out.println("Digite o valor da base");
        base = Float.parseFloat(entrada.nextLine());
        
        System.out.println("Digite o valor da altura");
        altura = Float.parseFloat(entrada.nextLine());
        
        resultado = base * altura /2;
                
        System.out.println("A area do triangulo é"+ "=" +resultado);
    }
    
}
