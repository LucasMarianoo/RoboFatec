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

    public Robo(String nome, String dtFab, int bateria) {
        this.nome = nome;
        this.dtFab = dtFab;
        this.bateria = bateria;
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
