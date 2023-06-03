package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository{

    private List<Vehiculo> baseDatos = new ArrayList<>();

    @Override
    public void insertar(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        this.baseDatos.add( vehiculo);
    }

    @Override
    public Vehiculo seleccionar(String placa) {
        // TODO Auto-generated method stub
        Vehiculo vehiculoEncontrado = new Vehiculo();
        for(Vehiculo iterativo: baseDatos){
            if(placa.equals(iterativo.getPlaca())){
                vehiculoEncontrado = iterativo;
            }
        }
        return vehiculoEncontrado;
    }

    @Override
    public void eliminar(String placa) {
        // TODO Auto-generated method stub
        Vehiculo vehiculoEliminar = this.seleccionar(placa);
        this.baseDatos.remove(vehiculoEliminar);
    }

    @Override
    public void actualizar(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        this.eliminar(vehiculo.getPlaca());
        this.insertar(vehiculo);
    }
    
}
