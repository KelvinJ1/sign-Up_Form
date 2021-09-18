
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Empleado;


public class  EmpleadoDAO {
    
    
    
    
    
     public  static Boolean guardar(Empleado empl) {
         Boolean res= false;
        //abre conexión
        try { Conexion con = new Conexion();
            con.conectar();
        //indices base de datos
        String sql= "INSERT INTO empleados ( nombre, apellido,correo, celular, esProovedor, salario, cargo )"
                + "VALUES (?,?,?,?,?,?,?);";//Por seguridad se hace esto
        
        //por medio de una sentencia preparada, se indican los items correspondienters por indices que el objeto (est) en este caso, le pasará a la base de datos
        try {//excepción
            PreparedStatement psm = con.getConexion().prepareStatement(sql);
            
            psm.setString(1, empl.getNombre());
            psm.setString(2, empl.getApellido());
            psm.setString(3, empl.getCorreo());
            psm.setString(4, empl.getCelular());
            psm.setBoolean(5, empl.getEsProveedor());
            psm.setString(6, empl.getSalario());
            psm.setString(7, empl.getCargo());

            psm.executeUpdate();
            res=true;
            
        } catch (SQLException ex) {
           System.err.println("Nose ha podido conectar a la base de datos\n"+ex.getMessage());
        }
        con.cerrarConexion();
     
        }catch (ClassNotFoundException ex) {
         Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    
     
     public static boolean editar(Empleado empl){
         Boolean res=false;
     //Conexión a DB
     
     
      
        try {Conexion con = new Conexion();
          con.conectar();
          
         String sql = "UPDATE empleados SET nombre = ?, apellido = ?, correo=?, celular=?, esProovedor=?, salario=?, cargo=? "
               
                + " WHERE id=?";
        try {
            //Preparo la sentencia de SQL
            PreparedStatement psm = con.getConexion().prepareStatement(sql);
            //Reemplazo los parámetros del query (?) por los valores
            psm.setString(1, empl.getNombre());
            psm.setString(2, empl.getApellido());
            psm.setString(3, empl.getCorreo());
            psm.setString(4, empl.getCelular());
            psm.setBoolean(5, empl.getEsProveedor());
            psm.setString(6, empl.getSalario());
            psm.setString(7, empl.getCargo());
            psm.setLong(8, empl.getId());
            
            //Ejecuto el query
            psm.executeUpdate();
            res=true;
            //Se muestra el mensaje
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Cerrar conexión
       con.cerrarConexion();
       
       } catch (ClassNotFoundException ex) {
         Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
     return  res;
     }
     
     
     
     
      //Traer datos desde la base de datos
    public static ArrayList<Empleado> listar() throws ClassNotFoundException {
    
         Conexion con = new Conexion();
            con.conectar();
        
        String sql= "SELECT * FROM empleados";
        ArrayList<Empleado> listaEmpleados= new ArrayList<>();
        
        try {
            //prepara la sentencia sql a ejecutar
            PreparedStatement sp = con.getConexion().prepareStatement(sql);
            ResultSet rs;
            
            //Ejecuta la sentencia y retorna los datos
            rs=sp.executeQuery();
            while(rs.next()){
                Empleado empl= new Empleado();
                empl.setId(rs.getLong("id"));
                empl.setApellido(rs.getString("apellido"));
                empl.setNombre(rs.getString("nombre"));
                empl.setCelular(rs.getString("celular"));
                empl.setCorreo(rs.getString("correo"));
                empl.setEsProveedor(rs.getBoolean("esProovedor"));
                empl.setCargo(rs.getString("cargo"));
                empl.setSalario(rs.getString("salario"));

               
                listaEmpleados.add(empl);
            
            }
            sp.close();
        } catch (SQLException ex) {
                          Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);

     }
          con.cerrarConexion();
    return listaEmpleados;


}
}