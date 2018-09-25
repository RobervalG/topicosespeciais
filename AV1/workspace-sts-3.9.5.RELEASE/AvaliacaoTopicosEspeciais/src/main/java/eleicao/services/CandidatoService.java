package eleicao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import elecao.repositorios.CandidatoRepository;
import eleicao.domain.Candidato;

@Service
public interface CandidatoService {

	@Autowired
	private CandidatoRepository repo;
	
	public Candidato buscar(Integer id) {
		Optional<Candidato> objeto = repofindById(id);
		return objeto.orElse(null);
	}
}
