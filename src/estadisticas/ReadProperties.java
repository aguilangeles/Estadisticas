/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Lee el archivo de configuracion.
 *
 * @author MUTNPROD003
 */
public class ReadProperties {

    public Database getUser() {
        Database user = null;
        FileInputStream in = null;
        try {
            Properties p = new Properties();
            in = new FileInputStream("Archivos\\db.properties");
            p.load(in);
            String url = p.getProperty("url");
            String base = p.getProperty("database");
            String usuario = p.getProperty("user");
            String password = p.getProperty("password");
            user = new Database(url, base, usuario, password);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Read Properties", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (in != null) {
                try {
                    in.close();
                    super.finalize();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Read Properties finally",
                            JOptionPane.ERROR_MESSAGE);
                } catch (Throwable ex) {
                    Logger.getLogger(ReadProperties.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return user;
    }

    public static class Database {

        String url, base, name, password;

        public Database() {
        }

        public Database(String url, String base, String name, String password) {
            this.url = url;
            this.base = base;
            this.name = name;
            this.password = password;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getBase() {
            return base;
        }

        public void setBase(String base) {
            this.base = base;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    }
}
