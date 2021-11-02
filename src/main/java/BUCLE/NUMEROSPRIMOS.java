/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUCLE;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LOREN
 */
public class NUMEROSPRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradateclado = new Scanner(System.in);
        int menu;
        int dato;
        Random numAleatrio = new Random();
        int datoAleatorio;
        // TODO code application logic here
        //Menú
        //bucle de salir
        do{
        //bucle del menu
        do{
        System.out.println("-------------------MENÚ----------------------------");
        System.out.println("1. mete un dato");
        System.out.println("2. dato aleatorio");
        System.out.println("3. salir");
        menu = entradateclado.nextInt();
        
        //que si no es 1 o 2 o 3 se repite el menú
        }while(!(menu == 1 || menu == 2 || menu == 3));
        //si es uno lo q hace
        if(menu == 1){
            System.out.println("Número entre 2 y 600");
            dato = entradateclado.nextInt();
            //controla la entrada de datos
            if(!(2>=dato && 600<=dato )){
                System.out.println("No haces cado tio, es entre 2 y 600");
            }
        //si es 2 lo q hace == el núnero aleatorio
        }else if(menu == 2){
            datoAleatorio = numAleatrio.nextInt(599) + 2;
            System.out.println(datoAleatorio);
            
        //lo q hace si no es nada
        }else{}
        
        //condición para parar todo el bucle
        }while(!(menu == 3));

    

        }
}