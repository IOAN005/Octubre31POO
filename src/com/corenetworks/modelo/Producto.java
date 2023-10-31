package com.corenetworks.modelo;

public class Producto {
    //Atributo
    private int idProducto;
    private String nombre;
    private int cantidadExistenci;

    //Metodos
    public void compraProducto(int cantidad){
        if (cantidad>=0){
            cantidadExistenci=cantidadExistenci+cantidad;
            //cantidadExistencia+=cantidad;

        }
    }
    public void ventaProducto(int cantidad){
        if (cantidad<=cantidadExistenci){
            cantidadExistenci=cantidadExistenci-cantidad;
            //cantidadExistencia-=cantidad;

        }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "producto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", cantidadExistenci=" + cantidadExistenci +
                '}';
    }
    //Construcores

    public Producto() {
    }

    public Producto(int idProducto, String nombre, int cantidadExistenci) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidadExistenci = cantidadExistenci;
    }
    //4.Setters y getters

    public int getIdProducto() {
        return idProducto;
    }

    public void setidProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadExistenci() {
        return cantidadExistenci;
    }

    public void setCantidadExistenci(int cantidadExistenci) {
        this.cantidadExistenci = cantidadExistenci;
    }
}

