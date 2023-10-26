package com.sati.model;
// Generated 25 oct. 2023, 22:30:48 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Personne generated by hbm2java
 */
@Entity
@Table(name = "personne", catalog = "ismistock_bd")
public class Personne implements java.io.Serializable {

	private int idEntite;
	private Entite entite;
	private Fonction fonction;
	private UserAuthentication userAuthentication;
	private String codeEntite;
	private String telephone;
	private String email;
	private String nomPersonne;
	private String prenomsPersonne;
	private Set<Entree> entrees = new HashSet<Entree>(0);
	private Set<Bonlivraison> bonlivraisons = new HashSet<Bonlivraison>(0);
	private Set<Sortie> sorties = new HashSet<Sortie>(0);
	private Set<UserAuthentication> userAuthentications = new HashSet<UserAuthentication>(0);
	private Set<Boncommande> boncommandes = new HashSet<Boncommande>(0);

	public Personne() {
	}

	public Personne(Entite entite) {
		this.entite = entite;
	}

	public Personne(Entite entite, Fonction fonction, UserAuthentication userAuthentication, String codeEntite,
			String telephone, String email, String nomPersonne, String prenomsPersonne, Set<Entree> entrees,
			Set<Bonlivraison> bonlivraisons, Set<Sortie> sorties, Set<UserAuthentication> userAuthentications,
			Set<Boncommande> boncommandes) {
		this.entite = entite;
		this.fonction = fonction;
		this.userAuthentication = userAuthentication;
		this.codeEntite = codeEntite;
		this.telephone = telephone;
		this.email = email;
		this.nomPersonne = nomPersonne;
		this.prenomsPersonne = prenomsPersonne;
		this.entrees = entrees;
		this.bonlivraisons = bonlivraisons;
		this.sorties = sorties;
		this.userAuthentications = userAuthentications;
		this.boncommandes = boncommandes;
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_FONCTION")
	public Fonction getFonction() {
		return this.fonction;
	}

	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_ID")
	public UserAuthentication getUserAuthentication() {
		return this.userAuthentication;
	}

	public void setUserAuthentication(UserAuthentication userAuthentication) {
		this.userAuthentication = userAuthentication;
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

	@Column(name = "NOM_PERSONNE", length = 25)
	public String getNomPersonne() {
		return this.nomPersonne;
	}

	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}

	@Column(name = "PRENOMS_PERSONNE", length = 50)
	public String getPrenomsPersonne() {
		return this.prenomsPersonne;
	}

	public void setPrenomsPersonne(String prenomsPersonne) {
		this.prenomsPersonne = prenomsPersonne;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personne")
	public Set<Entree> getEntrees() {
		return this.entrees;
	}

	public void setEntrees(Set<Entree> entrees) {
		this.entrees = entrees;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personne")
	public Set<Bonlivraison> getBonlivraisons() {
		return this.bonlivraisons;
	}

	public void setBonlivraisons(Set<Bonlivraison> bonlivraisons) {
		this.bonlivraisons = bonlivraisons;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personne")
	public Set<Sortie> getSorties() {
		return this.sorties;
	}

	public void setSorties(Set<Sortie> sorties) {
		this.sorties = sorties;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personne")
	public Set<UserAuthentication> getUserAuthentications() {
		return this.userAuthentications;
	}

	public void setUserAuthentications(Set<UserAuthentication> userAuthentications) {
		this.userAuthentications = userAuthentications;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personne")
	public Set<Boncommande> getBoncommandes() {
		return this.boncommandes;
	}

	public void setBoncommandes(Set<Boncommande> boncommandes) {
		this.boncommandes = boncommandes;
	}

}
