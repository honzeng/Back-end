package co.com.ias.AvesAdmin.AvesAdmin.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tont_aves_pais")
public class AvesPais implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	private Paises Paises;
	
	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	private Aves Aves;	



}
