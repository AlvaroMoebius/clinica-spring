package io.moebius.clinica.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.moebius.clinica.servicios.VeterinarioServicio;

@RequestMapping("/veterinarios")
@Controller
public class VeterinarioControlador {
	
	private final VeterinarioServicio veterinarioServicio;
	
	public VeterinarioControlador(VeterinarioServicio veterinarioServicio) {
		this.veterinarioServicio = veterinarioServicio;
	}
	

	@RequestMapping({"", "/", "index", "index.html"})
	public String listarVeterinarios(Model model) {
		model.addAttribute("veterinarios", veterinarioServicio.findAll());
		
		return "veterinarios/index";
	}
}
