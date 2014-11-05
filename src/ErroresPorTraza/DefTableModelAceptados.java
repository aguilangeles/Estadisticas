/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErroresPorTraza;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class DefTableModelAceptados {
    
    private DefaultTableModel aceptRech;

    public DefTableModelAceptados(int aceptadas, int rechazadas) {
        this.aceptRech=tableCantidad(aceptadas, rechazadas);
    }
    

    
        private DefaultTableModel tableCantidad(int aceptadas, int rechazadas) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("controles");
        model.addColumn("cantidad");
        model.addRow(new Object[]{"Aceptadas", aceptadas});
        model.addRow(new Object[]{"Rechazadas", rechazadas});
        return model;
    }

    public DefaultTableModel getAceptRech() {
        return aceptRech;
    }
        
}
