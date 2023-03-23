/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;


public class Ex03 {
    public static void main(String[] args) {
       
        int v1 = 0;
        int v2 = 1;
        int v3;
        
        
                
        for(int i = 1; i <12;i++){
            v3 = v2 + v1;
            System.out.println(v1);
            System.out.println(v2);
            System.out.println("--------");
            System.out.println(v3);
            System.out.println("--------");

            v1 = v2;
            v2 = v3;
        }
    
    }
    
}


