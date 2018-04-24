package pe.edu.vallegrande.dao;

import java.sql.Connection;
import java.sql.DriverManager;

    public class Conexion {

    public static Connection cnx;

    public static Connection conectar(){
        if (cnx!=null){ // si esta abierta la conexión
            return cnx;
        }
        try {
            String url = "jdbc:sqlserver://192.168.8.155;databaseName=BDHospitalVG";
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String user = "sa";
            String pwd = "vallegrande2017";
            Class.forName(driver);
            cnx = DriverManager.getConnection(url, user, pwd);
        } catch (Exception e) {
            System.out.println("Error en la conexión " + e.getMessage());
        }
        return cnx;
    }



}
