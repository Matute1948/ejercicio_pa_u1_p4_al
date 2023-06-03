package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository;

import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Propietario;

public interface PropietarioRepository {
    
    public void insertar(Propietario propietario);
    public Propietario seleccionar(String identificacion);
    public void eliminar(String identificacion);
}
