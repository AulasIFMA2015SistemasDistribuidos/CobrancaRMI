package entidade;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Aluno implements Serializable {
	private String nome;
	private String matricula;
	private String endereco;
	private String cep;
	private int idade;
	private ArrayList<Mensalidade> mensalidadesemaberto;
	
	public Aluno(String nome, String matricula, String endereco, String cep, int idade) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.matricula = matricula;
		this.endereco = endereco;
		this.cep = cep;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public ArrayList<Mensalidade> getMensalidadesemaberto() {
		return mensalidadesemaberto;
	}

	public void setMensalidadesemaberto(ArrayList<Mensalidade> mensalidadesemaberto) {
		this.mensalidadesemaberto = mensalidadesemaberto;
	}
	
	
}
