/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.time.LocalDate;
/**
 *
 * @author H
 */
public class Alumno {
    public int IdAlumno;
    public int DNI;
    public String Nombre;
    public String Apellido;
    public LocalDate FNacimiento;
    public boolean Estado;

    public Alumno() {
    }

    public Alumno(int DNI, String Nombre, String Apellido, LocalDate FNacimiento, boolean Estado) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FNacimiento = FNacimiento;
        this.Estado = Estado;
    }

    public Alumno(int IdAlumno, int DNI, String Nombre, String Apellido, LocalDate FNacimiento, boolean Estado) {
        this.IdAlumno = IdAlumno;
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FNacimiento = FNacimiento;
        this.Estado = Estado;
    }

    public int getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public LocalDate getFNacimiento() {
        return FNacimiento;
    }

    public void setFNacimiento(LocalDate FNacimiento) {
        this.FNacimiento = FNacimiento;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    
    
    
    
    
    
}
