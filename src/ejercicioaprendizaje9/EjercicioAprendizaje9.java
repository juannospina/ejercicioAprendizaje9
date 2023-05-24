/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package ejercicioaprendizaje9;

import java.util.Scanner;

public class EjercicioAprendizaje9 {
    public static void main(String[] args) {
        String frase, posicion; 
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa una frase o palabra: ");
        frase = entrada.nextLine();       
        
        posicion = frase.substring(0,1); // en PSEint solo se ponia substring(0) pero aca es equivalente a (0,1)
        
        if(posicion.equals("A")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }    
}
