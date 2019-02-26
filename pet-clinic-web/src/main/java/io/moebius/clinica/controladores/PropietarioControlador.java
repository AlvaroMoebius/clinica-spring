package io.moebius.clinica.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.moebius.clinica.servicios.PropietarioServicio;

@RequestMapping("/propietarios")
@Controller
public class PropietarioControlador {

	private final PropietarioServicio propietarioServicio;
	
	public PropietarioControlador(PropietarioServicio propietarioServicio) {
		this.propietarioServicio = propietarioServicio;
	}
	
	@RequestMapping({"", "/", "/index", "index.html"})
	public String listarPropietarios(Model model) {
		model.addAttribute("propietarios", propietarioServicio.findAll());
		
		return "propietarios/index";
	}
}
