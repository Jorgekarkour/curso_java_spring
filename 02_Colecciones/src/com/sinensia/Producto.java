package com.sinensia;

/**
 *
 * @author Admin - Jorge
 */
public class Producto extends Entidad {
    
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(long id, String nombre, double precio, int stock) {
        super(id);
        //this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
