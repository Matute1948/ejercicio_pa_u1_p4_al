package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("automatico")
public class VehiculoAutomaticoService implements VehiculoTipoService{
    @Override
    public BigDecimal calcularMatriculaTipoVehiculo(BigDecimal precio) {
        // TODO Auto-generated method stub
        return precio.multiply(new BigDecimal(0.15));
    }
}
