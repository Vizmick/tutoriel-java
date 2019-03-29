package poo;

import java.util.Date;

public class Eleve {
	public final String Version= "Version 1.0";
	
	private String nom;
	private String prenom;
	private String genre;
	private Date dateNaissance;
	private int id;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String input) {
		nom=input;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String input) {
		prenom=input;
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String input) {
		genre=input;
	}
	
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date input) {
		dateNaissance=input;
	}
	public int getId() {
		return id;
	}

	
}
