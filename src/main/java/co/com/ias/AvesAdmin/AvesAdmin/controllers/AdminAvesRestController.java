package co.com.ias.AvesAdmin.AvesAdmin.controllers;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ias.AvesAdmin.AvesAdmin.entities.Aves;
import co.com.ias.AvesAdmin.AvesAdmin.models.AvesModel;
import co.com.ias.AvesAdmin.AvesAdmin.repository.IAvesRepository;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
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
	public ResponseEntity<Aves> actualizarAve(@RequestBody AvesModel registroave,@PathVariable String cdave) {		
			
	
			Aves AvesE = avesrepository.registroByCdave(registroave.getCdave());
			if (AvesE != null) {
			Aves UptAve = AvesE;
			UptAve.setDsnombre_cientifico(registroave.getDsnombre_cientifico());
			UptAve.setDsnombre_comun(registroave.getDsnombre_comun());
			return new ResponseEntity<>(avesrepository.save(UptAve), HttpStatus.OK);
			}
			else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
	}
		
	
	@DeleteMapping("/listarAves/{cdave}")
	@Transactional
	public ResponseEntity<String> borrarAve(@RequestBody Aves registrarAve,@PathVariable("cdave") String cdave) {
		 avesrepository.delete(registrarAve);	
		 return new ResponseEntity<>("La ave ha sido borrada!", HttpStatus.OK);
	}
	
	
	

 
	@DeleteMapping("/listarAves/delete")
	public ResponseEntity<String> borrarTodas() {
 
		avesrepository.deleteAll();
 
		return new ResponseEntity<>("Se borraron todas las aves!", HttpStatus.OK);
	}
	}
