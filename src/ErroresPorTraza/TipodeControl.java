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
    private String  nombre;
    private int cantidad;

    public TipodeControl(int id, String nombre, int cantidad) {
        this.id = id;
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

    @Override
    public String toString() {
        return "TipodeControl{" + "id=" + id +  ", nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
}
