package modelo;

public class Disco {
	
	private String nome;
	private String genero;
	private String descrição;
	private Float preco;
	private String comentar;
	private Float avaliacao;
	private Integer discoId;
	private String autor;
	//private ? foto;

	public Integer getDiscoId() {
		return discoId;
	}
	public void setDicoId(Integer discoId) {
		this.discoId = discoId;
	}
	
	public String getAutor() {
		return autor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public Float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getComentar() {
		return comentar;
	}
	public void setComentar(String comentar) {
		this.comentar = comentar;
	}
	public Float getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(float avaliacao) {
		this.avaliacao = avaliacao;
	}
}
