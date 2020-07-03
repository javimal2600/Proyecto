/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author Javier
 */
public class VideoJuegos {
    private int idJuego;
    private String nombre;
    private String descripcion;
    private String nombreCat;
    private double precio;
    

    public VideoJuegos() {
    }

    public VideoJuegos(int idJuego, String nombre, String descripcion, String nombreCat, double precio) {
        this.idJuego = idJuego;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nombreCat = nombreCat;
        this.precio = precio;
    }
    
    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }


}
