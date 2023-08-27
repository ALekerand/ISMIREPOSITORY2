package com.sati.model;
// Generated 26 ao�t 2023, 22:26:06 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Nature generated by hbm2java
 */
@Entity
@Table(name = "nature", catalog = "ismistock_bd")
public class Nature implements java.io.Serializable {

	private Integer idNature;
	private Famille famille;
	private String codeNature;
	private String libNature;
	private String descriptionNature;
	private Set<Materiel> materiels = new HashSet<Materiel>(0);

	public Nature() {
	}

	public Nature(Famille famille) {
		this.famille = famille;
	}

	public Nature(Famille famille, String codeNature, String libNature, String descriptionNature,
			Set<Materiel> materiels) {
		this.famille = famille;
		this.codeNature = codeNature;
		this.libNature = libNature;
		this.descriptionNature = descriptionNature;
		this.materiels = materiels;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_NATURE", unique = true, nullable = false)
	public Integer getIdNature() {
		return this.idNature;
	}

	public void setIdNature(Integer idNature) {
		this.idNature = idNature;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_FAMILLE", nullable = false)
	public Famille getFamille() {
		return this.famille;
	}

	public void setFamille(Famille famille) {
		this.famille = famille;
	}

	@Column(name = "CODE_NATURE", length = 10)
	public String getCodeNature() {
		return this.codeNature;
	}

	public void setCodeNature(String codeNature) {
		this.codeNature = codeNature;
	}

	@Column(name = "LIB_NATURE", length = 25)
	public String getLibNature() {
		return this.libNature;
	}

	public void setLibNature(String libNature) {
		this.libNature = libNature;
	}

	@Column(name = "DESCRIPTION_NATURE", length = 65535)
	public String getDescriptionNature() {
		return this.descriptionNature;
	}

	public void setDescriptionNature(String descriptionNature) {
		this.descriptionNature = descriptionNature;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nature")
	public Set<Materiel> getMateriels() {
		return this.materiels;
	}

	public void setMateriels(Set<Materiel> materiels) {
		this.materiels = materiels;
	}

}
