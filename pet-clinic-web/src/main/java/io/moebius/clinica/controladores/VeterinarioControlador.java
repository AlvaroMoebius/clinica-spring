package io.moebius.clinica.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/veterinarios")
@Controller
public class VeterinarioControlador {

	@RequestMapping({"", "/", "index", "index.html"})
	public String listarVeterinarios() {
		return "veterinarios/index";
	}
}
