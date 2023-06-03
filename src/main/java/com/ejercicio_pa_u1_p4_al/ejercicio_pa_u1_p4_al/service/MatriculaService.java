package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.service;

import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Matricula;

public interface MatriculaService {
    public void ingresar(Matricula Matricula);
    public Matricula buscarPorPropietario(String identificacionPropietario);
    public void generarMatricula(String identificacion, String placa);
}
