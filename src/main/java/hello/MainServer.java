package hello;

import static spark.Spark.*;

//Guilherme: Rotas Json
//Rafael: Classes, atributos, variáveis


public class MainServer {
	
	final static Model model = new Model();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 8081;
        }
        port(port);

		//Servir conteudo html, css e javascript
		staticFileLocation("/static");

		inicializarHistorias();

		Controller controller = new Controller(model);
		
		controller.buscarHistoria();
		
		controller.buscarTitulo();
		
		controller.adicionarHistoria();
		
    }
    
    public static void inicializarHistorias(){
    	model.addHistoria(new Historia("dragonball", new Especificacao("akiratoriyama", "shonen", "01")));
    	model.addHistoria(new Historia("dragonball", new Especificacao("akiratoriyama", "shonen", "02")));
    	model.addHistoria(new Historia("bleach", new Especificacao("titekubo", "shonen", "01")));
    	model.addHistoria(new Historia("bleach", new Especificacao("titekubo", "shonen", "02")));
    }
}
