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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * UserAuthentication generated by hbm2java
 */
@Entity
@Table(name = "user_authentication", catalog = "ismistock_bd")
public class UserAuthentication implements java.io.Serializable {

	private Integer userId;
	private Personne personne;
	private String username;
	private String password;
	private Boolean enabled;
	private Set<Personne> personnes = new HashSet<Personne>(0);
	private Set<UserAuthorization> userAuthorizations = new HashSet<UserAuthorization>(0);

	public UserAuthentication() {
	}

	public UserAuthentication(Personne personne) {
		this.personne = personne;
	}

	public UserAuthentication(Personne personne, String username, String password, Boolean enabled,
			Set<Personne> personnes, Set<UserAuthorization> userAuthorizations) {
		this.personne = personne;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.personnes = personnes;
		this.userAuthorizations = userAuthorizations;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "USER_ID", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_ENTITE", nullable = false)
	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Column(name = "USERNAME", length = 15)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD", length = 15)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "ENABLED")
	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userAuthentication")
	public Set<Personne> getPersonnes() {
		return this.personnes;
	}

	public void setPersonnes(Set<Personne> personnes) {
		this.personnes = personnes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userAuthentication")
	public Set<UserAuthorization> getUserAuthorizations() {
		return this.userAuthorizations;
	}

	public void setUserAuthorizations(Set<UserAuthorization> userAuthorizations) {
		this.userAuthorizations = userAuthorizations;
	}

}
