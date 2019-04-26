package java.ar.edu.unlam;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pais {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPais;
	
	private String nombre;
	private Long habitantes;
	private String idioma;
	private String capital;
	@ManyToOne
	@JoinColumn(name="idContinente")
	private Continente continente;
	@OneToMany(mappedBy="Ciudad",cascade=CascadeType.ALL)
	private List<Ciudad> ciudades=new ArrayList<Ciudad>();
	
	
	public Pais(Long idPais, String nombre, Long habitantes, String idioma,
			String capital, Continente continente) {
		super();
		this.idPais = idPais;
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.idioma = idioma;
		this.capital = capital;
		this.continente = continente;
	}
	public Pais() {
		super();
		
	}
	public Long getIdPais() {
		return idPais;
	}

	public void setIdPais(Long idPais) {
		this.idPais = idPais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(Long habitantes) {
		this.habitantes = habitantes;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public Continente getContinente() {
		return continente;
	}

	public void setContinente(Continente continente) {
		this.continente = continente;
	}

	
	
}
