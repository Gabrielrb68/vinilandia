package controle;

import java.util.ArrayList;

import modelo.Disco;

public class DiscoControl {

	private static ArrayList<Disco> tabelaDisco;
	private static DiscoControl instancia;

	public static DiscoControl getInstancia() {

		if (instancia == null) {
			instancia = new DiscoControl();
			tabelaDisco = new ArrayList<>();

			// Definir discos aqui

			// 1 disco
			Disco d = new Disco();
			d.setAutor("Roberto Carlos");
			d.setComentar(null);
			tabelaDisco.add(d);

			// 2 disco
			Disco d2 = new Disco();
			d2.setAutor("Roberto Justos");
			d2.setComentar(null);
			tabelaDisco.add(d2);

			Disco d3 = new Disco();
			d3.setAutor("Roberta Miranda");
			d3.setComentar(null);
			tabelaDisco.add(d3);
			
			
			Disco d4 = new Disco();
			d4.setAutor("Edinaldo Pereira");
			d4.setComentar(null);
			tabelaDisco.add(d4);
			// hardcoded (codigo fixo)

		}

		return instancia;
	}

	private DiscoControl() {
	}

	public ArrayList<Disco> listaDiscos() {
		return tabelaDisco;
	}

}
