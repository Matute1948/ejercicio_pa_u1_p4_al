package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
@Service("descuento")
public class ConDescuentoService implements DescuentoService {

    @Override
    public BigDecimal descuento(BigDecimal matriculasCaras) {
        // TODO Auto-generated method stub
        return matriculasCaras.subtract(matriculasCaras.multiply(new BigDecimal(0.09)));
    }
    
}
