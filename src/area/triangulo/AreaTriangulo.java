/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.triangulo;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base,altura;
        System.out.println("base=");
        Scanner numero = new Scanner(System.in);
        base = numero.nextFloat();
        
        System.out.println("altura=");
        Scanner numero2 = new Scanner(System.in);
        altura = numero2.nextFloat();
        
        System.out.println("el area es ="+base*altura/2);
        
        
    }
    
}
