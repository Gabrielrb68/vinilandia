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
			cadastraDiscos();
		}

		return instancia;
	}

	private static void cadastraDiscos() {
		// Definir discos aqui

		// 1 disco
		Disco d = new Disco();
		d.setId(1l);
		d.setAutor("Tim Maia");
		d.setNome("O Descubridor dos Sete Mares");
		d.setGenero("Soul");
		d.setDescrição("Tim Maia - 1983 - PolyGram");
		d.setPreco(79.90);
		d.setAvaliacao(0);
		tabelaDisco.add(d);

		// 2 disco
		Disco d2 = new Disco();
		d2.setId(2l);
		d2.setAutor("Toby Fox");
		d2.setNome("Undertale - The Musical");
		d2.setGenero("Eletrônico");
		d2.setDescrição("Alex Beckman - 2017");
		d2.setPreco(55.90);
		d2.setAvaliacao(0);
		tabelaDisco.add(d2);

		Disco d3 = new Disco();
		d3.setId(3l);
		d3.setAutor("Electric Light Orchestra");
		d3.setNome("Out of Blue");
		d3.setGenero("Rock");
		d3.setDescrição("Jeff Lynne - 1977 - Epic Legacy");
		d3.setPreco(49.90);
		d3.setAvaliacao(0);
		tabelaDisco.add(d3);

		Disco d4 = new Disco();
		d4.setId(4l);
		d4.setAutor("Ednaldo Pereira");
		d4.setNome("Ednaldo Pereira: Só as Melhores");
		d4.setGenero("Pop Rock");
		d4.setDescrição("Ednaldo Pereira - 2020");
		d4.setPreco(999.90);
		d4.setAvaliacao(9999);
		tabelaDisco.add(d4);

		Disco d5 = new Disco();
		d5.setId(5l);
		d5.setAutor("The Living Tombstone");
		d5.setNome("Five Nights at Freddy's Songs");
		d5.setGenero("Eletrônico");
		d5.setDescrição("TLT - 2014");
		d5.setPreco(120.50);
		d5.setAvaliacao(0);
		tabelaDisco.add(d5);

		Disco d6 = new Disco();
		d6.setId(6l);
		d6.setAutor("Michael Jackson");
		d6.setNome("Off The Wall");
		d6.setGenero("Pop Rock");
		d6.setDescrição("Michael Jackson - 1979 - Epic Records");
		d6.setPreco(99.90);
		d6.setAvaliacao(0);
		tabelaDisco.add(d6);

		Disco d7 = new Disco();
		d7.setId(7l);
		d7.setAutor("Metal Gear Solid 3");
		d7.setNome("Metal Gear Solid 3: Snake Eater Original Soundtrack");
		d7.setGenero("Rock");
		d7.setDescrição("Metal Gear Solid - 2004 - Phantom");
		d7.setPreco(29.90);
		d7.setAvaliacao(0);
		tabelaDisco.add(d7);

		Disco d8 = new Disco();
		d8.setId(8l);
		d8.setAutor("Mojang");
		d8.setNome("Minecraft Soundtrack");
		d8.setGenero("Indie");
		d8.setDescrição("C418 - 2009");
		d8.setPreco(999.90);
		d8.setAvaliacao(9999);
		tabelaDisco.add(d8);

		Disco d9 = new Disco();
		d9.setId(9l);
		d9.setAutor("JOJO");
		d9.setNome("JOJO Part 2 Soundtrack");
		d9.setGenero("Bizarre");
		d9.setDescrição("Noboru Yamane - 1993 - Apollon");
		d9.setPreco(99.90);
		d9.setAvaliacao(0);
		tabelaDisco.add(d9);

		Disco d10 = new Disco();
		d10.setId(10l);
		d10.setAutor("Spike Chunsoft");
		d10.setNome("Danganronpa Soundtrack");
		d10.setGenero("Eletrônico");
		d10.setDescrição("Masafumi Takada - 2011 - Sound Prestige Records");
		d10.setPreco(53.00);
		d10.setAvaliacao(0);
		tabelaDisco.add(d10);

	}

	private DiscoControl() {
	}

	public ArrayList<Disco> listaDiscos() {
		return tabelaDisco;
	}

}
