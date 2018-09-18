package fvs.edu.br.topicos.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import fvs.edu.br.topicos.domain.Categoria;
import fvs.edu.br.topicos.repositories.categoriaRepository;

@Service
public class CategoriaService {
	
	public categoriaRepository repositorio;

	public Categoria buscar(integer id) {
		Optional<Categori\a> obj = repositorio.finBy(Id);
		
		return obj.orElse(null);

	}

}
