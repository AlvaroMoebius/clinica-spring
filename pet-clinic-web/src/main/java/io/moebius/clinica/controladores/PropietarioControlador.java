package io.moebius.clinica.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PropietarioControlador {

	@RequestMapping({"/propietarios", "/propietarios/index", "propietarios/index.html"})
	public String listarPropietarios() {
		return "propietarios/index";
	}
}
