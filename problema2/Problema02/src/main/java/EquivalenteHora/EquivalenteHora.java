package EquivalenteHora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VEL-USER
 */
public class EquivalenteHora {
    
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    //----------------------------------
    
    public void getMinutos() {
        minutos = horas * 60;
    }

    public double totalMinutos() {
        return minutos;
    }

    //----------------------------------
    
    public void getSegundo() {
        segundos = horas * 3600;
    }

    public double totalSegundos() {
        return segundos;
    }
    
    //----------------------------------
    
    public void getDias() {
        dias = horas / 24;
    }

    public double totalDias() {
        return dias;
    }
    
    
    
}
