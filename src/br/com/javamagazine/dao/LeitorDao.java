package br.com.javamagazine.dao;

import java.util.List;

import br.com.javamagazine.entidades.Leitor;

public interface LeitorDao {
	
	Leitor pesquisarPorId(Integer id);

	List<Leitor> listarLeitores();
}