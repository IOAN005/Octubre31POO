package com.corenetworks.presentacion;

import com.corenetworks.modelo.Especialidad;

import java.util.Scanner;

public class ProbarEspecialidad {
    public static void main(String[] args) {
        Especialidad e1=new Especialidad(250,"Ioan");
        System.out.println(e1.toString());

        Especialidad e2= new Especialidad();
        e2.setIdEspecialidad(2);
        e2.setNombre("Penelope");
        System.out.println(e2.toString());
        Scanner teclado=new Scanner(System.in);
        Especialidad e3=new Especialidad();
        System.out.println("escribe el id ");
        e3.setIdEspecialidad(teclado.nextInt());
        teclado.nextLine();

        System.out.println("escribe el nombre");
        e3.setNombre(teclado.nextLine());

        System.out.println(e3.toString());




    }
}
