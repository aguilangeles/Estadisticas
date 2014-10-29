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

    private int id;
    private int idcontrol;
    private String nombre;
    private int cantidad;

    public TipodeControl(int id, int idcontrol, String nombre, int cantidad) {
        this.id = id;
        this.idcontrol = idcontrol;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public TipodeControl() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getIdcontrol() {
        return idcontrol;
    }

    public void setIdcontrol(int idcontrol) {
        this.idcontrol = idcontrol;
    }

    @Override
    public String toString() {
        return "TipodeControl{" + "id=" + id + ", idcontrol=" + idcontrol + ", nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    

 

}
