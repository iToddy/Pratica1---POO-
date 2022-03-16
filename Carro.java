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
	String endereço;
	
	public Cliente (String nomeCompleto, String cpf, String contato, byte id, String endereço) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.contato = contato;
		this.id = id;
		this.endereço = endereço;		
	}
}

public class Transação {
	boolean tipo;
	int idTransacao;
	float valor;
	String data;
	
	public Transação(boolean tipo, int idTransacaoo, float valor, String data){
		this.tipo = tipo;
		this.idTransacao = idTransacao;
		this.valor = valor;
		this.data = data;
	}
}

