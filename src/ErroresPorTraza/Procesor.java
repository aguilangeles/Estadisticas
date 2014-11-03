/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErroresPorTraza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import models.Filtro;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class Procesor {

    private Filtro filtro;
    private int aceptadas, rechazadas;
    GEtListOfTrazas list = null;
    private DefaultTableModel modelo_;

    public Procesor(Filtro filtro, int aceptadas, int rechazadas) {
        this.filtro = filtro;
        this.aceptadas = aceptadas;
        this.rechazadas = rechazadas;
        this.list = new GEtListOfTrazas(filtro, aceptadas, rechazadas);
        getErroresporTraza();
        this.modelo_ = tabla();
    }

    private void getErroresporTraza() {

    }

    public DefaultTableModel getModelo_() {
        return modelo_;
    }

    public void setModelo_(DefaultTableModel modelo_) {
        this.modelo_ = modelo_;
    }

    private DefaultTableModel tabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("tipo error");
        modelo.addColumn("cantidad");
        List<TipodeControl> controles = list.getControles();
        
        for (TipodeControl controle : controles) {
            System.out.println(controle);
            String nombre = controle.getNombre();
            int cantidad = controle.getCantidad();
            System.out.println("insertando modelo");
            modelo.addRow(new Object[]{nombre, cantidad});
        }

        return modelo;
    }
}
