package com.reflexive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReflexiveSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReflexiveSpringApplication.class, args);
	}

	@Autowired
	private Categoriedao dao;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categorie a = new Categorie("cat a");
		/*----------------*/
		Categorie a1 = new Categorie("cat a1");
		Categorie a2 = new Categorie("cat a2");
		Categorie a3 = new Categorie("cat a3");
		a.getSousCategorie().add(a1);
		a1.setParentCategorie(a);
		a.getSousCategorie().add(a2);
		a2.setParentCategorie(a);
		a.getSousCategorie().add(a3);
		a3.setParentCategorie(a);
		/*----------------*/
		Categorie a11 = new Categorie("cat a11");
		a1.getSousCategorie().add(a11);
		a11.setParentCategorie(a1);
		Categorie a12 = new Categorie("cat a12");
		a1.getSousCategorie().add(a12);
		a12.setParentCategorie(a1);
		Categorie a13 = new Categorie("cat a13");
		a1.getSousCategorie().add(a13);
		a13.setParentCategorie(a1);
		Categorie a14 = new Categorie("cat a14");
		a1.getSousCategorie().add(a14);
		a14.setParentCategorie(a1);
		
		
		dao.save(a);
		dao.save(a1);
		dao.save(a2);
		dao.save(a3);
		
		dao.save(a11);
		dao.save(a12);
		dao.save(a13);
		dao.save(a14);
	}

}

