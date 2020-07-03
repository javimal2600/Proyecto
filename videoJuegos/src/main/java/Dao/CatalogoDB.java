/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Javier
 */
public class CatalogoDB {
   private static final String categorias = "Select * from cat_categorias";
    
    private Connection conexion = new Conexion().getConection();//Metodo getConection() para hacer la conexion con la base de datos.
    private PreparedStatement stmt;
    private ResultSet rs;
    
    public List<Catalogo> ListadoCategorias() throws SQLException {
        List<Catalogo> Catalogo = new ArrayList<>(); //Se crea el array de la clase Usuario
        this.stmt = this.conexion.prepareStatement(categorias);//Se hace la conexion con la bd por la variable conexion
        this.rs = this.stmt.executeQuery();
        while (this.rs.next()) {
            Catalogo.add(new Catalogo(this.rs.getInt("id_categoria"),this.rs.getString("nombre") ));
        }
        return Catalogo;
    }
    
}
