/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import estadisticas.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class SetTrazaFromDoctype {

    private String condicion;
    private int idDoctype;

    public SetTrazaFromDoctype(String condicion) {
        this.condicion = condicion;
        this.idDoctype=getiddocument(condicion);
    }

    public int getiddocument(String description) {
        int id = 0;
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT id FROM qualitys.tipos_documentos where descripcion = '" + description + "';";
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {
                    id = conexion.resulset.getInt(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(JComboTipoDoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        conexion.isConexionClose();
        return id;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public int getIdDoctype() {
        return idDoctype;
    }

    public void setIdDoctype(int idDoctype) {
        this.idDoctype = idDoctype;
    }
    
}
