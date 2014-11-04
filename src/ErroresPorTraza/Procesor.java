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
import models.TrazaControl;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class Procesor {

    private final Filtro filtro;
    private final int aceptadas, rechazadas;
    GetListadeTrazas trazas = null;
    private final DefaultTableModel errorModel;
    private final DefaultTableModel cantidad;
    private final DefaultTableModel pormil;

    public Procesor(Filtro filtro, int aceptadas, int rechazadas) {
        this.filtro = filtro;
        this.aceptadas = aceptadas;
        this.rechazadas = rechazadas;
        this.trazas = new GetListadeTrazas(filtro, aceptadas, rechazadas);
        this.errorModel = new CantidaddeErrores(trazas).getErrores();
        this.cantidad = tableCantidad();
        this.pormil=tableErrorMil();
    }

//    private DefaultTableModel tableErrores() {
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.addColumn("tipo error");
//        modelo.addColumn("cantidad");
//        List<TipodeControl> controles = trazas.getControles();
//
//        for (TipodeControl control : controles) {
//            String nombre = control.getNombre();
//            int cantidad = control.getCantidad();
//            modelo.addRow(new Object[]{nombre, cantidad});
//        }
//        return modelo;
//    }

    private DefaultTableModel tableCantidad() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("controles");
        model.addColumn("cantidad");
        model.addRow(new Object[]{"Aceptadas", aceptadas});
        model.addRow(new Object[]{"Rechazadas", rechazadas});
        ///

        return model;
    }

    private DefaultTableModel tableErrorMil() {
        List<TipodeControl> controles = trazas.getControles();
        DefaultTableModel model = new DefaultTableModel();
        int muestra = totalimagenes();
        //
        model.addColumn("Tipo de error");
        model.addColumn("Error x mil");
        model.addColumn("Cantidad");
        model.addColumn("Muestra");

        for (TipodeControl control : controles) {
            String nombre = control.getNombre();
            int cantidad = control.getCantidad();

            model.addRow(new Object[]{nombre, mill(cantidad, muestra),cantidad, muestra});
        }
        return model;
    }

    private Double mill(int error, int muestra) {
        double aerror = (double) error;
        double amuestra = (double) muestra;
        double mil = (aerror / amuestra) * 1000;
        return mil;
    }

    private int totalimagenes() {
        int total = 0;
        List<TrazaControl> traza = trazas.getTraza();

        for (TrazaControl traza1 : traza) {
            total += traza1.getMuestra();
        }
        return total;
    }

    public DefaultTableModel getErrorModel() {
        return errorModel;
    }

    public DefaultTableModel getCantidad() {
        return cantidad;
    }

    public DefaultTableModel getPormil() {
        return pormil;
    }
    

}
