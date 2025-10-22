package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class CConexion {
   String usuario="root";
   String contrasena="";
   String url="jdbc:mysql://localhost:3306/agenda";
   
   public CConexion(){
       
   }
   public Connection conectar(){
       Connection con=null;
       try{         
          con= DriverManager.getConnection(url,usuario,contrasena);
          System.out.println("conexion correcta");
          return con;
       }catch (Exception e){
          return null;
       }
   }
   
   public void desconectar(Connection con){
       try{         
          con.close();
          System.out.println("se cerró la conexión");
       }catch (Exception e){
          System.out.println(e.toString());
       }
       
   }
   
}
