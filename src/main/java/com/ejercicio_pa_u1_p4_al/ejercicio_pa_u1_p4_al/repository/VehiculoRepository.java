package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository;

import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Vehiculo;

public interface VehiculoRepository {
    
    public void insertar(Vehiculo vehiculo);
    public Vehiculo seleccionar(String placa);
    public void eliminar(String placa);
    public void actualizar(Vehiculo vehiculo);

}
