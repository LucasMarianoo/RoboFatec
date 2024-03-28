/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robofatec;

/**
 *
 * @author skynn
 */
public class Calculadora {
    private Robo robo;

    public Calculadora(Robo robo) {
        this.robo = robo;
    }

    public Robo getRobo() {
        return robo;
    }

    public void setRobo(Robo robo) {
        this.robo = robo;
    }
    
    public double Somar(double n1, double n2) {
        return n1 + n2;
    }
    
    public double Subtrair(double n1, double n2) {
        return n1 - n2;
    }
    
    public double Dividir(double n1, double n2) {
        return n1 / n2;
    }
    
    public double Multiplicar(double n1, double n2) {
        return n1 * n2;
    }    
    
}
