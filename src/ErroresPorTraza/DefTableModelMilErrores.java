/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErroresPorTraza;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.TipodeControl;
import models.TrazaControl;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class DefTableModelMilErrores {

    private final DefaultTableModel pormil;

    public DefTableModelMilErrores(GetListadeTrazas trazas) {

        this.pormil = tableErrorMil(trazas);
    }

    private DefaultTableModel tableErrorMil(GetListadeTrazas trazas) {
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

            model.addRow(new Object[]{nombre, mill(cantidad, muestra), cantidad, muestra});
        }
        return model;
    }

    private Double mill(int error, int muestra) {
        double aerror = (double) error;
        double amuestra = (double) muestra;
        double mil = (aerror / amuestra) * 1000;
        return mil;
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
        return pormil;
    }

}
