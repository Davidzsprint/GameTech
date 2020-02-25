package com.example.HolaMundo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class controladores implements CommandLineRunner {
	
	@Autowired
	private AlumnoRepository reposotorioAlumno;
	
	@Autowired
	private AsignaturaRepository repositorioAsignatura;
	
	@Autowired
	private HeroeRepository repositorioHeroe;
	
	@Autowired
	private UsuarioRepository repositorioUsuario;
	
	@Autowired
	private BuildRepository repositorioBuild;
	
	@Autowired
	private RankingRepository repositorioRanking;
	
	@Autowired
	private LigaRepository repositorioLiga;
	
	//Ok
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	//Ok
	@GetMapping("/registroGeneral")
	public String registroGeneral() {
		return "registroGeneral";
	}
	
	//Ok
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	//Ok
	@GetMapping("/quienessomos")
	public String quienessomos() {
		return "quienessomos";
	}
	
	//Ok
	@GetMapping("/consultarHeroe")
	public String consultarHeroe() {
		return "consultarHeroe";
	}
	
	//OK
	@GetMapping("/registroUsuario")
	public String registroUsuario() {
		return "registroUsuario";
	}
	
	
	
	//---------------------------------------------------------------------------------------------------
	//                   REGISTROS
	//---------------------------------------------------------------------------------------------------
	
	
	@RequestMapping(value = "/nuevoUsuario")
	public String registroUsuario(@RequestParam String alias,@RequestParam String contrasena, @RequestParam String pais, @RequestParam String servidor, @RequestParam String email) {
		
		//Creacion de Build vacia
		if(repositorioBuild.findByNombreBuild("sinBuild") == null) {
			repositorioBuild.save(new Build("Vacio", "vacio", "vacio", "vacio", "vacio", "vacio", "vacio"));
		}
		
		//Usuario toto = new Usuario("Toto", "qwerty", "Spain", "EUW", "totololgmail.com");
		//repositorioUsuario.save(toto);
		
		
		//Creacion del Usuario
		List<Usuario> vacio = repositorioUsuario.findByEmail("");
		boolean encontrado = false;
		
		for(Usuario u: vacio) 
		{		
			//Si el correo ya existe entonces no creo el usuario
			if(repositorioUsuario.findByEmail(email).equals(u)) {	
				encontrado = true; 
			}	
		}
		
		if(encontrado == false) {
				
			Usuario nuevoUsuario = new Usuario(alias, contrasena, pais, servidor, email);
			repositorioUsuario.save(nuevoUsuario);
			
			return ("login");
		}
		
		return ("registroUsuario");
	}
	
	
	
	
	
	@GetMapping("/hello")
	public String despedida(Model model) {
		
		model.addAttribute("name", reposotorioAlumno.findAll());
		return "hello1";
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	/**
	@GetMapping("/hello")
	public String despedida(Model model) {
		model.addAttribute("name", "Gilipollas");
		return "hello";
	}
	
	@GetMapping("/felicidades")
	public String felicitar(Model model) {
		model.addAttribute("nombre", "Rubew");
		return "felicidades";
	}
	
	*/

}
