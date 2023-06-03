package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.service;

import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Propietario;

public interface PropietarioService {
    public void ingresar(Propietario propietario);
    public Propietario buscarPorIdentificacion(String identificacion);
    public void eliminar(String identificacion);
    
}
