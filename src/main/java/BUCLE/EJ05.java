/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUCLE;

import java.util.Scanner;

/**
 *
 * @author LOREN
 */
public class EJ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //5.- Implementa el programa del ejercicio 2 usando un do – while.
        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
        do {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        } while (x <= n);

    }
}
