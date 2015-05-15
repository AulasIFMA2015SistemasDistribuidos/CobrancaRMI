package entidade;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Mensalidade implements Serializable {
	private int numparcela;
	private int mes;
	private int ano;
	private boolean aberta;
	
	public Mensalidade(int numparcela, int mes, int ano, boolean aberta) {
		// TODO Auto-generated constructor stub
		this.numparcela = numparcela;
		this.mes = mes;
		this.ano = ano;
		this.aberta = aberta;
	}
	
	public int getNumparcela() {
		return numparcela;
	}
	public void setNumparcela(int numparcela) {
		this.numparcela = numparcela;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public boolean isAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
		
}
