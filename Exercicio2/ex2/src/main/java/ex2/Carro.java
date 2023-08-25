package ex2;

public class Carro {
	private int Id;
	private String marca;
	private String modelo;
	private int ano;
	private String pu;
	
	public Carro() {
		this.Id = -1;
		this.marca = "";
		this.modelo = "";
		this.ano = '*';
		this.pu = "";
	}
	
	public Carro(int Id, String marca, String modelo, int ano, String pu) {
		this.Id = Id;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.pu = pu;
	}

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getmarca() {
		return marca;
	}

	public void setmarca(String marca) {
		this.marca = marca;
	}

	public String getmodelo() {
		return modelo;
	}

	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}

	public int getano() {
		return ano;
	}

	public void setano(int ano) {
		this.ano = ano;
	}
	public String getpu() {
		return pu;
	}

	public void setpu(String pu) {
		this.pu = pu;
	}

	@Override
	public String toString() {
		return "Carro [Id=" + Id + ", Marca=" + marca + ", Modelo=" + modelo + ", Ano=" + ano + ", P.U.=" + pu + "]";
	}	
}