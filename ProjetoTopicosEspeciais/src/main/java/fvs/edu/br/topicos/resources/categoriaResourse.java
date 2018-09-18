package fvs.edu.br.topicos.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fvs.edu.br.topicos.domain.Categoria;
import fvs.edu.br.topicos.service.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class categoriaResourse {
	
	@Autowired
	private CategoriaService service;	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResposeEntity<?> listar(@PathVariable Integer id){
	Categoria obj = service.Buscat(Id);
	
		
		return ResponseEntity.ok(obj);
				
	}

}
