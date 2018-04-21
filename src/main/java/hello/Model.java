package hello;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<Historia> historias = new LinkedList<Historia>();

	
	public void addHistoria(Historia historia){
		historias.add(historia);
	}
	
	public Historia buscarTitulo(String titulo){
		for(Historia historia:historias){
			if(historia.getTitulo().equals(titulo)) return historia;
		}
		
		return null;
	}
	
	
	public List<Historia> buscarEspecificacao(Especificacao esp){
		List<Historia> historiasEncontradas = new LinkedList<Historia>();
		
		for(Historia historia:historias){
			 if(esp.comparar(historia.getEsp())) historiasEncontradas.add(historia);
		}
		
		return historiasEncontradas;
		
	}
	
	
	public List<Historia> getHistorias(){
		return historias;
	}

}
