/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problema04;

import EquipoCelulares.EquiposCelulares;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Problema04 {

    public static void main(String[] args) {
        
        System.out.println("Problema04");
        Scanner entrada = new Scanner(System.in);
        EquiposCelulares a = new EquiposCelulares();
        
        
        System.out.println("Ingrese el sistema operativo");
        String sO = entrada.nextLine();
        a.setSistemaOperativo(sO);
        
        System.out.println("Ingrese el tamaño de la pantalla");
        int tP = entrada.nextInt();
        a.setPantalla(tP);
        entrada.nextLine();
        
        System.out.println("Ingrese el costo Inicial");
        int cI = entrada.nextInt();
        a.setCostoInicial(cI);
        
        System.out.println("Ingrese el iva Porcentaje");
        int iP = entrada.nextInt();
        a.setIvaPorcentaj(iP);
        
        System.out.println("Ingrese el iva Inicial");
        int iI = entrada.nextInt();
        a.setIvaInicial(iI);
        entrada.nextLine();
        
        System.out.println("Ingrese la mac");
        String mac = entrada.nextLine();
        a.setMac(mac);
        
        System.out.println("Ingrese la IMEI");
        String imei = entrada.nextLine();
        a.setIMEI(imei);
        
        a.CostoFinal();
        
        System.out.printf("El sistema operativo: %s\nEl tamaño de la pantalla es:"
                + " %d\nEl costo Inicial es: %.2f\nEl el iva Porcentaje es: %.2f"
                + "\nEl iva Inicial es: %.2f\nEl costo final es: %.2f\n"
                + "La MAC es: %s\nEl IMEI es: %s",
                a.getSistemaOperativo(),
                a.getPantalla(),
                a.getCostoInicial(),
                a.getIvaPorcentaj(),
                a.getIvaInicial(),
                a.getCostoFinal(),
                a.getMac(),
                a.getIMEI());
    }
}
