package com.corenetworks.presentacion;

import com.corenetworks.modelo.Medico;

public class ProbarMedico {
    public static void main(String[] args) {
        Medico m1=new Medico();
        m1.setIdMedico(150);
        m1.setNombres("Francisco");
        m1.setApellidos("Guttierez");
        m1.setCmp("Cirujano Plastico");
        System.out.println(m1.toString());


        Medico m2=new Medico(250,"Julio","Batan","Cirujano normal");
        System.out.println(m2.toString());


    }
}
