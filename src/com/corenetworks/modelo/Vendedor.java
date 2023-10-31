package com.corenetworks.modelo;

public class Vendedor {
    //Atributos
    private int idEmpleado;
    private double sueldo;
    private String dni;
    private String nombre;
    private double ventas;
    private double procentajeComision;
    //metodos
    public double calcularSueldo(){
        return this.sueldo+ventas*procentajeComision;



    }
    public double calcularImpuesto(){
        return calcularSueldo()*0.3;

    }

}
