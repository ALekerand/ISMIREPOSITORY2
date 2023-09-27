package com.sati.model;
// Generated 25 sept. 2023, 20:35:19 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Caracteristique generated by hbm2java
 */
@Entity
@Table(name = "caracteristique", catalog = "ismistock_bd")
public class Caracteristique implements java.io.Serializable {

	private Integer idCaracteristique;
	private String codeCaracteristique;
	private String libCaracteristique;
	private String descriptionCaracteristique;
	private Set<Valeur> valeurs = new HashSet<Valeur>(0);

	public Caracteristique() {
	}

	public Caracteristique(String codeCaracteristique, String libCaracteristique, String descriptionCaracteristique,
			Set<Valeur> valeurs) {
		this.codeCaracteristique = codeCaracteristique;
		this.libCaracteristique = libCaracteristique;
		this.descriptionCaracteristique = descriptionCaracteristique;
		this.valeurs = valeurs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_CARACTERISTIQUE", unique = true, nullable = false)
	public Integer getIdCaracteristique() {
		return this.idCaracteristique;
	}

	public void setIdCaracteristique(Integer idCaracteristique) {
		this.idCaracteristique = idCaracteristique;
	}

	@Column(name = "CODE_CARACTERISTIQUE", length = 10)
	public String getCodeCaracteristique() {
		return this.codeCaracteristique;
	}

	public void setCodeCaracteristique(String codeCaracteristique) {
		this.codeCaracteristique = codeCaracteristique;
	}

	@Column(name = "LIB_CARACTERISTIQUE", length = 50)
	public String getLibCaracteristique() {
		return this.libCaracteristique;
	}

	public void setLibCaracteristique(String libCaracteristique) {
		this.libCaracteristique = libCaracteristique;
	}

	@Column(name = "DESCRIPTION_CARACTERISTIQUE", length = 65535)
	public String getDescriptionCaracteristique() {
		return this.descriptionCaracteristique;
	}

	public void setDescriptionCaracteristique(String descriptionCaracteristique) {
		this.descriptionCaracteristique = descriptionCaracteristique;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caracteristique")
	public Set<Valeur> getValeurs() {
		return this.valeurs;
	}

	public void setValeurs(Set<Valeur> valeurs) {
		this.valeurs = valeurs;
	}

}
