/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultTableModels;

import ErroresPorTraza.GetListadeTrazas;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.TipodeControl;
import models.TrazaControl;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class TableModelErroresPorMil {

    private final DefaultTableModel erroresporMil;

    public TableModelErroresPorMil(GetListadeTrazas trazas) {

        this.erroresporMil = modelMil(trazas);
    }

    private DefaultTableModel modelMil(GetListadeTrazas trazas) {
        List<TipodeControl> controles = trazas.getControles();
        DefaultTableModel model = new DefaultTableModel();
        int muestra = totalimagenes(trazas);
        //
        model.addColumn("Tipo de error");
        model.addColumn("Error x mil");
        model.addColumn("Cantidad");
        model.addColumn("Muestra");

        for (TipodeControl control : controles) {
            String nombre = control.getNombre();
            int cantidad = control.getCantidad();

            model.addRow(new Object[]{nombre, pormil(cantidad, muestra), cantidad, muestra});
        }
        return model;
    }

    private Double pormil(int error, int muestra) {
        double aerror = (double) error;
        double amuestra = (double) muestra;
        double mil = (aerror / amuestra) * 1000;
        return Redondear(mil);
    }

    private double Redondear(double numero) {
        return Math.rint(numero * 100) / 100;
    }

    private int totalimagenes(GetListadeTrazas trazas) {
        int total = 0;
        List<TrazaControl> traza = trazas.getTraza();

        for (TrazaControl traza1 : traza) {
            total += traza1.getMuestra();
        }
        return total;
    }

    public DefaultTableModel getPormil() {
        return erroresporMil;
    }

}
