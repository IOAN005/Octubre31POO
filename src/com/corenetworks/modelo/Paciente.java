package com.corenetworks.modelo;

public class Paciente {
    //Atributos
    private int idPaciente;
    private String nombe;
    private String apellido;
    private String dni;

    private String dirrection;
    private String telefono;
    private String email;
    //Metodo

    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente=" + idPaciente +
                ", nombe='" + nombe + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", dirrection='" + dirrection + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //3Costructores


    public Paciente() {

    }

    public Paciente(int idPaciente, String nombe, String apellido, String dni, String dirrection, String telefono, String email) {
        this.idPaciente = idPaciente;
        this.nombe = nombe;
        this.apellido = apellido;
        this.dni = dni;
        this.dirrection = dirrection;
        this.telefono = telefono;
        this.email = email;
    }
    //4Setters y getters

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDirrection() {
        return dirrection;
    }

    public void setDirrection(String dirrection) {
        this.dirrection = dirrection;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
