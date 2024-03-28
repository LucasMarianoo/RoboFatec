/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package robofatec;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author skynn
 */
public class RoboFatec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2;
        String input;
        Robo robo = new Robo();
        Calculadora calculadora = new Calculadora(robo);
        
        while (calculadora.getRobo().getBateria() > 0) {
            
            input = JOptionPane.showInputDialog(null, """
                               Qual operação deseja realizar: 
                               1-Somar 
                               2-Subtrair
                               3-Dividir
                               4-Multiplicar
                               5-Sair""");            
            
            int opt = Integer.parseInt(input);
            
            switch (opt) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Você selecionou Somar");
                    
                    input = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
                    num1 = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog(null, "Digite o segundo número: ");
                    num2 = Integer.parseInt(input);
                    
                    JOptionPane.showMessageDialog(null, "O resultado da soma é: " + calculadora.Somar(num1, num2));
                    
                    calculadora.getRobo().setBateria(calculadora.getRobo().getBateria()-1);                    
                    JOptionPane.showMessageDialog(null, "Agora tenho " + calculadora.getRobo().getBateria() + "% de bateria");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Você selecionou Subtrair");                    
                    
                    input = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
                    num1 = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog(null, "Digite o segundo número: ");
                    num2 = Integer.parseInt(input);
                    
                    JOptionPane.showMessageDialog(null, "O resultado da soma é: " + calculadora.Subtrair(num1, num2));
                    
                    calculadora.getRobo().setBateria(calculadora.getRobo().getBateria()-1);                    
                    JOptionPane.showMessageDialog(null, "Agora tenho " + calculadora.getRobo().getBateria() + "% de bateria");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Você selecionou Dividir");                    
                    
                    input = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
                    num1 = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog(null, "Digite o segundo número: ");
                    num2 = Integer.parseInt(input);
                    
                    JOptionPane.showMessageDialog(null, "O resultado da soma é: " + calculadora.Dividir(num1, num2));
                    
                    calculadora.getRobo().setBateria(calculadora.getRobo().getBateria()-1);                    
                    JOptionPane.showMessageDialog(null, "Agora tenho " + calculadora.getRobo().getBateria() + "% de bateria");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Você selecionou Multiplicar");                    
                    
                    input = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
                    num1 = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog(null, "Digite o segundo número: ");
                    num2 = Integer.parseInt(input);
                    
                    JOptionPane.showMessageDialog(null, "O resultado da soma é: " + calculadora.Multiplicar(num1, num2));
                    
                    calculadora.getRobo().setBateria(calculadora.getRobo().getBateria()-1);                    
                    JOptionPane.showMessageDialog(null, "Agora tenho " + calculadora.getRobo().getBateria() + "% de bateria");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Até mais");
                default:
                    break;
                    
            }
            
        }
        JOptionPane.showMessageDialog(null, "Acabou a bateria! Tchau, vou descansar");

    }
    
}
