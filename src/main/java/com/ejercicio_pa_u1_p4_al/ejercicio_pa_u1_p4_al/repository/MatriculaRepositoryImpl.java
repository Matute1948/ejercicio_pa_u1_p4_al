package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements MatriculaRepository{

    private List<Matricula> baseDatos = new ArrayList<>();
    @Override
    public void insertar(Matricula Matricula) {
        // TODO Auto-generated method stub
        this.baseDatos.add( Matricula);
    }

    @Override
    public Matricula seleccionar(String identificacion) {
        // TODO Auto-generated method stub
        Matricula matriculaEncontrado = new Matricula();
        for(Matricula iterativo: baseDatos){
            if(identificacion.equals(iterativo.getPropietario().getIdentificacion())){
                matriculaEncontrado = iterativo;
            }
        }
        return matriculaEncontrado;
    }
    
}
