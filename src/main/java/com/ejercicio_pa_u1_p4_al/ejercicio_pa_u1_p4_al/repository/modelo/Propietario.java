package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo;

import java.time.LocalDate;

public class Propietario {

    private String nombre;
    private String apellido;
    private String identificacion;
    private LocalDate fechaNacmiento;

    //get and set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public LocalDate getFechaNacmiento() {
        return fechaNacmiento;
    }
    public void setFechaNacmiento(LocalDate fechaNacmiento) {
        this.fechaNacmiento = fechaNacmiento;
    }

    //toString
    @Override
    public String toString() {
        return "Propietario [nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion
                + ", fechaNacmiento=" + fechaNacmiento + "]";
    }

    
    
    
}
