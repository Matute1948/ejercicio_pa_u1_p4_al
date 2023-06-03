package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo;

import java.math.BigDecimal;

public class Vehiculo {

    private String marca;
    private String placa;
    private String Modelo;
    private BigDecimal precio;
    private String tipo;

    // get and set

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public BigDecimal getPrecio() {
        return precio;
    }
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    // toString 
    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", placa=" + placa + ", Modelo=" + Modelo + ", precio=" + precio + ", tipo="
                + tipo + "]";
    }

    
    
}
