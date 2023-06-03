package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.VehiculoRepository;
import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Vehiculo;

@Service 
public class VehiculoServiceImpl implements VehiculoService{

    @Autowired
    private VehiculoRepository vehiculoRepository;
    @Override
    public void ingresar(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        this.vehiculoRepository.insertar(vehiculo);
    }

    @Override
    public Vehiculo buscarPorPlaca(String placa) {
        // TODO Auto-generated method stub
       return this.vehiculoRepository.seleccionar(placa);
    }

    @Override
    public void eliminar(String placa) {
        // TODO Auto-generated method stub
        this.vehiculoRepository.eliminar(placa);
    }

    @Override
    public void actualizar(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        this.vehiculoRepository.actualizar(vehiculo);;
    }
    
}
