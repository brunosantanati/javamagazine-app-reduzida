package br.com.javamagazine.dao;

import br.com.javamagazine.entidades.Emprestimo;

public interface EmprestimoDao {
	void inserir(Emprestimo emprestimo);
	
	void atualizar(Emprestimo emprestimo);
}
