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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Materiel generated by hbm2java
 */
@Entity
@Table(name = "materiel", catalog = "ismistock_bd")
public class Materiel implements java.io.Serializable {

	private Integer idMateriel;
	private Magasin magasin;
	private Marque marque;
	private Nature nature;
	private String codeMateriel;
	private String nomMateriel;
	private String descriptionMateriel;
	private String referenceMateriel;
	private Boolean retrait;
	private Set<Valeur> valeurs = new HashSet<Valeur>(0);
	private NonFongible nonFongible;
	private Fongible fongible;
	private Set<LigneCommande> ligneCommandes = new HashSet<LigneCommande>(0);
	private Set<Point> points = new HashSet<Point>(0);
	private Set<Demande> demandes = new HashSet<Demande>(0);
	private Set<Entree> entrees = new HashSet<Entree>(0);
	private Set<Parcours> parcourses = new HashSet<Parcours>(0);
	private Set<Diagnostique> diagnostiques = new HashSet<Diagnostique>(0);

	public Materiel() {
	}

	public Materiel(Magasin magasin, Nature nature) {
		this.magasin = magasin;
		this.nature = nature;
	}

	public Materiel(Magasin magasin, Marque marque, Nature nature, String codeMateriel, String nomMateriel,
			String descriptionMateriel, String referenceMateriel, Boolean retrait, Set<Valeur> valeurs,
			NonFongible nonFongible, Fongible fongible, Set<LigneCommande> ligneCommandes, Set<Point> points,
			Set<Demande> demandes, Set<Entree> entrees, Set<Parcours> parcourses, Set<Diagnostique> diagnostiques) {
		this.magasin = magasin;
		this.marque = marque;
		this.nature = nature;
		this.codeMateriel = codeMateriel;
		this.nomMateriel = nomMateriel;
		this.descriptionMateriel = descriptionMateriel;
		this.referenceMateriel = referenceMateriel;
		this.retrait = retrait;
		this.valeurs = valeurs;
		this.nonFongible = nonFongible;
		this.fongible = fongible;
		this.ligneCommandes = ligneCommandes;
		this.points = points;
		this.demandes = demandes;
		this.entrees = entrees;
		this.parcourses = parcourses;
		this.diagnostiques = diagnostiques;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_MATERIEL", unique = true, nullable = false)
	public Integer getIdMateriel() {
		return this.idMateriel;
	}

	public void setIdMateriel(Integer idMateriel) {
		this.idMateriel = idMateriel;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_MAGASIN", nullable = false)
	public Magasin getMagasin() {
		return this.magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_MARQUE")
	public Marque getMarque() {
		return this.marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_NATURE", nullable = false)
	public Nature getNature() {
		return this.nature;
	}

	public void setNature(Nature nature) {
		this.nature = nature;
	}

	@Column(name = "CODE_MATERIEL", length = 10)
	public String getCodeMateriel() {
		return this.codeMateriel;
	}

	public void setCodeMateriel(String codeMateriel) {
		this.codeMateriel = codeMateriel;
	}

	@Column(name = "NOM_MATERIEL", length = 25)
	public String getNomMateriel() {
		return this.nomMateriel;
	}

	public void setNomMateriel(String nomMateriel) {
		this.nomMateriel = nomMateriel;
	}

	@Column(name = "DESCRIPTION_MATERIEL", length = 65535)
	public String getDescriptionMateriel() {
		return this.descriptionMateriel;
	}

	public void setDescriptionMateriel(String descriptionMateriel) {
		this.descriptionMateriel = descriptionMateriel;
	}

	@Column(name = "REFERENCE_MATERIEL", length = 50)
	public String getReferenceMateriel() {
		return this.referenceMateriel;
	}

	public void setReferenceMateriel(String referenceMateriel) {
		this.referenceMateriel = referenceMateriel;
	}

	@Column(name = "RETRAIT")
	public Boolean getRetrait() {
		return this.retrait;
	}

	public void setRetrait(Boolean retrait) {
		this.retrait = retrait;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materiel")
	public Set<Valeur> getValeurs() {
		return this.valeurs;
	}

	public void setValeurs(Set<Valeur> valeurs) {
		this.valeurs = valeurs;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "materiel")
	public NonFongible getNonFongible() {
		return this.nonFongible;
	}

	public void setNonFongible(NonFongible nonFongible) {
		this.nonFongible = nonFongible;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "materiel")
	public Fongible getFongible() {
		return this.fongible;
	}

	public void setFongible(Fongible fongible) {
		this.fongible = fongible;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materiel")
	public Set<LigneCommande> getLigneCommandes() {
		return this.ligneCommandes;
	}

	public void setLigneCommandes(Set<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materiel")
	public Set<Point> getPoints() {
		return this.points;
	}

	public void setPoints(Set<Point> points) {
		this.points = points;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materiel")
	public Set<Demande> getDemandes() {
		return this.demandes;
	}

	public void setDemandes(Set<Demande> demandes) {
		this.demandes = demandes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materiel")
	public Set<Entree> getEntrees() {
		return this.entrees;
	}

	public void setEntrees(Set<Entree> entrees) {
		this.entrees = entrees;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materiel")
	public Set<Parcours> getParcourses() {
		return this.parcourses;
	}

	public void setParcourses(Set<Parcours> parcourses) {
		this.parcourses = parcourses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materiel")
	public Set<Diagnostique> getDiagnostiques() {
		return this.diagnostiques;
	}

	public void setDiagnostiques(Set<Diagnostique> diagnostiques) {
		this.diagnostiques = diagnostiques;
	}

}
