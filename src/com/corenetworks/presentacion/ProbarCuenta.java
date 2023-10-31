package com.corenetworks.presentacion;

import com.corenetworks.modelo.Cuenta;

import java.util.concurrent.Callable;

public class ProbarCuenta {
    public static void main(String[] args) {


        //Instanciar la classe.
        Cuenta c1=new Cuenta("Pedro Gutierrez",2_500);
        c1.ingresar(100);
        System.out.println("ingresar cantidat positiva"+c1.getCantidad());
        c1.ingresar(-100);
        System.out.println("ingresar candidad negativa" +c1.getCantidad());
        c1.retirar(200);
        System.out.println("retirar cantidad menos a cantidad"+c1.getCantidad());
        c1.retirar(2600);
        System.out.println("retirar cantidad mayou a cantidad");






    }
}
