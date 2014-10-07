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
public class TrazaporVerificacion {

    private int id;
    private int idVerificacion;
    private int trazas;
    private int aceptadas;
    private int rechazadas;
    private int nulas;
    private String firstDate;
    private String lastDate;
    private String doctype;
    private String username;

    public TrazaporVerificacion(int id, int idVerificacion, int trazas, int aceptadas, int rechazadas, int nulas, String firstDate, String lastDate, String doctype, String username) {
        this.id = id;
        this.idVerificacion = idVerificacion;
        this.trazas = trazas;
        this.aceptadas = aceptadas;
        this.rechazadas = rechazadas;
        this.nulas = nulas;
        this.firstDate = firstDate;
        this.lastDate = lastDate;
        this.doctype = doctype;
        this.username = username;
    }

    public TrazaporVerificacion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVerificacion() {
        return idVerificacion;
    }

    public void setIdVerificacion(int idVerificacion) {
        this.idVerificacion = idVerificacion;
    }

    public int getAceptadas() {
        return aceptadas;
    }

    public void setAceptadas(int aceptadas) {
        this.aceptadas = aceptadas;
    }

    public int getRechazadas() {
        return rechazadas;
    }

    public void setRechazadas(int rechazadas) {
        this.rechazadas = rechazadas;
    }

    public int getNulas() {
        return nulas;
    }

    public void setNulas(int nulas) {
        this.nulas = nulas;
    }

    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getTrazas() {
        return trazas;
    }

    public void setTrazas(int trazas) {
        this.trazas = trazas;
    }

    @Override
    public String toString() {
        return "TrazaporVerificacion{" + "id=" + id + "\n idVerificacion=" + idVerificacion
                + "\n trazas=" + trazas
                + "\n aceptadas=" + aceptadas
                + "\n rechazadas=" + rechazadas + "\n nulas=" + nulas
                + "\n firstDate=" + firstDate + "\n lastDate=" + lastDate
                + "\n doctype=" + doctype + "\n username=" + username + '}';
    }

}
