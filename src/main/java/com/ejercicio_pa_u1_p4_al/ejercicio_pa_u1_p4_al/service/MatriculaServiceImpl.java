package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.MatriculaRepository;
import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.PropietarioRepository;
import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.VehiculoRepository;
import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Matricula;
import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Propietario;
import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements MatriculaService{

    @Autowired
    private PropietarioRepository propietarioRepository;
    @Autowired
    private VehiculoRepository vehiculoRepository;
    @Autowired
    private MatriculaRepository matriculaRepository;
    @Autowired
    @Qualifier("manual")
    private VehiculoTipoService vehiculoManualService;
    @Autowired
    @Qualifier("automatico")
    private VehiculoTipoService vehiculoAutomaticoService;
    @Autowired
    @Qualifier("descuento")
    private DescuentoService descuento;
    @Autowired
    @Qualifier("sindescuento")
    private DescuentoService sinDescuento;

    @Override
    public void ingresar(Matricula Matricula) {
        // TODO Auto-generated method stub
        this.matriculaRepository.insertar(Matricula);
    }

    @Override
    public Matricula buscarPorPropietario(String identificacionPropietario) {
        // TODO Auto-generated method stub
        return this.matriculaRepository.seleccionar(identificacionPropietario);
    }

    @Override
    public void generarMatricula(String identificacion, String placa) {
        // TODO Auto-generated method stub
        Propietario propietario = this.propietarioRepository.seleccionar(identificacion);
        Vehiculo vehiculo = this.vehiculoRepository.seleccionar(placa);

        BigDecimal precioMatricula;

        if(vehiculo.getTipo().equals("manual")){
            precioMatricula=this.vehiculoManualService.calcularMatriculaTipoVehiculo(vehiculo.getPrecio());
        }else{
            precioMatricula=this.vehiculoAutomaticoService.calcularMatriculaTipoVehiculo(vehiculo.getPrecio());
        }

        BigDecimal matriculaFinal;
        if(precioMatricula.compareTo(new BigDecimal(3000)) >0){
            matriculaFinal = this.descuento.descuento(precioMatricula);
        }else{
            matriculaFinal = this.sinDescuento.descuento(precioMatricula);
        }

        Matricula matricula = new Matricula();

        matricula.setPropietario(propietario);
        matricula.setVehiculo(vehiculo);
        matricula.setFechaMatricula(LocalDate.now());
        matricula.setValorMatricula(matriculaFinal);

        this.matriculaRepository.insertar(matricula);


    }

    
}
