package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository;

import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Matricula;

public interface MatriculaRepository {

    public void insertar(Matricula Matricula);
    public Matricula seleccionar(String identificacionPropietario);
    
   

    
}
