/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problema03;
import AdministrarInstitucion.aAdministrarInstitucion;
import java.util.Scanner;
/**
 *
 * @author VEL-USER
 */
public class Problema03 {

    public static void main(String[] args) {
        
        System.out.println("Problema 3");
        Scanner entrada = new Scanner(System.in);
        aAdministrarInstitucion a = new aAdministrarInstitucion();
        
        System.out.println("Ingrese el nombre de su institucion");
        String nombre = entrada.nextLine();
        a.setNombre(nombre);
        
        System.out.println("Ingrese el tipo de institucion");
        String tipo = entrada.nextLine();
        a.setTipoInstitución(tipo);
        entrada.nextLine();
        
        System.out.println("Ingrese el numero de alumnos");
        int numA = entrada.nextInt();
        a.setNúmeroAlumnos(numA);
        
        System.out.println("Ingrese el numero de maestros");
        int numM = entrada.nextInt();
        a.setNúmeroDocentes(numM);
        
        System.out.println("Ingrese el numero de sedes");
        int numS = entrada.nextInt();
        a.setNúmeroSedes(numS);
        
        System.out.println("Ingrese los gastos proyectados por estudiante");
        int gastos = entrada.nextInt();
        a.setGastosProyectadoEstudiante( gastos);
        
        a.presupuesto();
        
        System.out.printf("El nombre de su institucion es: %s\nEl tipo de "
                + "institucion es: %s\nEl numero de alumnos es: %d\nEl numero "
                + "de sedes de la institucion es: %d\nEl numero de maestros es: "
                + "%d\nLos gastos proyectados para el estudiante son: %d\n"
                + "El presupuesto es: %d\n",
                a.getNombre(),
                a.getTipoInstitución(),
                a.getNúmeroAlumnos(),
                a.getNúmeroSedes(),
                a.getNúmeroDocentes(),
                a.getGastosProyectadoEstudiante(),
                a.getPresupuesto());
    }
}
