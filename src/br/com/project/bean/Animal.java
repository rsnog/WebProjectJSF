package br.com.project.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Animal {

	private String nome;
	private String raca;
	private String sexo;
	private int idade;

	public String getNome() {
		return nome;	
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void cadastrar() {
		System.out.println("Cadastar um animal: " + nome);
	}

	public void dormir() {
		System.out.println("Dormir um animal: " + nome);
	}

}
