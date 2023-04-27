/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio01;

import java.util.Scanner;
import terreno.CalcularvTerreno;

/**
 *
 * @author UTPL
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        System.out.println("Vamos a Calcular su el costo de su Terreno");

        CalcularvTerreno t = new CalcularvTerreno();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el ancho de su terreno: ");
        double a = entrada.nextDouble();
        t.setAncho(a);

        System.out.println("Ingrese el largo de su terreno: ");
        double l = entrada.nextDouble();
        t.setLargo(l);

        System.out.println("Ingrese el costo de m2: ");
        double vM = entrada.nextDouble();
        t.setValorMetroCuadrado(vM);

        t.getArea();
        t.totalCancelar();

        System.out.printf("El ancho de su terreno es: %.2f \n Los minutos "
                + "El largo de su terreno es: %.2f\n El area total de su terreno"
                + " es: %.2f\n El costo del terreno es: %.2f\n",
                t.getAncho(),
                t.getLargo(),
                t.totalArea(),
                t.valorFactura());

    }
}
