package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository{

    private List<Propietario> baseDatos = new ArrayList<>();

    @Override
    public void insertar(Propietario propietario) {
        // TODO Auto-generated method stub
        this.baseDatos.add( propietario);
    }

    @Override
    public Propietario seleccionar(String identificacion) {
        // TODO Auto-generated method stub
        Propietario propietarioEncontrado = new Propietario();
        for(Propietario iterativo: baseDatos){
            if(identificacion.equals(iterativo.getIdentificacion())){
                propietarioEncontrado = iterativo;
            }
        }
        return propietarioEncontrado;
    }

    @Override
    public void eliminar(String identificacion) {
        // TODO Auto-generated method stub
        Propietario propietarioEliminar = this.seleccionar(identificacion);
        this.baseDatos.remove(propietarioEliminar);
    }
    
}
