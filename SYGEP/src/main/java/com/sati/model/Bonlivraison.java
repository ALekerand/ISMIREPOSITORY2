package com.sati.model;
// Generated 25 oct. 2023, 22:30:48 by Hibernate Tools 4.3.6.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Bonlivraison generated by hbm2java
 */
@Entity
@Table(name = "bonlivraison", catalog = "ismistock_bd")
public class Bonlivraison implements java.io.Serializable {

	private Integer idBonLivraison;
	private Boncommande boncommande;
	private Personne personne;
	private String codeBonLivraison;
	private Date dateLivraison;
	private Date dateEnregistrementLivraison;
	private String fichier;
	private Set<Boncommande> boncommandes = new HashSet<Boncommande>(0);

	public Bonlivraison() {
	}

	public Bonlivraison(Boncommande boncommande, Personne personne) {
		this.boncommande = boncommande;
		this.personne = personne;
	}

	public Bonlivraison(Boncommande boncommande, Personne personne, String codeBonLivraison, Date dateLivraison,
			Date dateEnregistrementLivraison, String fichier, Set<Boncommande> boncommandes) {
		this.boncommande = boncommande;
		this.personne = personne;
		this.codeBonLivraison = codeBonLivraison;
		this.dateLivraison = dateLivraison;
		this.dateEnregistrementLivraison = dateEnregistrementLivraison;
		this.fichier = fichier;
		this.boncommandes = boncommandes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_BON_LIVRAISON", unique = true, nullable = false)
	public Integer getIdBonLivraison() {
		return this.idBonLivraison;
	}

	public void setIdBonLivraison(Integer idBonLivraison) {
		this.idBonLivraison = idBonLivraison;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_BON_COMMANDE", nullable = false)
	public Boncommande getBoncommande() {
		return this.boncommande;
	}

	public void setBoncommande(Boncommande boncommande) {
		this.boncommande = boncommande;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_ENTITE", nullable = false)
	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Column(name = "CODE_BON_LIVRAISON", length = 20)
	public String getCodeBonLivraison() {
		return this.codeBonLivraison;
	}

	public void setCodeBonLivraison(String codeBonLivraison) {
		this.codeBonLivraison = codeBonLivraison;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_LIVRAISON", length = 10)
	public Date getDateLivraison() {
		return this.dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_ENREGISTREMENT_LIVRAISON", length = 19)
	public Date getDateEnregistrementLivraison() {
		return this.dateEnregistrementLivraison;
	}

	public void setDateEnregistrementLivraison(Date dateEnregistrementLivraison) {
		this.dateEnregistrementLivraison = dateEnregistrementLivraison;
	}

	@Column(name = "FICHIER", length = 200)
	public String getFichier() {
		return this.fichier;
	}

	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bonlivraison")
	public Set<Boncommande> getBoncommandes() {
		return this.boncommandes;
	}

	public void setBoncommandes(Set<Boncommande> boncommandes) {
		this.boncommandes = boncommandes;
	}

}
