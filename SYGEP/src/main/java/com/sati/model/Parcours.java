package com.sati.model;
// Generated 21 sept. 2023, 13:04:21 by Hibernate Tools 4.3.6.Final

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
 * Parcours generated by hbm2java
 */
@Entity
@Table(name = "parcours", catalog = "ismistock_bd")
public class Parcours implements java.io.Serializable {

	private Integer idPacours;
	private Materiel materiel;
	private Service service;
	private String codeParcours;
	private Date dateParcours;
	private Date dateEnregParcours;

	public Parcours() {
	}

	public Parcours(Materiel materiel, Service service) {
		this.materiel = materiel;
		this.service = service;
	}

	public Parcours(Materiel materiel, Service service, String codeParcours, Date dateParcours,
			Date dateEnregParcours) {
		this.materiel = materiel;
		this.service = service;
		this.codeParcours = codeParcours;
		this.dateParcours = dateParcours;
		this.dateEnregParcours = dateEnregParcours;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_PACOURS", unique = true, nullable = false)
	public Integer getIdPacours() {
		return this.idPacours;
	}

	public void setIdPacours(Integer idPacours) {
		this.idPacours = idPacours;
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
	@JoinColumn(name = "ID_ENTITE", nullable = false)
	public Service getService() {
		return this.service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	@Column(name = "CODE_PARCOURS", length = 10)
	public String getCodeParcours() {
		return this.codeParcours;
	}

	public void setCodeParcours(String codeParcours) {
		this.codeParcours = codeParcours;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_PARCOURS", length = 10)
	public Date getDateParcours() {
		return this.dateParcours;
	}

	public void setDateParcours(Date dateParcours) {
		this.dateParcours = dateParcours;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_ENREG_PARCOURS", length = 19)
	public Date getDateEnregParcours() {
		return this.dateEnregParcours;
	}

	public void setDateEnregParcours(Date dateEnregParcours) {
		this.dateEnregParcours = dateEnregParcours;
	}

}
