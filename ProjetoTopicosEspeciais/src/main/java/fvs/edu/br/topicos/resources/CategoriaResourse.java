package fvs.edu.br.topicos.resources;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fvs.edu.br.topicos.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResourse {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria cat1 = new Categoria(1, "Bombril");
		Categoria cat2 = new Categoria(2, "Detergente");
		
		List<Categoria> lista = new ArrayList <>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
				
	}

}
