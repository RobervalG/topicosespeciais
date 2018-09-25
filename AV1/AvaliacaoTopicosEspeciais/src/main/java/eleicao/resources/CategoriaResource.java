package eleicao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eleicao.services.CandidatoService;

@RestController
@RequestMapping("/Condidato")
public class CategoriaResource {
	@Autowired
	private CandidatoService service;
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public 

}
