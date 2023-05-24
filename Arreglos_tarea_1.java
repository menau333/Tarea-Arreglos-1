/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
package vectores ; 

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Arreglos_tarea_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arreglo1[] = new int[5]  ;
        int arreglo2[] = new int [5] ;
        int arreglo3[] = new int [10] ;
       
       
        for(int numero=0; numero<5; numero++){
        arreglo1[numero] = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero para el arreglo 1 en la posicion "+numero)) ;
        }
        {
        for(int numero=0; numero<5; numero++){
        arreglo2[numero] = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero para el arreglo 2 en la posicion "+numero)) ;
        }
        }
        for (int numero=0; numero<5; numero++){
        }
     
     int c=0 ;// interador del arreglo 3
    for(int numero=0;numero<5;numero++){
    arreglo3[c] = arreglo1[numero] ;
    c++;
    arreglo3[c] = arreglo2[numero] ;
    c++;
   
    
        
        
    }
        
    
JOptionPane.showMessageDialog(null,"""
                                   Los arreglos serian:"""
                                   
             + "\n1  "+Arrays.toString(arreglo1)
             + "\n2  "+Arrays.toString(arreglo2)
             + "\n3  "+Arrays.toString(arreglo3)
);
 

}}

