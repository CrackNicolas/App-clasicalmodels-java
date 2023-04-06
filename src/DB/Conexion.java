package DB;

import java.sql.Connection;

public class Conexion{
    private static Connection conexion;
    
    public static Connection Conectar(){
        try{
            conexion = java.sql.DriverManager.getConnection("jdbc:mysql://"+Variables.host+"/"+Variables.database+"?serverTimezone=UTC",Variables.user,Variables.password);
        }catch(java.sql.SQLException e){
            System.out.println(e.getMessage());
        }  
        return conexion;
    }
}