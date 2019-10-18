package controladores.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorAdministracion {

	@RequestMapping("admin")
	public String inicio() {
		return "admin/inicio";
	}
	
}
