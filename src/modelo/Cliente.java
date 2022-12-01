package modelo;

import java.time.LocalDate;

public class Cliente {

	private String nome;
	private String senha;
	private Long cpf;
	private String email;
	private String telefone;
	private LocalDate datNascimento;
	private String genero;
	private Long cep;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDatNascimento() {
		return datNascimento;
	}

	public void setDatNascimento(LocalDate datNascimento) {
		this.datNascimento = datNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Long getCep() {
		
		return cep;
	}
	
	public void setCep(Long cep) {
		this.cep = cep;
	}

}

