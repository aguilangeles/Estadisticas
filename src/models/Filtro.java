/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class Filtro {

    private int id;
    private String fechas = "";
    private String documento = "";
    private String usuario = "";
    //fechas para el textarea
    private String lastfechas = "";
    private String nombreDocumento = "";
    private String lastusuario = "";

    public Filtro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechas() {
        return fechas;
    }

    public void setFechas(String fechas) {
        this.fechas = fechas;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    /*ARREGLO PARA EL JTEXTAREA*/

    public String getLastfechas() {
        String adate = getFechas();
        String ultima = null;
        if (adate.contains("and fecha_control  between")) {
            String string = adate.replace("and fecha_control  between", "");
            String string2 = string.replace(" and ", " al ");
            String string3 = string2.replace("%", "");
            ultima = "\nFecha desde " + string3;

        } else if (adate.contains("and fecha_control like")) {
            String string = adate.replace("and fecha_control like", "");
            String string2 = string.replace("%", "");
            ultima = "\nFecha: " + string2;

        } else if (adate.isEmpty()) {
            ultima = "";
        }
        return ultima;
    }

    public String getNombreDocumento() {
        if (nombreDocumento.equals("-----")) {
            return "";
        }
        return "\nTipo de documento: " + nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getLastusuario() {
        if (lastusuario.equals("-----")) {
            return "";
        }
        return "\nUsuario: " + lastusuario;
    }

    public void setLastusuario(String lastusuario) {
        this.lastusuario = lastusuario;
    }
    

    @Override
    public String toString() {
        return "where idverificacion = " + id + " " + fechas + " " + documento + " " + usuario;
    }

}
