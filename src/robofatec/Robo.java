/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robofatec;

/**
 *
 * @author skynn
 */
public class Robo {
    
    private String nome;
    private String dtFab;
    private int bateria;

    public Robo() {
        this.nome = "Roboto";
        this.dtFab = "20-03-2024";
        this.bateria = 4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtFab() {
        return dtFab;
    }

    public void setDtFab(String dtFab) {
        this.dtFab = dtFab;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
    
    
    
}
