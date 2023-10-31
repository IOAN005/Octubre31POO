package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

public class ProbarProducto {
    public static void main(String[] args) {
        Producto p1=new Producto(1,"Pelotas",20);
        p1.compraProducto(20);
        System.out.println("compra de producto "+p1.getCantidadExistenci());
        p1.ventaProducto(12);
        System.out.println("venta producto" +p1.getCantidadExistenci());
        System.out.println(p1.toString());
    }
}
