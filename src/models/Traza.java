/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author Maria
 */
public class Traza {
    
    private int id;
    private Date fecha;
    private String rutaCompleta;
    private String ultmimaCarpeta;
    private int tamanio;
    private int cantidadMuestreada;
    private int nroRechazo;
    private String lineaCaptura;
    private String Digitalizador;
    private int idRango;
    private int estadoLote;
    private int observaciones;
    private int idVerificacion;
    private int idUsuario;
    private int idTipoDocumento;
    private static final Logger LOG = Logger.getLogger(Traza.class.getName());

    public Traza(int id, Date fecha, String rutaCompleta, String ultmimaCarpeta, int tamanio, int cantidadMuestreada, int nroRechazo, String lineaCaptura, String Digitalizador, int idRango, int estadoLote, int observaciones, int idVerificacion, int idUsuario, int idTipoDocumento) {
        this.id = id;
        this.fecha = fecha;
        this.rutaCompleta = rutaCompleta;
        this.ultmimaCarpeta = ultmimaCarpeta;
        this.tamanio = tamanio;
        this.cantidadMuestreada = cantidadMuestreada;
        this.nroRechazo = nroRechazo;
        this.lineaCaptura = lineaCaptura;
        this.Digitalizador = Digitalizador;
        this.idRango = idRango;
        this.estadoLote = estadoLote;
        this.observaciones = observaciones;
        this.idVerificacion = idVerificacion;
        this.idUsuario = idUsuario;
        this.idTipoDocumento = idTipoDocumento;
    }

    public Traza() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRutaCompleta() {
        return rutaCompleta;
    }

    public void setRutaCompleta(String rutaCompleta) {
        this.rutaCompleta = rutaCompleta;
    }

    public String getUltmimaCarpeta() {
        return ultmimaCarpeta;
    }

    public void setUltmimaCarpeta(String ultmimaCarpeta) {
        this.ultmimaCarpeta = ultmimaCarpeta;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getCantidadMuestreada() {
        return cantidadMuestreada;
    }

    public void setCantidadMuestreada(int cantidadMuestreada) {
        this.cantidadMuestreada = cantidadMuestreada;
    }

    public int getNroRechazo() {
        return nroRechazo;
    }

    public void setNroRechazo(int nroRechazo) {
        this.nroRechazo = nroRechazo;
    }

    public String getLineaCaptura() {
        return lineaCaptura;
    }

    public void setLineaCaptura(String lineaCaptura) {
        this.lineaCaptura = lineaCaptura;
    }

    public String getDigitalizador() {
        return Digitalizador;
    }

    public void setDigitalizador(String Digitalizador) {
        this.Digitalizador = Digitalizador;
    }

    public int getIdRango() {
        return idRango;
    }

    public void setIdRango(int idRango) {
        this.idRango = idRango;
    }

    public int getEstadoLote() {
        return estadoLote;
    }

    public void setEstadoLote(int estadoLote) {
        this.estadoLote = estadoLote;
    }

    public int getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(int observaciones) {
        this.observaciones = observaciones;
    }

    public int getIdVerificacion() {
        return idVerificacion;
    }

    public void setIdVerificacion(int idVerificacion) {
        this.idVerificacion = idVerificacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    @Override
    public String toString() {
        return "Traza{" + "id=" + id + ", fecha=" + fecha + ", rutaCompleta=" + rutaCompleta + ", ultmimaCarpeta=" + ultmimaCarpeta + ", tamanio=" + tamanio + ", cantidadMuestreada=" + cantidadMuestreada + ", nroRechazo=" + nroRechazo + ", lineaCaptura=" + lineaCaptura + ", Digitalizador=" + Digitalizador + ", idRango=" + idRango + ", estadoLote=" + estadoLote + ", observaciones=" + observaciones + ", idVerificacion=" + idVerificacion + ", idUsuario=" + idUsuario + ", idTipoDocumento=" + idTipoDocumento + '}';
    }
    
    
    
}
