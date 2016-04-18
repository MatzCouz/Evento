package Entidades;

public class Pessoa {
	
	private String nome;
	private String end;
	private int CPF;
	private int RG;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public int getRG() {
		return RG;
	}
	public void setRG(int rG) {
		RG = rG;
	}
}
