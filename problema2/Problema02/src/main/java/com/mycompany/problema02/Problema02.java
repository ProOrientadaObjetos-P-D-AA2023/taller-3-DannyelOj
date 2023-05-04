
package com.mycompany.problema02;


import EquivalenteHora.EquivalenteHora;
import java.util.Scanner;


public class Problema02 {

    public static void main(String[] args) {
        System.out.println("Problema 02");
        
        EquivalenteHora e = new EquivalenteHora();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la hora: ");
        double hora = entrada.nextDouble();
        e.setHoras(hora);
        
        e.getHoras();
        e.getMinutos();
        e.getSegundo();
        e.getDias();
        
        System.out.printf("Las horas ingresadas son: %.2f \nLos minutos "
                + "de la hora son: %.2f\nLos segundos de la hora son: %.2f\n "
                + "Los dias de la hora son: %.2f\n",
                e.getHoras(),
                e.totalMinutos(),
                e.totalSegundos(),
                e.totalDias());
        
    }
    
}

