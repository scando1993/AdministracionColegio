/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author catfish
 */
public class Horario {
    
    int idhorario;
    String dia1;
    String dia2;
    String dia3;
    String horaInicio;
    String horaFin;
//    String horaparcialinicio1;
//    String horaparcialinicio2;
//    String horaparcialfin1;
//    String horaparcialfin2;

    public Horario() {
        this.idhorario = ' ';
        this.dia1 = "";
        this.dia2 = "";
        this.dia3 = "";
        this.horaInicio = "";
        this.horaFin = "";
//        this.horaparcialinicio1= "";
//        this.horaparcialinicio2= "";
//        this.horaparcialfin1= "";
//        this.horaparcialfin2= "";
        
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    public void setHoraInicio() {
        this.horaInicio = this.getHoraInicio();
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public void setDia1(String dia1) {
        this.dia1 = dia1;
    }

    public void setDia2(String dia2) {
        this.dia2 = dia2;
    }

    public void setDia3(String dia3) {
        this.dia3 = dia3;
    }

    public void setIdhorario(int idhorario) {
        this.idhorario = idhorario;
    }

//    public void setHoraparcialinicio1(String horaparcialinicio1) {
//        this.horaparcialinicio1 = horaparcialinicio1 + ":";
//    }
//
//    public void setHoraparcialinicio2(String horaparcialinicio2) {
//        this.horaparcialinicio2 = this.getHoraparcialinicio1() + horaparcialinicio2;
//    }
//
//    public void setHoraparcialfin1(String horaparcialfin1) {
//        this.horaparcialfin1 = horaparcialfin1;
//    }
//
//    public void setHoraparcialfin2(String horaparcialfin2) {
//        this.horaparcialfin2 = horaparcialfin2;
//    }
    
    

    public String getDia1() {
        return dia1;
    }

    public String getDia2() {
        return dia2;
    }

    public String getDia3() {
        return dia3;
    }

    public String getHoraInicio() {
       // horaInicio = this.getHoraparcialinicio2();
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public int getIdhorario() {
        return idhorario;
    }

//    public String getHoraparcialinicio1() {
//        return horaparcialinicio1;
//    }
//
//    public String getHoraparcialinicio2() {
//        return horaparcialinicio2;
//    }
//
//    public String getHoraparcialfin1() {
//        return horaparcialfin1;
//    }
//
//    public String getHoraparcialfin2() {
//        return horaparcialfin2;
//    }
//    
    
    
    
    
    
}
