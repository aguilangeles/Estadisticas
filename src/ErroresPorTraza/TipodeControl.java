/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErroresPorTraza;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class TipodeControl {

    private int idtraza;
    private int idcontrol;
    private String nombre;
    private int cantidad;

    public TipodeControl(int idtraza, int idcontrol, String nombre, int cantidad) {
        this.idtraza = idtraza;
        this.idcontrol = idcontrol;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public TipodeControl(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    

 

    public int getIdtraza() {
        return idtraza;
    }

    public void setIdtraza(int idtraza) {
        this.idtraza = idtraza;
    }

    public int getIdcontrol() {
        return idcontrol;
    }

    public void setIdcontrol(int idcontrol) {
        this.idcontrol = idcontrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "TipodeControl{" + "idtraza=" + idtraza + ", idcontrol=" + idcontrol + ", nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }

}
