/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos;

/**
 *
 * @author CAMARGO
 */
public class exemplo3 {
    public static void main(String[] args) {
        int total = 0;
        //int i = qual numero vai começar a contar
        // i <11 = vai contar até o numero determinado (no caso do exercicio 10)
        // resultado final será a soma até o 10
        for (int i = 1; i <11 ; i++){
            total = total + i;
            System.out.println("Valor total: " + total);
        }
        System.out.println(total);
    }
}
