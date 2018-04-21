package hello;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller {
	
	private Model model;
	
	
	public Controller(Model model){
		this.model = model;
	}
	
	public void buscarHistoria(){
		get("/historia/:autor/:genero/:pagina", (req, res) -> {
		
			Especificacao espec = new Especificacao(req.params(":autor"), req.params(":genero"), req.params(":pagina"));	
			List<Historia> historiasEncontradas = model.buscarEspecificacao(espec);	
			return new Gson().toJson(historiasEncontradas);
			
		});
	}
	
	public void buscarTitulo() {
		get("/historia2/:titulo", (req, res) -> {
			
			String titulo = req.params(":titulo");	
			
			Historia historiasEncontradas2 = model.buscarTitulo(titulo);
			return new Gson().toJson(historiasEncontradas2);
		});
	}
	
	public void adicionarHistoria() {

		get("/add/:titulo/:autor/:genero/:pagina", (req, res) -> {
			
			String titulo = req.params(":titulo");
			String autor = req.params(":autor");
			String genero = req.params(":genero");
			String pagina = req.params(":pagina");
			
			Historia nova = new Historia(titulo, new Especificacao(autor, genero, pagina));
			model.addHistoria(nova);
		
			return new Gson().toJson(nova);
		});
	}
	
	
	
	

}
