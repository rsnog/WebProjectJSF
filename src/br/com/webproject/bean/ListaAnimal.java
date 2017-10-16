package br.com.webproject.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.webproject.domain.Animal;

@ManagedBean
@SessionScoped
public class ListaAnimal {
	private List<Animal> listaAnimal = new ArrayList<>();
	private Animal objAnimal = new Animal();

	public Animal getObjAnimal() {
		if (objAnimal == null) {
			objAnimal = new Animal();
		}
		return objAnimal;
	}

	public void setObjAnimal(Animal objAnimal) {
		this.objAnimal = objAnimal;
	}

	public List<Animal> getListaAnimal() {
		return listaAnimal;
	}

	public void setListaAnimal(List<Animal> listaAnimal) {
		this.listaAnimal = listaAnimal;
	}

	public void voltar() {
		objAnimal = null;
	}

	public void cadastrar() {
		System.out.println("Cadastar um animal nome: " + objAnimal.getNome());
		System.out.println("Cadastar um animal raça: " + objAnimal.getRaca());
		System.out.println(listaAnimal);
		System.out.println(objAnimal);
	}

	public void adicionar() {
		System.out.println(listaAnimal);
		listaAnimal.add(objAnimal);
		System.out.println(listaAnimal);
		objAnimal = new Animal();
	}
	
	public void limparLista() {
		listaAnimal = new ArrayList<>();
	}
}
