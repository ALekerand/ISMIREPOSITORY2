package com.sati.model;
// Generated 21 sept. 2023, 13:04:21 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Service generated by hbm2java
 */
@Entity
@Table(name = "service", catalog = "ismistock_bd")
public class Service implements java.io.Serializable {

	private int idEntite;
	private Entite entite;
	private String codeEntite;
	private String telephone;
	private String email;
	private String nomService;
	private Set<Parcours> parcourses = new HashSet<Parcours>(0);

	public Service() {
	}

	public Service(Entite entite) {
		this.entite = entite;
	}

	public Service(Entite entite, String codeEntite, String telephone, String email, String nomService,
			Set<Parcours> parcourses) {
		this.entite = entite;
		this.codeEntite = codeEntite;
		this.telephone = telephone;
		this.email = email;
		this.nomService = nomService;
		this.parcourses = parcourses;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "entite"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "ID_ENTITE", unique = true, nullable = false)
	public int getIdEntite() {
		return this.idEntite;
	}

	public void setIdEntite(int idEntite) {
		this.idEntite = idEntite;
	}

	@OneToOne(fetch = FetchType.EAGER)
	@PrimaryKeyJoinColumn
	public Entite getEntite() {
		return this.entite;
	}

	public void setEntite(Entite entite) {
		this.entite = entite;
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

	@Column(name = "NOM_SERVICE", length = 50)
	public String getNomService() {
		return this.nomService;
	}

	public void setNomService(String nomService) {
		this.nomService = nomService;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "service")
	public Set<Parcours> getParcourses() {
		return this.parcourses;
	}

	public void setParcourses(Set<Parcours> parcourses) {
		this.parcourses = parcourses;
	}

}
