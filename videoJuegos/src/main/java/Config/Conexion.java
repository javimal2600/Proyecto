/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Javier
 */
public class Conexion {
    private Connection conexion = null;
    private static final String localhost = "";
    private static final String usuario = "root";
    private static final String contraseña ="";
    private static final String bd = "videojuegos";

    public Connection getConection() {//Metodo para hacer la conexion con la base de datos.
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/videojuegos", "root", "");
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            return conexion;
        }
    }
}
