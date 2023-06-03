package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.service;

import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Vehiculo;

public interface VehiculoService {

    public void ingresar(Vehiculo vehiculo);
    public Vehiculo buscarPorPlaca(String placa);
    public void eliminar(String placa);
    public void actualizar(Vehiculo vehiculo);
    
}
