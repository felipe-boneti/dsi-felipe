/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procedimento;

import javax.swing.JOptionPane;

public class operador {

    void soma(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));;
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));;
        
        int result = a + b;
        
        JOptionPane.showMessageDialog(null, "O valor da soma é: " + result);
    }
    
    void subtracao(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));;
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));;
        
        int result = a - b;
        
        JOptionPane.showMessageDialog(null, "O valor da subtração é: " + result);
    }
    
    void multiplicacao(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));;
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));;
        
        int result = a * b;
        
        JOptionPane.showMessageDialog(null, "O valor da multiplicaçõa é: " + result);
    }
    
    void divisao(){
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
        
        double result = a / b;
        
        JOptionPane.showMessageDialog(null, "O valor da divisão é: " + result);
    }
    
}
