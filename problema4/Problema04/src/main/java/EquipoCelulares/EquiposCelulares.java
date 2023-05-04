/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoCelulares;

/**
 *
 * @author VEL-USER
 */
public class EquiposCelulares {
    private String sistemaOperativo;
    private int pantalla; 
    private double costoInicial; 
    private double ivaPorcentaj; 
    private double ivaInicial;
    private double costoFinal; 
    private String mac; 
    private String IMEI;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getPantalla() {
        return pantalla;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    public double getCostoInicial() {
        return costoInicial;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public double getIvaPorcentaj() {
        return ivaPorcentaj;
    }

    public void setIvaPorcentaj(double ivaPorcentaj) {
        this.ivaPorcentaj = ivaPorcentaj;
    }

    public double getIvaInicial() {
        return ivaInicial;
    }

    public void setIvaInicial(double ivaInicial) {
        this.ivaInicial = ivaInicial;
    }
    
    //--------------------------------------------------------
    public void CostoFinal() {
        costoFinal = costoInicial + ivaInicial;
    }

    public double getCostoFinal() {
        return costoFinal;
    }
    
    //-------------------------------------------------------
    
    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
    
    
}
