package com.reflexive;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Categorie")
public class Categorie implements Serializable{
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	
	@ManyToOne
	@JoinColumn(name = "parentCategorie", nullable = true)
	private Categorie parentCategorie;
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(String libelle) {
		super();
		this.libelle = libelle;
	}
	@OneToMany(mappedBy = "parentCategorie", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<Categorie> sousCategorie = new HashSet<>();
	public Categorie getParentCategorie() {
		return parentCategorie;
	}
	public void setParentCategorie(Categorie parentCategorie) {
		this.parentCategorie = parentCategorie;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Set<Categorie> getSousCategorie() {
		return sousCategorie;
	}
	public void setSousCategorie(Set<Categorie> sousCategorie) {
		this.sousCategorie = sousCategorie;
	}
	public Categorie(Long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	
	
}
