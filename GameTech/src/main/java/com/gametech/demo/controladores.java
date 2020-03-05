package com.example.HolaMundo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.authenticator.SpnegoAuthenticator.AuthenticateAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan(basePackages = { "com.example.HolaMundo" })
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

	@RequestMapping("/index")
	public String inicio() {
		return "index";
	}

	@RequestMapping("/realizarconsultas")
	public String realizarconsultas() {
		return "realizarconsultas";
	}
	
	@RequestMapping("/areaprivada")
	public String areaprivada() {
		return "areaprivada";
	}
	
	
	@RequestMapping("/registrarusuario")
	public String registrarUsuario() {
		return "registrousuario";
	}
	
	@RequestMapping("/areagestionusuario")
	public String areagestionUsuario() {
		return "areagestionusuario";
	}
	
	@RequestMapping("/registrarbuild")
	public String registrarBuild() {
		return "registrarbuild";
	}
	
	@RequestMapping("/registrarheroe")
	public String registrarHeroe() {
		return "registrarHeroe";
	}
	
	@RequestMapping("/informacionusuario")
	public String informacionUsuario() {
		return "informacionusuario";
	}
	
	// Buscar por Usuario

	@GetMapping("/consultarusuario/alias")
	public String verUsuario(Model model, @RequestParam String alias) {

		// Comprobamos si existe o no un Usuario registrado con ese "alias".
		Usuario usuario = repositorioUsuario.findByAlias(alias);

		// Si existe, mostramos la información.
		if (usuario != null) {

			model.addAttribute("usuario", usuario);

			return "consultausuario";
		} else {
			// Si no existe notifica el error al usuario.
			return "errorusuarionoexiste";
		}
	}

	// BUSCAR POR NOMBRE HEROE
	@GetMapping("/consultarheroe/nombre")
	public String verHeroe(Model model, @RequestParam String nombre) {

		// Comprobamos si existe o no un Heroe registrado con ese "nombre".
		Heroe heroe = repositorioHeroe.findByNombre(nombre);

		// Si existe, mostramos la información.
		if (heroe != null) {

			model.addAttribute("heroe", heroe);

			return "consultaheroe";

		} else {
			// Si no existe notifica el error al usuario.
			return "errorusuarionoexiste";
		}
	}

	// BUSCAR HEROE POR DIFICULTAD
	@GetMapping("/consultardificultadheroe/dificultad")
	public String verHeroeDificultad(Model model, @RequestParam String dificultad) {

		// Comprobamos si existe o no un Heroe registrado con esa "dificultad".
		List<Heroe> existe = repositorioHeroe.findByDificultad(dificultad);

		if (existe.isEmpty()) {

			// Si no existe notifica el error al usuario.
			return "errorusuarionoexiste";

		} else {

			List<Heroe> heroe = repositorioHeroe.findByDificultad(dificultad);

			model.addAttribute("heroe", heroe);

			return "consultadificultadheroe";
		}
	}

	// BUSCAR POR NOMBRE BUILD
	@GetMapping("/consultarbuild/nombreBuild")
	public String verBuild(Model model, @RequestParam String nombreBuild) {

		// Comprobamos
		Build build = repositorioBuild.findByNombreBuild(nombreBuild);

		// Si existe, mostramos la información.
		if (build != null) {

			model.addAttribute("build", build);

			return "consultabuild";

		} else {
			// Si no existe notifica el error al usuario.
			return "errorusuarionoexiste";
		}
	}

	// Buscar USUARIO EN RANKING
	@GetMapping("/consultarranking/pais")
	public String verRanking(Model model, @RequestParam String pais) {

		// Comprobamos si existe o no un Usuario registrado con ese "alias".
		List<Usuario> existe = repositorioUsuario.findByPais(pais);
		

		// Si existe, mostramos la información.
		if (existe != null) {
			
			List<Usuario> usuario = repositorioUsuario.findByPaisOrderByEloDesc(pais);
			model.addAttribute("usuario", usuario);

			return "consultaranking";
		} else {
			// Si no existe notifica el error al usuario.
			return "errorusuarionoexiste";
		}
	}
	
	
	// Buscar USUARIO POR PAIS
	@GetMapping("/consultarnacionalidadusuario/pais")
	public String verNacionalidad(Model model, @RequestParam String pais) {

		// Comprobamos si existe o no un Usuario registrado con ese "alias".
		List<Usuario> existe = repositorioUsuario.findByPais(pais);
		

		// Si existe, mostramos la información.
		if (existe != null) {
			
			List<Usuario> usuario = repositorioUsuario.findByPais(pais);
			model.addAttribute("usuario", usuario);

			return "consultanacionalidadusuario";
		} else {
			// Si no existe notifica el error al usuario.
			return "errorusuarionoexiste";
		}
	}
	
	

	// ---------------------------------------------------------------------------------------------------
	// REGISTRO    USUARIO Y   BUILDS
	// ---------------------------------------------------------------------------------------------------
	
	@PostMapping("/nuevoUsuario")
	public String registroUsuario(@RequestParam String alias, @RequestParam String contrasena, @RequestParam String pais, @RequestParam String servidor, @RequestParam String email) {
		
		//comprobamos si existe ese usuairio
		Usuario existe = repositorioUsuario.findByAlias(alias);
		
		//Asigno una liga al usuario.
		String [] nliga = {"Bronce",  "Plata", "Oro", "Diamante"};
		int alatorio = (int) (Math.random()*(0-4+0)+4);
		
		Liga l = repositorioLiga.findByNombreLiga(nliga[alatorio]);
		System.out.println(l.toString());
		
		if(existe == null) {
			
			Usuario usuario = new Usuario(alias, contrasena, pais, servidor, email);
			usuario.setLiga(l);
			repositorioUsuario.save(usuario);
			
			l.addUsuarioLiga(usuario);
			return "areaprivada";
		}
		else 
		{
			return "errorregistro";
		}
	
	}
	
	@PostMapping("/nuevoBuild")
	public String registroBuild(@RequestParam String nombreBuild, @RequestParam String objeto1, @RequestParam String objeto2, @RequestParam String objeto3, @RequestParam String objeto4, @RequestParam String objeto5, @RequestParam String objeto6) {
		
		//comprobamos si existe esa build
		Build existe = repositorioBuild.findByNombreBuild(nombreBuild);
		
		if(existe == null) {
			
			Build build = new Build(nombreBuild, objeto1, objeto2, objeto3, objeto4, objeto5, objeto6);
			repositorioBuild.save(build);
			
			return "areagestionusuario";
		}
		else 
		{
			return "errorregistrobuild";
		}
	}
	
	@PostMapping("/nuevoHeroe")
	public String registroHeroe(@RequestParam String nombre, @RequestParam String descripcion, @RequestParam String posicion, @RequestParam int vida, @RequestParam int ataque, @RequestParam int defensa, @RequestParam int mana, @RequestParam String dificultad) {
		
		Heroe existe = repositorioHeroe.findByNombre(nombre);
		
		
		if(existe == null) {
			
			Heroe heroe = new Heroe(nombre, descripcion, posicion, vida, ataque, defensa, mana, dificultad);
			repositorioHeroe.save(heroe);
			
			return "areagestionusuario";
		}
		else {
			
			
			return "errorregistrarheroe";
		}
	}
	
	@RequestMapping(value = "/mostrarHeroe")
	public String registroUsuario(@RequestParam String nombre) {
		return "";

	}

	
	//PARA SIGUENTE FASE	
	@RequestMapping("/login")
	public String loginUsuario(Model model, @RequestParam String alias, @RequestParam String contrasena,
			HttpSession sesision) {

		Usuario usu = repositorioUsuario.findByAlias(alias);
		Usuario usu2 = repositorioUsuario.findByContrasena(contrasena);

		// Comprobmaos que el alias y la contaseña no son Null
		if (!(usu.getAlias() == null)) {
			if (usu.getContrasena().equals(contrasena)) {

				System.out.println("Usuario logueado correcamente!");

				return ("index");

			}
		}
		// Si no existe que se registre
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
	 * @GetMapping("/hello") public String despedida(Model model) {
	 * model.addAttribute("name", "Gilipollas"); return "hello"; }
	 * 
	 * @GetMapping("/felicidades") public String felicitar(Model model) {
	 * model.addAttribute("nombre", "Rubew"); return "felicidades"; }
	 * 
	 */

}
