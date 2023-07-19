package com.sati.model;
// Generated 19 juil. 2023, 00:48:45 by Hibernate Tools 4.3.6.Final

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
 * Marque generated by hbm2java
 */
@Entity
@Table(name = "marque", catalog = "ismistock_bd")
public class Marque implements java.io.Serializable {

	private Integer idMarque;
	private String codeMarque;
	private String libelleMarque;
	private Set<Materiel> materiels = new HashSet<Materiel>(0);

	public Marque() {
	}

	public Marque(String codeMarque, String libelleMarque, Set<Materiel> materiels) {
		this.codeMarque = codeMarque;
		this.libelleMarque = libelleMarque;
		this.materiels = materiels;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_MARQUE", unique = true, nullable = false)
	public Integer getIdMarque() {
		return this.idMarque;
	}

	public void setIdMarque(Integer idMarque) {
		this.idMarque = idMarque;
	}

	@Column(name = "CODE_MARQUE", length = 10)
	public String getCodeMarque() {
		return this.codeMarque;
	}

	public void setCodeMarque(String codeMarque) {
		this.codeMarque = codeMarque;
	}

	@Column(name = "LIBELLE_MARQUE", length = 25)
	public String getLibelleMarque() {
		return this.libelleMarque;
	}

	public void setLibelleMarque(String libelleMarque) {
		this.libelleMarque = libelleMarque;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "marque")
	public Set<Materiel> getMateriels() {
		return this.materiels;
	}

	public void setMateriels(Set<Materiel> materiels) {
		this.materiels = materiels;
	}

}
