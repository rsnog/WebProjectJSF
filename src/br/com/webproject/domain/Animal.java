package br.com.webproject.domain;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Animal {

	private String nome;
	private String raca;
	private String sexo;
	private int idade;
	private Animal animal;

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

	public Animal getAnimal() {
		if(animal == null) {
			animal = new Animal();
		}
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void cadastrar() {
		System.out.println("Cadastar um animal: " + nome);
	}

	public void voltar() {
		animal = null;
	}

}
