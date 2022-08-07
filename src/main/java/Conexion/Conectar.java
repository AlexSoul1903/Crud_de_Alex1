package Conexion;

import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;


public class Conectar {
        
    private static Connection conn;
    
    private static final String driver="com.mysql.jdbc.Driver";
   
   private static final String user="root";
   
    private static final String password="";
    
    private static final String url="jdbc:mysql://localhost:3306/Usuarios";

    public Conectar() {
        
       
        conn=null;
        
        try {
        
            Class.forName(driver);
            
            
       conn=DriverManager.getConnection(url,user,password);
        
  
          
          
        }catch(ClassNotFoundException | SQLException e){
            
           System.out.println("Error"+ e);
        
      
        }
        
    }
          
            public Connection getConnection(){
    
    return conn;
   
    }
        
    
    public void desconectar(){
    
        conn=null;
        
       
    }
   
  
    
     }
        
     
