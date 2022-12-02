package controle;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.Disco;

public class DiscoControl {
	
	private static ArrayList<Disco> tabelaDisco;
	private static DiscoControl instancia;
	
	public boolean alterarDescricao(Disco d, Integer Discoid) {
		for (Disco disco : tabelaDisco) {
			if (disco.getDiscoid() == Discoid) {
				disco.setDescrição(d.getDescrição());
				return true;
			}
		}
		return false;
	}
	
	public boolean alterarNome(Disco d, Integer Discoid) {
		for (Disco disco : tabelaDisco) {
			if (disco.getDiscoid() == Discoid) {
				disco.setNome(d.getNome());
				return true;
			}
		}
		return false;
	}
	
	public boolean alterarGenero(Disco d, Integer Discoid) {
		for (Disco disco : tabelaDisco) {
			if (disco.getDiscoid() == Discoid) {
				disco.setGenero(d.getGenero());
				return true;
			}
		}
		return false;
	}
	
	public boolean alterarPreco(Disco d, Integer Discoid) {
		for (Disco disco : tabelaDisco) {
			if (disco.getDiscoid() == Discoid) {
				disco.setPreco(d.getPreco());
				return true;
			}
		}
		return false;
	}
	
	public boolean alterarComentar(Disco d, Integer Discoid) {
		for (Disco disco : tabelaDisco) {
			if (disco.getDiscoid() == Discoid) {
				disco.setComentar(d.getComentar());
				return true;
			}
		}
		return false;
	}

	public boolean alterarAvaliacao(Disco d, Integer Discoid) {
		for (Disco disco : tabelaDisco) {
			if (disco.getDiscoid() == Discoid) {
				disco.setAvaliacao(d.getAvaliacao());
				return true;
			}
		}
		return false;
	}

	public boolean alterarAutor(Disco d, Integer Discoid) {
		for (Disco disco : tabelaDisco) {
			if (disco.getDiscoid() == Discoid) {
				disco.setAutor(d.getAutor());
				return true;
			}
		}
		return false;
	}

	public ArrayList<Disco> listaDisco() {
		return this.tabelaDisco;
	}
}
