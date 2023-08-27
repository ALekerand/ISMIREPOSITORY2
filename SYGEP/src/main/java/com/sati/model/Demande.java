package com.sati.model;
// Generated 26 ao�t 2023, 22:26:06 by Hibernate Tools 4.3.6.Final

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
 * Demande generated by hbm2java
 */
@Entity
@Table(name = "demande", catalog = "ismistock_bd")
public class Demande implements java.io.Serializable {

	private Integer idDemande;
	private Entite entite;
	private EtatDemande etatDemande;
	private Materiel materiel;
	private Sortie sortie;
	private String codeDemande;
	private String motifDemande;
	private Integer qteDemande;
	private Date dateDemande;
	private Date dateTraitement;
	private String motifRejet;
	private Boolean etatReception;
	private Date dateEtatReception;
	private Boolean emprunt;
	private Date dateRetourPrevue;
	private Set<Sortie> sorties = new HashSet<Sortie>(0);

	public Demande() {
	}

	public Demande(Entite entite, EtatDemande etatDemande, Materiel materiel) {
		this.entite = entite;
		this.etatDemande = etatDemande;
		this.materiel = materiel;
	}

	public Demande(Entite entite, EtatDemande etatDemande, Materiel materiel, Sortie sortie, String codeDemande,
			String motifDemande, Integer qteDemande, Date dateDemande, Date dateTraitement, String motifRejet,
			Boolean etatReception, Date dateEtatReception, Boolean emprunt, Date dateRetourPrevue,
			Set<Sortie> sorties) {
		this.entite = entite;
		this.etatDemande = etatDemande;
		this.materiel = materiel;
		this.sortie = sortie;
		this.codeDemande = codeDemande;
		this.motifDemande = motifDemande;
		this.qteDemande = qteDemande;
		this.dateDemande = dateDemande;
		this.dateTraitement = dateTraitement;
		this.motifRejet = motifRejet;
		this.etatReception = etatReception;
		this.dateEtatReception = dateEtatReception;
		this.emprunt = emprunt;
		this.dateRetourPrevue = dateRetourPrevue;
		this.sorties = sorties;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_DEMANDE", unique = true, nullable = false)
	public Integer getIdDemande() {
		return this.idDemande;
	}

	public void setIdDemande(Integer idDemande) {
		this.idDemande = idDemande;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_ENTITE", nullable = false)
	public Entite getEntite() {
		return this.entite;
	}

	public void setEntite(Entite entite) {
		this.entite = entite;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_ETAT_DEMANDE", nullable = false)
	public EtatDemande getEtatDemande() {
		return this.etatDemande;
	}

	public void setEtatDemande(EtatDemande etatDemande) {
		this.etatDemande = etatDemande;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_MATERIEL", nullable = false)
	public Materiel getMateriel() {
		return this.materiel;
	}

	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_SORTIE")
	public Sortie getSortie() {
		return this.sortie;
	}

	public void setSortie(Sortie sortie) {
		this.sortie = sortie;
	}

	@Column(name = "CODE_DEMANDE", length = 10)
	public String getCodeDemande() {
		return this.codeDemande;
	}

	public void setCodeDemande(String codeDemande) {
		this.codeDemande = codeDemande;
	}

	@Column(name = "MOTIF_DEMANDE", length = 50)
	public String getMotifDemande() {
		return this.motifDemande;
	}

	public void setMotifDemande(String motifDemande) {
		this.motifDemande = motifDemande;
	}

	@Column(name = "QTE_DEMANDE")
	public Integer getQteDemande() {
		return this.qteDemande;
	}

	public void setQteDemande(Integer qteDemande) {
		this.qteDemande = qteDemande;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_DEMANDE", length = 19)
	public Date getDateDemande() {
		return this.dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_TRAITEMENT", length = 19)
	public Date getDateTraitement() {
		return this.dateTraitement;
	}

	public void setDateTraitement(Date dateTraitement) {
		this.dateTraitement = dateTraitement;
	}

	@Column(name = "MOTIF_REJET", length = 50)
	public String getMotifRejet() {
		return this.motifRejet;
	}

	public void setMotifRejet(String motifRejet) {
		this.motifRejet = motifRejet;
	}

	@Column(name = "ETAT_RECEPTION")
	public Boolean getEtatReception() {
		return this.etatReception;
	}

	public void setEtatReception(Boolean etatReception) {
		this.etatReception = etatReception;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_ETAT_RECEPTION", length = 19)
	public Date getDateEtatReception() {
		return this.dateEtatReception;
	}

	public void setDateEtatReception(Date dateEtatReception) {
		this.dateEtatReception = dateEtatReception;
	}

	@Column(name = "EMPRUNT")
	public Boolean getEmprunt() {
		return this.emprunt;
	}

	public void setEmprunt(Boolean emprunt) {
		this.emprunt = emprunt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_RETOUR_PREVUE", length = 10)
	public Date getDateRetourPrevue() {
		return this.dateRetourPrevue;
	}

	public void setDateRetourPrevue(Date dateRetourPrevue) {
		this.dateRetourPrevue = dateRetourPrevue;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "demande")
	public Set<Sortie> getSorties() {
		return this.sorties;
	}

	public void setSorties(Set<Sortie> sorties) {
		this.sorties = sorties;
	}

}
