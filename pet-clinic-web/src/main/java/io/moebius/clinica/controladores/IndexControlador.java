package io.moebius.clinica.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControlador {
	
	@RequestMapping({"", "/", "index", "index.html"})
	public String index() {
		return "index";
	}
	
	
	@RequestMapping("/oups")
	public String manejadorOups() {
		
		return "noimplementado";
	}
}
