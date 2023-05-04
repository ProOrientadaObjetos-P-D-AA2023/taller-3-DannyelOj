/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministrarInstitucion;

/**
 *
 * @author VEL-USER
 */
public class aAdministrarInstitucion {

    private String nombre; 
    private String tipoInstitución;
    private int númeroAlumnos;
    private int númeroDocentes;
    private int númeroSedes; 
    private int gastosProyectadoEstudiante; 
    private int presupuesto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstitución() {
        return tipoInstitución;
    }

    public void setTipoInstitución(String tipoInstitución) {
        this.tipoInstitución = tipoInstitución;
    }

    public int getNúmeroAlumnos() {
        return númeroAlumnos;
    }

    public void setNúmeroAlumnos(int númeroAlumnos) {
        this.númeroAlumnos = númeroAlumnos;
    }

    public int getNúmeroDocentes() {
        return númeroDocentes;
    }

    public void setNúmeroDocentes(int númeroDocentes) {
        this.númeroDocentes = númeroDocentes;
    }

    public int getNúmeroSedes() {
        return númeroSedes;
    }

    public void setNúmeroSedes(int númeroSedes) {
        this.númeroSedes = númeroSedes;
    }

    public int getGastosProyectadoEstudiante() {
        return gastosProyectadoEstudiante;
    }

    public void setGastosProyectadoEstudiante(int gastosProyectadoEstudiante) {
        this.gastosProyectadoEstudiante = gastosProyectadoEstudiante;
    }

    //------------------------------------------------------------
    public void presupuesto() {
        presupuesto = númeroAlumnos * gastosProyectadoEstudiante;
    }
    
    public int getPresupuesto() {
        return  presupuesto;
    }
    
    
    
    
}
