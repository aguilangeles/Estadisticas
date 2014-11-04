/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErroresPorTraza;

import models.TipodeControl;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Filtro;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class Procesor {

    private final Filtro filtro;
    private final int aceptadas, rechazadas;
    GetListadeTrazas trazas = null;
    private DefaultTableModel modelo_;

    public Procesor(Filtro filtro, int aceptadas, int rechazadas) {
        this.filtro = filtro;
        this.aceptadas = aceptadas;
        this.rechazadas = rechazadas;
        this.trazas = new GetListadeTrazas(filtro, aceptadas, rechazadas);
        this.modelo_ = tabla();
    }


    private DefaultTableModel tabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("tipo error");
        modelo.addColumn("cantidad");
        List<TipodeControl> controles = trazas.getControles();
        
        for (TipodeControl control : controles) {
            String nombre = control.getNombre();
            int cantidad = control.getCantidad();
            modelo.addRow(new Object[]{nombre, cantidad});
        }
        return modelo;
    }
    public DefaultTableModel getModelo_() {
        return modelo_;
    }

    public void setModelo_(DefaultTableModel modelo_) {
        this.modelo_ = modelo_;
    }
}
