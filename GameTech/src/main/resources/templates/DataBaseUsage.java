package com.example.HolaMundo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;



@Controller
public class DataBaseUsage implements CommandLineRunner {
	
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
	
	@Override
	public void run(String... args) throws Exception {
		
		/**
		reposotorioAlumno.save(new alumno("Beltran", 27));
		reposotorioAlumno.save(new alumno("Beltran", 27));
		reposotorioAlumno.save(new alumno("Cerezo", 30));
		
		repositorioAsignatura.save(new asignatura("Programacion", "Dificil"));
		repositorioAsignatura.save(new asignatura("BBDD", "Facil"));
		repositorioAsignatura.save(new asignatura("SSOO", "Dificil"));
		//--------------------------------------------------------------------------------------------------------------------------------------------------
		//Creo los hereoes
		Heroe garen = new Heroe("Garen", "Ideal para tanquear gracias a su alta recuperacion de vida", "Top", 900, 400, 500, 600, "Facil");
		Heroe alistar = new Heroe("Alistar", "Toro con una fuerza sobrenatural", "Support", 1000, 100, 700, 600, "Media");
		Heroe elise = new Heroe("Elise", "Mitad araña mitad humana, es venenosa", "Jungla", 600, 600, 350, 500, "Dificil");
		Heroe ashe = new Heroe("Ashe", "Arquera que con punteria exqusita, >---|>", "ADC", 400, 900, 250, 400, "Facil");
		Heroe nami = new Heroe("Nami", "Es una sirena que maneja el agua con destreza", "Support", 400, 600, 400, 500, "Media");
		Heroe akali = new Heroe("Akali", "Ninja escurridiza, cada de desaparecer en cualquer instante", "Mid", 600, 600, 500, 650, "Media");
		
		repositorioHeroe.save(garen);
		repositorioHeroe.save(alistar);
		repositorioHeroe.save(elise);
		repositorioHeroe.save(ashe);
		repositorioHeroe.save(nami);
		repositorioHeroe.save(akali);
		
		//Creo los Usuarios
		Usuario ruben = new Usuario("Rubew", "qwerty", "Spain", "EUW", "rubenlolgmail.com");
		Usuario david = new Usuario("Draky", "qwerty", "Spain", "EUW", "davidlolgmail.com");
		Usuario calderon = new Usuario("Dacal", "ytrewq", "Spain", "Korea", "dacalgmail.com");
		
		
		
		//Creo las Builds
		Build b1 = new Build("ADC", "Filo infinito", "Doran", "Botas berserker", "hoja del rey", "Sanguinaria", "Segador de ensencias");
		Build b2 = new Build("Support", "Hombreras de acero", "Chaleco de cadenas", "Botas de velocidad", "Cristal de rubi", "Gema avivadora", "Guardian");
		Build b3 = new Build("AP", "Doran", "Pocion de vida", "Botas de hechicero", "Baston del vacio", "Vara explosiva", "Sombrero mortal");
		Build b4 = new Build("Jungla", "Tabi de ninja", "Daga dentada", "Filoscuro", "Encantamiento guerrero", "Guardian", "Lente del oraculo");
		Build b5 = new Build("Tank", "Cuchilla negra", "Calibrador de sterak", "Rostro espiritual", "Malla de guardian", "Guardian", "Angel de la guardia");
		Build b6 = new Build("Healer", "Daga de hechicero", "Pocion de vida", "Redencion", "Warmong", "Medallon de solari", "Botas jonias");
		
		
		
		//Me creo una lista de Buils y añado las buids anterior a la lista
		List<Build> listaGuias = new ArrayList<>();
		listaGuias.add(b1);
		listaGuias.add(b2);
		listaGuias.add(b3);
	

		repositorioUsuario.save(ruben);
		repositorioUsuario.save(david);
		repositorioUsuario.save(calderon);
		
		//Las guardo/inserto las Build en la BBDD con su correspondiente repositorio
		repositorioBuild.save(b1);
		repositorioBuild.save(b2); 
		repositorioBuild.save(b3);
		repositorioBuild.save(b4);
		repositorioBuild.save(b5);
		repositorioBuild.save(b6);
		
		
		
		//le paso la lista con las Buils de cada usuario
		ruben.setBuilds(listaGuias);


		//Las guardo/inserto los Usuarios en la BBDD con su correspondiente repositorio
		repositorioUsuario.save(ruben);
		//repositorioUsuario.save(david);
		//repositorioUsuario.save(calderon);
		
		//Me creo el Ranking y añado los usuarios a lista de usuarios.
		Ranking ranking = new Ranking();
		ranking.addUsuairo(ruben);
		ranking.addUsuairo(david);
		ranking.addUsuairo(calderon);
		
		//Inserto el ranking en la BD
		repositorioRanking.save(ranking);
		
		Liga liga1 = new Liga("Cazadores de Zyra");
		liga1.addUsuarioLiga(ruben);
		liga1.addUsuarioLiga(david);
		liga1.addUsuarioLiga(calderon);
		
		repositorioLiga.save(liga1);
		
		*/
		
		//Usuario pepe = new Usuario("Pepe", "qwerty", "Spain", "EUW", "pepelolgmail.com");
		//repositorioUsuario.save(pepe);
		
		List<alumno> alumnos = reposotorioAlumno.findAll();
		System.out.println("Alumnos encontrados con findAll:");
		System.out.println("---------------------------------");
		System.out.println(alumnos);
		System.out.println("");
		
		List<alumno> Beltran = reposotorioAlumno.findByNombre("Beltran");
		System.out.println("Alumnos encontrados con Beltran:");
		System.out.println("---------------------------------");
		for(alumno b : Beltran) { 
			System.out.println(b);
		}
		
		System.out.println("");
		List<asignatura> dificultad = repositorioAsignatura.findByDificultad("Dificil");
		System.out.println("Asignaturas con dificultad Dificil:");
		System.out.println("-----------------------------------");
		for(asignatura d : dificultad) {
			System.out.println(d);
		}
		
		
		System.out.println("");
		List<Heroe> heroe = repositorioHeroe.findByPosicion("ADC");
		System.out.println("Hereoes ADCs:");
		System.out.println("-----------------------------------");
		for(Heroe d : heroe) {
			System.out.println(d.getNombre());
		}
		
		List<Usuario> usu = repositorioUsuario.findAll();
		System.out.println("Usuario");
		System.out.println("-----------------------------------");
		for(Usuario lista : usu) { 
			System.out.println(lista.getAlias());
		}
		
		List<Usuario> usu1 = repositorioUsuario.findByPaisOrderByEloDesc("Spain");
		System.out.println("\nRANKING\nUsuario      ELO");
		System.out.println("-----------------------------------");
		for(Usuario lista : usu1) { 
			System.out.print(lista.getAlias()+"       [");
			System.out.println(lista.getElo()+"]");
		}
		
		/**
		Liga l = repositorioLiga.findByNombreLiga("Cazadores de Zyra");
		System.out.println("USUARIOS LIGA: "+l.getNombreLiga());
		List <Usuario> lis = l.getUsuraios();
		System.out.println("-----------------------------------");
		for (Usuario u : lis) {
			System.out.println(u.getAlias());
		}*/
		
	}
	

	
	@GetMapping("/felicidades")
	public String pagheroe(Model model) {
		model.addAttribute("name", repositorioHeroe.findAll());
		return "felicidades";
		
	}
}
