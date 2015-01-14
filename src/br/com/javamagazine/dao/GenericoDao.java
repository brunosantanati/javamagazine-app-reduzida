package br.com.javamagazine.dao;

import java.util.List;

public interface GenericoDao <T, K> {

	void inserir(T entidade);	

	void remover(T entidade);

	void atualizar(T entidade);
	
	T pesquisarPorID(K id);
	
	List<T> listarTodos();

}