package hello;

public class Especificacao {

	
	private String nomeAutor;
	private String genero;
	private String pagina;
	
	
	public Especificacao(String nomeAutor, String genero, String pagina){
		this.nomeAutor = nomeAutor;
		this.genero = genero;
		this.pagina = pagina;
	}
	
	public String getNomeAutor(){
		return nomeAutor;
	}
	
	public String getGenero(){
		return genero;
	}
	
	public String getPagina(){
		return pagina;
	}
	
	public boolean comparar(Especificacao esp){
		if(nomeAutor.equals(esp.nomeAutor) && genero.equals(esp.genero) && pagina.equals(esp.pagina)){
			return true;
		} else {
			return false;
		}
	}
	
}
