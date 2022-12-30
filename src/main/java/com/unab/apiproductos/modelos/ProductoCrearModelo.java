package com.unab.apiproductos.modelos;

public class ProductoCrearModelo {

    private String idProducto;
    private String nombre;
    private Integer precio;
    private Float iva;

    public String getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return this.precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Float getIva() {
        return this.iva;
    }

    public void setIva(Float iva) {
        this.iva = iva;
    }

    
}
