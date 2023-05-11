/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author H
 */
public class Materia {
    public int IdMateria;
    public String Nombre;
    public int Anio;
    public boolean Estado;

    public Materia() {
    }

    public Materia(String Nombre, int Anio, boolean Estado) {
        this.Nombre = Nombre;
        this.Anio = Anio;
        this.Estado = Estado;
    }

    public Materia(int IdMateria, String Nombre, int Anio, boolean Estado) {
        this.IdMateria = IdMateria;
        this.Nombre = Nombre;
        this.Anio = Anio;
        this.Estado = Estado;
    }
    
    
    
    
}
