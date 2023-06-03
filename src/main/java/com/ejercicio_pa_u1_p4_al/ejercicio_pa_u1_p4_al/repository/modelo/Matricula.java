package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Matricula {

    private LocalDate fechaMatricula;
    private BigDecimal valorMatricula;
    private Propietario propietario;
    private Vehiculo vehiculo;

    //set y get
    public LocalDate getFechaMatricula() {
        return fechaMatricula;
    }
    public void setFechaMatricula(LocalDate fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }
    public BigDecimal getValorMatricula() {
        return valorMatricula;
    }
    public void setValorMatricula(BigDecimal valorMatricula) {
        this.valorMatricula = valorMatricula;
    }
    public Propietario getPropietario() {
        return propietario;
    }
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
     //toString
    @Override
    public String toString() {
        return "Matricula [fechaMatricula=" + fechaMatricula + ", valorMatricula=" + valorMatricula + ", propietario="
                + propietario + ", vehiculo=" + vehiculo + "]";
    }

    

    
    
    
}
