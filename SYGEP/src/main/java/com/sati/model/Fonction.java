package com.sati.model;
// Generated 25 oct. 2023, 22:30:48 by Hibernate Tools 4.3.6.Final

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
 * Fonction generated by hbm2java
 */
@Entity
@Table(name = "fonction", catalog = "ismistock_bd")
public class Fonction implements java.io.Serializable {

	private Integer idFonction;
	private String codeFonction;
	private String libFonction;
	private Set<Personne> personnes = new HashSet<Personne>(0);

	public Fonction() {
	}

	public Fonction(String codeFonction, String libFonction, Set<Personne> personnes) {
		this.codeFonction = codeFonction;
		this.libFonction = libFonction;
		this.personnes = personnes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_FONCTION", unique = true, nullable = false)
	public Integer getIdFonction() {
		return this.idFonction;
	}

	public void setIdFonction(Integer idFonction) {
		this.idFonction = idFonction;
	}

	@Column(name = "CODE_FONCTION", length = 10)
	public String getCodeFonction() {
		return this.codeFonction;
	}

	public void setCodeFonction(String codeFonction) {
		this.codeFonction = codeFonction;
	}

	@Column(name = "LIB_FONCTION", length = 50)
	public String getLibFonction() {
		return this.libFonction;
	}

	public void setLibFonction(String libFonction) {
		this.libFonction = libFonction;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fonction")
	public Set<Personne> getPersonnes() {
		return this.personnes;
	}

	public void setPersonnes(Set<Personne> personnes) {
		this.personnes = personnes;
	}

}
