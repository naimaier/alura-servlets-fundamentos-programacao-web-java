package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 0;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		empresa.setId(chaveSequencial++);
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		empresa2.setId(chaveSequencial++);
		
		lista.add(empresa);
		lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}
	
	public void removeEmpresa (int id) {
		
//		for (Empresa empresa : lista) {
//			if (empresa.getId() == id) {
//				lista.remove(empresa);
//			}
//		}
//		Não é possível remover um elemento de um Arraylist que estamos iterando
		
		Iterator<Empresa> iterator = lista.iterator();
		while (iterator.hasNext()) {
			Empresa empresa = iterator.next();
			
			if (empresa.getId() == id) {
				iterator.remove();
				// Não precisa passa o id pois o iterator já sabe onde está
			}
		}
	}
	
}
