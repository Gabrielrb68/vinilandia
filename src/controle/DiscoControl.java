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
			d.setAutor(null);
			d.setComentar(null);
			tabelaDisco.add(d);

			// 2 disco
			Disco d2 = new Disco();
			d.setAutor(null);
			d.setComentar(null);
			tabelaDisco.add(d);

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
