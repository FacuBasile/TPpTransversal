package Controladores;

import Modelo.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlumnoData {
    
    private Connection con;

    public AlumnoData() {
        con = Conexion.getConexion();
    }
       
    public void guardarAlumno(Alumno alumno){
        String sql = "INSERT INTO `alumno`(`Apellido`, `Nombre`,`DNI`, `FNacimiento`, `Estado`) "
                +    "VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement p = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            p.setString(1, alumno.getApellido());
            p.setString(2, alumno.getNombre());
            p.setInt(3, alumno.getDNI());
            p.setDate(4, Date.valueOf(alumno.getFNacimiento()));
            p.setBoolean(5, alumno.isEstado());
            p.executeUpdate();
            
            ResultSet rs = p.getGeneratedKeys();
            if (rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
            } else{
                System.out.println("El alumno no pudo guardar");
            }             
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarAlumno(Alumno alumno){
        String sql = "UPDATE `alumno` SET `Apellido`= ?,`Nombre`= ?,`DNI`= ?,`FNacimiento`= ?,`Estado`= ? "
                +    "WHERE 1";
        try {
            PreparedStatement p = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            p.setString(1, alumno.getApellido());
            p.setString(2, alumno.getNombre());
            p.setInt(3, alumno.getDNI());
            p.setDate(4, Date.valueOf(alumno.getFNacimiento()));
            p.setBoolean(5, alumno.isEstado());
            p.executeUpdate();           
                    
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscarAlumno(Alumno alumno){
        Alumno alu = null;
        String sql = "SELECT `IdAlumno`, `Apellido`, `Nombre`, `DNI`, `FNacimiento`, `Estado` FROM `alumno` WHERE IdAlumno = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getIdAlumno());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                alu = new Alumno();
                alu.setIdAlumno(rs.getInt("IdAlumno"));
                alu.setNombre(rs.getString("nombre"));
                alu.setApellido(rs.getString("IdAlumno"));
                alu.setIdAlumno(rs.getInt("IdAlumno"));
                alu.setFNacimiento(rs.getDate("FNacimiento").toLocalDate());
                alu.setEstado(rs.getBoolean("activo"));
            } else {
                System.out.println("Alumno inexistente");
            }
        }catch(SQLException ex){
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
}
