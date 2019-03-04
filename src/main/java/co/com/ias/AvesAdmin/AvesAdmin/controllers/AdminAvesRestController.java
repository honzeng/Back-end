package co.com.ias.AvesAdmin.AvesAdmin.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.ias.AvesAdmin.AvesAdmin.entities.Aves;
import co.com.ias.AvesAdmin.AvesAdmin.models.AvesModel;
import co.com.ias.AvesAdmin.AvesAdmin.repository.IAvesRepository;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class AdminAvesRestController {
	
	@Autowired
	private IAvesRepository avesrepository;
	
	@GetMapping("/listarAves")
	public List<Aves> listarAves() {

		return avesrepository.listar();
	}  
	
	
	@PostMapping("/listarAves")
	@Transactional
	public void registrarParqueo(@RequestBody Aves registrarAve) {
		 avesrepository.saveAndFlush(registrarAve);	
	}
	
	@PutMapping("/listarAves/{cdave}")
	public void actualizarAve(@RequestBody AvesModel registroave,@PathVariable String cdave) {		
			Aves AvesE = avesrepository.registroByCdave(registroave.getCdave());
			AvesE.setDsnombre_cientifico(registroave.getDsnombre_cientifico());
			AvesE.setDsnombre_comun(registroave.getDsnombre_comun());
			avesrepository.saveAndFlush(AvesE);
			
	}
	
	@DeleteMapping("/listarAves/{cdave}")
	@Transactional
	public void BorrarAves(@RequestBody Aves registrarAve) {
		 avesrepository.delete(registrarAve);	
	}
	
	}
