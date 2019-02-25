package io.moebius.clinica.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VeterinarioControlador {

	@RequestMapping({"/veterinarios", "veterinarios/index", "veterinarios/index.html"})
	public String listarVeterinarios() {
		return "veterinarios/index";
	}
}
