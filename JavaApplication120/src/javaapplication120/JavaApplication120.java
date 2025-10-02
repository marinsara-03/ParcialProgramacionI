/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication120;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author flaka
 */
public class JavaApplication120 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        Random rand  = new Random();
        
        int num = 0;
        int sumaNum = 0;
        
        System.out.println("Digite un numero: ");
        num = read.nextInt();
         
        int[] arreglo = new int[num];
        
        for (int i=0; i<num; i++){
            arreglo[i] = 100 + rand.nextInt(99999 - 100 + 1);
        }
        
        for (int i=0; i < num; i++) {
            System.out.print(arreglo[i] + (i < num - 1 ? ", " : ""));
        }
        for (int i=0; i<arreglo.length; i++){
        }

    }
    
}
