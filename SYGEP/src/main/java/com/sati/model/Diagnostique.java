package com.sati.model;
// Generated 22 juin 2023, 16:17:05 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Diagnostique generated by hbm2java
 */
@Entity
@Table(name = "diagnostique", catalog = "ismistock_bd")
public class Diagnostique implements java.io.Serializable {

	private Integer idDiagnostique;
	private Etat etat;
	private Materiel materiel;
	private String codeDiagnostique;
	private Date dateDiagnostique;
	private String commentaire;

	public Diagnostique() {
	}

	public Diagnostique(Etat etat, Materiel materiel) {
		this.etat = etat;
		this.materiel = materiel;
	}

	public Diagnostique(Etat etat, Materiel materiel, String codeDiagnostique, Date dateDiagnostique,
			String commentaire) {
		this.etat = etat;
		this.materiel = materiel;
		this.codeDiagnostique = codeDiagnostique;
		this.dateDiagnostique = dateDiagnostique;
		this.commentaire = commentaire;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_DIAGNOSTIQUE", unique = true, nullable = false)
	public Integer getIdDiagnostique() {
		return this.idDiagnostique;
	}

	public void setIdDiagnostique(Integer idDiagnostique) {
		this.idDiagnostique = idDiagnostique;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ETAT", nullable = false)
	public Etat getEtat() {
		return this.etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MATERIEL", nullable = false)
	public Materiel getMateriel() {
		return this.materiel;
	}

	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}

	@Column(name = "CODE_DIAGNOSTIQUE", length = 10)
	public String getCodeDiagnostique() {
		return this.codeDiagnostique;
	}

	public void setCodeDiagnostique(String codeDiagnostique) {
		this.codeDiagnostique = codeDiagnostique;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DIAGNOSTIQUE", length = 10)
	public Date getDateDiagnostique() {
		return this.dateDiagnostique;
	}

	public void setDateDiagnostique(Date dateDiagnostique) {
		this.dateDiagnostique = dateDiagnostique;
	}

	@Column(name = "COMMENTAIRE", length = 65535)
	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

}
