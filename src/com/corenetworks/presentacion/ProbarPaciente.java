package com.corenetworks.presentacion;

import com.corenetworks.modelo.Medico;
import com.corenetworks.modelo.Paciente;

import java.util.Scanner;

public class ProbarPaciente {
    public static void main(String[] args) {
        Paciente p1=new Paciente();
        p1.setIdPaciente(1);
        p1.setNombe("Juanito");
        p1.setApellido("Lopez");
        p1.setDni("123456m");
        p1.setDirrection("c/real 25");
        p1.setTelefono("12345678");
        p1.setEmail("jLopez@gmail.com");

        System.out.println(p1.toString());


        //Instanciar la clase
        Paciente p2=new Paciente(2,"manolo","gonzales","222222n","c/mayor 01","677334455","Mgonzales@gamil.com");
        System.out.println(p2.toString());
        //supuesto recibir datos consola
        Scanner teclado =new Scanner(System.in);
        Medico m3= new Medico();
        System.out.println("escriba el id del medico");
        m3.setIdMedico(teclado.nextInt());
        teclado.nextLine();

        System.out.println("escribe el nombre del medico");
        m3.setNombres(teclado.nextLine());

        System.out.println("escriba el appellido");
        m3.setApellidos(teclado.nextLine());

        System.out.println("escriba el cmp del medico");
        m3.setCmp(teclado.nextLine());
        System.out.println(m3.toString());

    }
}
