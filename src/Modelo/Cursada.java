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
public class Cursada {
    public int IdMesa;
    public Alumno Alumno;
    public Materia Materia;
    public double Nota;

    public Cursada() {
    }

    public Cursada(Alumno Alumno, Materia Materia, double Nota) {
        this.Alumno = Alumno;
        this.Materia = Materia;
        this.Nota = Nota;
    }

    public Cursada(int IdMesa, Alumno Alumno, Materia Materia, double Nota) {
        this.IdMesa = IdMesa;
        this.Alumno = Alumno;
        this.Materia = Materia;
        this.Nota = Nota;
    }
    
    
    
    
    
    
}
