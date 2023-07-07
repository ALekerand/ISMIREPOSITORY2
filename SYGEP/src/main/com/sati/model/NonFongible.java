package main.com.sati.model;
// Generated 7 juil. 2023, 13:21:20 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * NonFongible generated by hbm2java
 */
@Entity
@Table(name = "non_fongible", catalog = "ismistock_bd")
public class NonFongible implements java.io.Serializable {

	private int idMateriel;
	private Materiel materiel;
	private Integer idNature;
	private Integer idMagasin;
	private Integer idMarque;
	private String codeMateriel;
	private String nomMateriel;
	private String descriptionMateriel;
	private String qrCode;
	private Boolean retraitMateriel;
	private Date dateRetrait;

	public NonFongible() {
	}

	public NonFongible(Materiel materiel) {
		this.materiel = materiel;
	}

	public NonFongible(Materiel materiel, Integer idNature, Integer idMagasin, Integer idMarque, String codeMateriel,
			String nomMateriel, String descriptionMateriel, String qrCode, Boolean retraitMateriel, Date dateRetrait) {
		this.materiel = materiel;
		this.idNature = idNature;
		this.idMagasin = idMagasin;
		this.idMarque = idMarque;
		this.codeMateriel = codeMateriel;
		this.nomMateriel = nomMateriel;
		this.descriptionMateriel = descriptionMateriel;
		this.qrCode = qrCode;
		this.retraitMateriel = retraitMateriel;
		this.dateRetrait = dateRetrait;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "materiel"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "ID_MATERIEL", unique = true, nullable = false)
	public int getIdMateriel() {
		return this.idMateriel;
	}

	public void setIdMateriel(int idMateriel) {
		this.idMateriel = idMateriel;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Materiel getMateriel() {
		return this.materiel;
	}

	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}

	@Column(name = "ID_NATURE")
	public Integer getIdNature() {
		return this.idNature;
	}

	public void setIdNature(Integer idNature) {
		this.idNature = idNature;
	}

	@Column(name = "ID_MAGASIN")
	public Integer getIdMagasin() {
		return this.idMagasin;
	}

	public void setIdMagasin(Integer idMagasin) {
		this.idMagasin = idMagasin;
	}

	@Column(name = "ID_MARQUE")
	public Integer getIdMarque() {
		return this.idMarque;
	}

	public void setIdMarque(Integer idMarque) {
		this.idMarque = idMarque;
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

	@Column(name = "QR_CODE", length = 200)
	public String getQrCode() {
		return this.qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	@Column(name = "RETRAIT_MATERIEL")
	public Boolean getRetraitMateriel() {
		return this.retraitMateriel;
	}

	public void setRetraitMateriel(Boolean retraitMateriel) {
		this.retraitMateriel = retraitMateriel;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_RETRAIT", length = 10)
	public Date getDateRetrait() {
		return this.dateRetrait;
	}

	public void setDateRetrait(Date dateRetrait) {
		this.dateRetrait = dateRetrait;
	}

}
