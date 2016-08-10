/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Objects;

/**
 *
 * @author Amira Sony Vaio
 */
public class estudiante implements model{
    private String nombres;
    private String apellidos;
    private String cedula;
    private String fecha_nacimiento;
    private String telefono;
    private String genero;
    private String direccion;
    private String domicilio;
    private String correo;
    private final Conectar conexionEstudiante = new Conectar();
    private LinkedList<String> cursosDisponibles;
    private String colegio;
    
    public estudiante(String nombres, String apellidos, String cedula, 
            String fecha_nacimiento, String telefono, String genero, 
            String colegio, String direccion, String domicilio, 
            String correo) {
        
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.genero = genero;
        this.colegio = colegio;
        this.direccion = direccion;
        this.domicilio = domicilio;
        this.correo = correo;
        this.cursosDisponibles = new LinkedList<>();
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public LinkedList<String> getCursosDisponibles() {
        return cursosDisponibles;
    }

    public void setCursosDisponibles(LinkedList<String> cursosDisponibles) {
        this.cursosDisponibles = cursosDisponibles;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "estudiante{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", cedula=" + cedula + ", fecha_nacimiento=" + fecha_nacimiento + ", telefono=" + telefono + ", genero=" + genero + ", colegio=" + colegio + ", direccion=" + direccion + ", domicilio=" + domicilio + ", correo=" + correo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final estudiante other = (estudiante) obj;
        return Objects.equals(this.cedula, other.cedula);
    }
    
    public static estudiante buscarPorNombre(String Nombre){
            
        return null;
    }
    
    public static estudiante buscarPorApellido(String Apellido){
//        for(estudiante est:estudiantes){
//            if(est.apellidos.equals(Apellido))
//                return est;
//        }
        return null;
    }
    
    public static estudiante buscarPorCedula(String Cedula){
//        for(estudiante est:estudiantes){
//            if(est.cedula.equals(Cedula))
//                return est;
//        }
        return null;
    }
    
    @Override
    public boolean eliminar() {
//        return estudiantes.remove(this);;
        return false;
    }

    @Override
    public boolean guardar() {
        try {
            String sql;
            sql = "INSERT INTO persona (cedula,nombre,apellido,fechaNacimiento,genero,direccion,telefono,correo) "
                    +          "VALUES (?,?,?,?,?,?,?,?)";
            //Statement consulta = con1.getConnection().createStatement();
            PreparedStatement statement = conexionEstudiante.getConnection().prepareStatement(sql);
            statement.setString(1, this.getCedula());
            statement.setString(2, this.nombres);
            statement.setString(3, this.apellidos);
            statement.setDate(4, Date.valueOf(this.fecha_nacimiento));
            statement.setString(5, this.genero);
            statement.setString(6, this.direccion);
            statement.setString(7, this.telefono);
            statement.setString(8, this.correo);
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                return true;
            }
            
        } catch (SQLException ex) {
           return false;
        }
        return false;
    }

    @Override
    public boolean actualizar() {
        estudiante est1 = estudiante.buscarPorCedula(this.cedula);
//        estudiantes.remove(est1);
//        return estudiantes.add(this);
        return false;
    }
    
    
    public static boolean validarEstudiante(String nombres, String apellidos, String cedula, 
            String fecha_nacimiento, String telefono, String genero, 
            String colegio, String direccion, String domicilio, 
            String correo) {
        return false;
    }
            
    class EstudianteValidator{
        private final int maxCedula = 10;
        private final int maxNombre = 20;
        private final int maxApellido = 20;
        private final int maxFechaNacimiento = 20;
        private final int maxGenero = 2;
        private final int maxFuncion = 10;
        private final int maxDireccion = 40;
        private final int maxTelefono = 15;
        private final int maxCorreo = 20;

        public EstudianteValidator() {
        }
        
        public boolean isCedula(String str){
        if(Validador.isString(str, maxCedula, maxCedula))
            if(Validador.hasStringForm(str,"\\d"))
                return true;
        return false;
        }
        public boolean isNombre(String str){
            if(Validador.isString(str,2, maxNombre))
                if(Validador.hasStringForm(str,"\\Dw" ))
                    return true;
            return false;
        }
        public boolean isApellido(String str){
            if(Validador.isString(str,2, maxApellido))
                if(Validador.hasStringForm(str,"\\Dw" ))
                    return true;
            return false;
        }
    }
}
