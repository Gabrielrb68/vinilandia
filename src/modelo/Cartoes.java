package modelo;

public class Cartoes {
	private Long idCartao;
	private String nomeDoCartao;
	private Long numCartao;
	private Integer codSeguranca;
	private Integer mesValidade;
	private Integer anoValidade;

	public Long getidCartao() {
		return idCartao;
	}
	
	public void setidCartao(Long idCartao) {
		this.idCartao = idCartao;
	}
	
	public String getnomeDoCartao() {
		
		return nomeDoCartao;
	}

	public void setnomeDoCartao(String nomeDoCartao) {
		
		this.nomeDoCartao = nomeDoCartao; 
	}
	
	public Long getnumCartao() {
		
		return numCartao;
	}

	public void setnumCartao(Long numCartao) {
		this.numCartao = numCartao;
	}
	
	public Integer getcodSeguranca() {
		
		return codSeguranca;
	}

	public void setcodSeguranca(Integer codSeguranca) {
		
		this.codSeguranca = codSeguranca;
	}
	
	public Integer getmesValidade() {
		
		return mesValidade;
	}
	
	public void setmesValidade(Integer mesValidade) {
		this.mesValidade = mesValidade;
	}

	public Integer getanoValidade() {
		return anoValidade;
	}
	
	public void setanoValidade(Integer anoValidade) {
		this.anoValidade = anoValidade;
	}
	
	
}
