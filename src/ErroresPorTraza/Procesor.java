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
    List<TipodeControl> ultimalist = new ArrayList<>();
    Map<Integer, TipodeControl> mapcontrol = new HashMap();
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
        int valor = 0;

        for (TrazaControl ct : list.getListTrazas()) {
            if (!ct.getControles().isEmpty()) {
                List<TipodeControl> listcontrol = ct.getControles();
                for (TipodeControl listcontrol1 : listcontrol) {
                    valor += ct.iterar(listcontrol1.getNombre());
//                    System.out.println("valor " + listcontrol1.getNombre() + "; " + valor);
                }
            }
        }
    }

    private void getlistafinal(int valor, TipodeControl tipodeControl) {
        mapcontrol.put(valor, tipodeControl);

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

        for (Map.Entry<Integer, TipodeControl> entrySet : mapcontrol.entrySet()) {
            Integer key = entrySet.getKey();
            TipodeControl value = entrySet.getValue();
            String nombre = value.getNombre();
            int cantidad = value.getCantidad();
            System.out.println("insertando modelo");
            modelo.addRow(new Object[]{nombre, cantidad});
        }

        return modelo;
    }
}
