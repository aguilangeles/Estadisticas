/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Maria
 */
public class Control {
    private int id;
    private String descripcion;
    private int texto;
    private String imagen;
    private int estado;

    public Control(int id, String descripcion, int texto, String imagen, int estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.texto = texto;
        this.imagen = imagen;
        this.estado = estado;
    }

    public Control() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTexto() {
        return texto;
    }

    public void setTexto(int texto) {
        this.texto = texto;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Control{" + "id=" + id + ", descripcion=" + descripcion + ", texto=" + texto + ", imagen=" + imagen + ", estado=" + estado + '}';
    }
    
    
    
}
