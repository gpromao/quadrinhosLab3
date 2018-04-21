package hello;

//Guilherme: Rotas Json
//Rafael: Classes, atributos, variáveis

public class Historia {

	private String titulo;
	private Especificacao esp;
	
	
	public Historia(String titulo, Especificacao esp){
		this.titulo = titulo;
		this.esp = esp;
		
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public Especificacao getEsp(){
		return esp;
	}
	
}
