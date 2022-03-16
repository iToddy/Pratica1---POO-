package Pratica1_OO;

public class Carro {

	String modelo;
	int ano;
	byte numPortas;
	String cor;
	
	public Carro (String modelo, int ano, byte numPortas, String cor) {
		this.modelo = modelo;
		this.ano = ano;
		this.numPortas = numPortas;
		this.cor = cor;
	}
}


public class Cliente {
	String nomeCompleto;
	String cpf;
	String contato;
	byte id;
	String endere�o;
	
	public Cliente (String nomeCompleto, String cpf, String contato, byte id, String endere�o) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.contato = contato;
		this.id = id;
		this.endere�o = endere�o;		
	}
}

public class Transa��o {
	boolean tipo;
	int idTransacao;
	float valor;
	String data;
	
	public Transa��o(boolean tipo, int idTransacaoo, float valor, String data){
		this.tipo = tipo;
		this.idTransacao = idTransacao;
		this.valor = valor;
		this.data = data;
	}
}

