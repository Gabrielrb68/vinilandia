package modelo;

import java.time.LocalDate;

public class Usuario {
	
	public String nome;
	public Long cpf;
	public String email;
	public String telefone;
	public LocalDate datNascimento;
	public String genero;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
	
	public LocalDate getNascimento() {
		return datNascimento;
	}
	
	public void setNascimento(String nome) {
		this.datNascimento = datNascimento;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String nome) {
		this.genero = genero;
	}
}
