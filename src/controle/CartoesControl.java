package controle;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.Cartoes;

public class CartoesControl {

	private static ArrayList<Cartoes> tabelaCartoes;
	private static CartoesControl instancia;

	public static CartoesControl getinstancia() {
		
		if(instancia == null) {
			instancia = new CartoesControl();
			tabelaCartoes = new ArrayList<>();
			cadastraCartoes();
		}
		return instancia;
	}

	
	private static void cadastraCartoes() {
		//Cartao1
		Cartoes ct = new Cartoes();
		ct.setidCartao(1l);
		ct.setnomeDoCartao("Bruna Java");
		ct.setnumCartao(123456l);
		ct.setcodSeguranca(123);
		ct.setmesValidade(1);
		ct.setanoValidade(2026);
		tabelaCartoes.add(ct);
		
		//Cartao2
		Cartoes ct2 = new Cartoes();
		ct2.setidCartao(2l);
		ct2.setnomeDoCartao("Leonardo Unity");
		ct2.setnumCartao(654321l);
		ct2.setcodSeguranca(321);
		ct2.setmesValidade(2);
		ct2.setanoValidade(2027);
		tabelaCartoes.add(ct2);
		
		//Cartao3
		Cartoes ct3 = new Cartoes();
		ct3.setidCartao(3l);
		ct3.setnomeDoCartao("Watson Carbon");
		ct3.setnumCartao(246810l);
		ct3.setcodSeguranca(666);
		ct3.setmesValidade(3);
		ct3.setanoValidade(2028);
		tabelaCartoes.add(ct3);
		
		//Cartao4
		Cartoes ct4 = new Cartoes();
		ct4.setidCartao(4l);
		ct4.setnomeDoCartao("Daniel Roben");
		ct4.setnumCartao(792341l);
		ct4.setcodSeguranca(777);
		ct4.setmesValidade(4);
		ct4.setanoValidade(2029);
		tabelaCartoes.add(ct4);
		
		//Cartao5
		Cartoes ct5 = new Cartoes();
		ct5.setidCartao(5l);
		ct5.setnomeDoCartao("Bruno Alel");
		ct5.setnumCartao(239801l);
		ct5.setcodSeguranca(012);
		ct5.setmesValidade(5);
		ct5.setanoValidade(2030);
		tabelaCartoes.add(ct5);
		
		//Cartao6
		Cartoes ct6 = new Cartoes();
		ct6.setidCartao(6l);
		ct6.setnomeDoCartao("Luis Eduardo");
		ct6.setnumCartao(696969l);
		ct6.setcodSeguranca(169);
		ct6.setmesValidade(6);
		ct6.setanoValidade(2025);
		tabelaCartoes.add(ct6);
		
		//Cartao7
		Cartoes ct7 = new Cartoes();
		ct7.setidCartao(7l);
		ct7.setnomeDoCartao("Gabriel do Rosario");
		ct7.setnumCartao(688612l);
		ct7.setcodSeguranca(402);
		ct7.setmesValidade(7);
		ct7.setanoValidade(2027);
		tabelaCartoes.add(ct7);
		
		//Cartao8
		Cartoes ct8 = new Cartoes();
		ct8.setidCartao(8l);
		ct8.setnomeDoCartao("Bernardo Poggers");
		ct8.setnumCartao(310621l);
		ct8.setcodSeguranca(888);
		ct8.setmesValidade(8);
		ct8.setanoValidade(2023);
		tabelaCartoes.add(ct8);
	}
	public Cartoes verificarCartao(String nomeDoCartao, Long numCartao,Integer codSeguranca,Integer mesValidade, Integer anoValidade) {
	for (Cartoes ct : tabelaCartoes) {
		if (ct.getnomeDoCartao().equals(nomeDoCartao) && ct.getnumCartao().equals(numCartao) && ct.getcodSeguranca().equals(codSeguranca) && ct.getmesValidade().equals(mesValidade) && ct.getanoValidade().equals(anoValidade)) {
			return ct;
		}
	}
		return null;
	}


}
