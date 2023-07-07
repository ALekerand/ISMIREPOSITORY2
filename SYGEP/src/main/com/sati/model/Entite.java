package main.com.sati.model;
// Generated 7 juil. 2023, 13:21:20 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entite generated by hbm2java
 */
@Entity
@Table(name = "entite", catalog = "ismistock_bd")
public class Entite implements java.io.Serializable {

	private Integer idEntite;
	private String codeEntite;
	private String telephone;
	private String email;
	private Personne personne;
	private Service service;
	private Set<Demande> demandes = new HashSet<Demande>(0);

	public Entite() {
	}

	public Entite(String codeEntite, String telephone, String email, Personne personne, Service service,
			Set<Demande> demandes) {
		this.codeEntite = codeEntite;
		this.telephone = telephone;
		this.email = email;
		this.personne = personne;
		this.service = service;
		this.demandes = demandes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_ENTITE", unique = true, nullable = false)
	public Integer getIdEntite() {
		return this.idEntite;
	}

	public void setIdEntite(Integer idEntite) {
		this.idEntite = idEntite;
	}

	@Column(name = "CODE_ENTITE", length = 10)
	public String getCodeEntite() {
		return this.codeEntite;
	}

	public void setCodeEntite(String codeEntite) {
		this.codeEntite = codeEntite;
	}

	@Column(name = "TELEPHONE", length = 10)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "EMAIL", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "entite")
	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "entite")
	public Service getService() {
		return this.service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "entite")
	public Set<Demande> getDemandes() {
		return this.demandes;
	}

	public void setDemandes(Set<Demande> demandes) {
		this.demandes = demandes;
	}

}
