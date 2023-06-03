package com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Vehiculo;
import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.repository.modelo.Propietario;
import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.service.MatriculaService;
import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.service.PropietarioService;
import com.ejercicio_pa_u1_p4_al.ejercicio_pa_u1_p4_al.service.VehiculoService;

@SpringBootApplication
public class EjercicioPaU1P4AlApplication implements CommandLineRunner{

	@Autowired
	private MatriculaService matriculaService;
	@Autowired
	private PropietarioService propietarioService;
	@Autowired
	private VehiculoService vehiculoService;
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Propietario prop = new Propietario();

		prop.setApellido("lug");
		prop.setNombre("Fel");
		prop.setFechaNacmiento(LocalDate.now());
		prop.setIdentificacion("123");
		this.propietarioService.ingresar(prop);

		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("che");
		vehiculo.setModelo("hh");
		vehiculo.setPlaca("ABC");
		vehiculo.setPrecio(new BigDecimal(30000));
		vehiculo.setTipo("manual");
		this.vehiculoService.ingresar(vehiculo);
		vehiculo.setMarca("ni");
		vehiculo.setModelo("jj");
		this.vehiculoService.actualizar(vehiculo);

		this.matriculaService.generarMatricula(prop.getIdentificacion(), vehiculo.getPlaca());

		System.out.println(this.matriculaService.buscarPorPropietario(prop.getIdentificacion()));
		
		

		
	}

	

}
