package pe.edu.idat.app_fragments_web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SeguridadController {
    @GetMapping ("/seguridad")
    public String seguridad(){
        return "seguridad";
    }
}
