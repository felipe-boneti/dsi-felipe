/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07;

/**
 *
 * @author CAMARGO
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int par = 0;
    int impar = 0;
        for(int i = 1; i <101; i++){
            if(i%2==0){
                System.out.println(i + "par");
                par = par + 1;
            }else{
                System.out.println(i + "impar");
                impar = impar + 1;
            }   
        }
            System.out.println("Os valores pares são: " + par);
            System.out.println("Os valores ímpares são: " + impar);
            
            if (par > impar){
                System.out.println("Os números Pares são maiores");
            }else{
                System.out.println("Os números Impares são maiores");
            }
        }
    }
   
