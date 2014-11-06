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

/**
 *
 * @author aguilangeles@gmail.com
 */
public class TableModelTiposError {
    
    private final  DefaultTableModel errores;
    

    public TableModelTiposError(GetListadeTrazas trazas) {
        this.errores= tableErrores(trazas);
    }
    
    
    
       private DefaultTableModel tableErrores(GetListadeTrazas trazas) {
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
    /**/

    /**
     *
     * @return
     */
    public DefaultTableModel getErrores() {
        return errores;
    }
       
}
