package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.PropietarioRepository;
import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements PropietarioService{

    @Autowired
    private PropietarioRepository propietarioRepository;

    @Override
    public void ingresar(Propietario propietario) {
        // TODO Auto-generated method stub
        this.propietarioRepository.insertar(propietario);
    }

    @Override
    public Propietario  buscarPorIdentificacion(String identificacion) {
        // TODO Auto-generated method stub
        return this.propietarioRepository.seleccionar(identificacion);
    }

    @Override
    public void eliminar(String identificacion) {
        // TODO Auto-generated method stub
        this.propietarioRepository.eliminar(identificacion);
    }
    
}
