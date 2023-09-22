package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Carro {
	private int id;
	private String marca;
	private float pu;
	private int ano;
	private String modelo;
	
	public Carro() {
		id = -1;
		marca = "";
		pu = 0.00F;
		ano = 0;
		modelo = "";
	}

	public Carro(int id, String marca, float pu, int ano, String modelo) {
		setid(id);
		setmarca(marca);
		setpu(pu);
		setano(ano);
		setmodelo(modelo);
	}		
	
	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	
	public String getmarca() {
		return marca;
	}

	public void setmarca(String marca) {
		this.marca = marca;
	}

	public float getpu() {
		return pu;
	}

	public void setpu(float pu) {
		this.pu= pu;
	}

	public int getano() {
		return ano;
	}
	
	public void setano(int ano) {
		this.ano = ano;
	}
	
	public String getmodelo() {
		return modelo;
	}

	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Método sobreposto da classe Object. É executado quando um objeto precisa
	 * ser exibido na forma de String.
	 */
	@Override
	public String toString() {
		return "Carro: Marca" + marca + "   Preço: R$" + pu+ "   Ano: " + ano + "   Modelo: " + dataValidade;
	}
	
	@Override
	public boolean equals(Object obj) {
		return (this.getid() == ((Carro) obj).getid());
	}	
}