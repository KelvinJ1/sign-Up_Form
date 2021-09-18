
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
 
    private String url;
    
    private Connection conexion;
    
    //Getters and Setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    
      
       
    public   Connection conectar() throws ClassNotFoundException{
        Class.forName("org.sqlite.JDBC");//conecta sin necesidad de especificar la ruta
        
        //Conexión a la DB
       
        try {conexion=DriverManager.getConnection("jdbc:sqlite: mydb.db");//nombre de la  db
          
               // if(conexion !=null){
                   // System.out.println("Conectado");
                //}
        
        } catch (SQLException ex) {
           System.err.println("Nose ha podido conectar a la base de datos\n"+ex.getMessage());
            // Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return conexion;
    }
    
    public void cerrarConexion(){
    
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    
    
    
}

    
   
