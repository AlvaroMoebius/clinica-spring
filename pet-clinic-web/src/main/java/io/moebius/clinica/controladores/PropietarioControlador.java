package io.moebius.clinica.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/propietarios")
@Controller
public class PropietarioControlador {

	@RequestMapping({"", "/", "/index", "index.html"})
	public String listarPropietarios() {
		return "propietarios/index";
	}
}
