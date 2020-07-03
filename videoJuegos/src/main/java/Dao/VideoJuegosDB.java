/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Javier
 */
public class VideoJuegosDB {
    private static final String listado = "SELECT  juegos.id_juego,juegos.nombre,juegos.descripcion,cat_categorias.nombre as categorias,precio FROM `juegos`JOIN cat_categorias on juegos.id_categoria=cat_categorias.id_categoria";
    
    
    private Connection conexion = new Conexion().getConection();//Metodo getConection() para hacer la conexion con la base de datos.
    private PreparedStatement stmt;
    private ResultSet rs;
    
    public List<VideoJuegos> ListadoJuegos() throws SQLException {
        List<VideoJuegos> VideoJuegos = new ArrayList<>(); //Se crea el array de la clase Usuario
        this.stmt = this.conexion.prepareStatement(listado);//Se hace la conexion con la bd por la variable conexion
        this.rs = this.stmt.executeQuery();
        while (this.rs.next()) {
            VideoJuegos.add(new VideoJuegos(this.rs.getInt("id_juego"), this.rs.getString("nombre"), this.rs.getString("descripcion"),this.rs.getString("categorias"), this.rs.getDouble("precio")));
        }
        return VideoJuegos;
    }
}
