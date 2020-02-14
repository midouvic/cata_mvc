package org.sid;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CataMvc6Application implements CommandLineRunner {
	@Autowired
    private ProduitRepository produitRepository;
	public static void main(String[] args) {
		SpringApplication.run(CataMvc6Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		produitRepository.save(new Produit(null,"Imprimante Canon C02",3600,12));
		produitRepository.save(new Produit(null,"Ordinateur HP 650",8000,23));
		produitRepository.save(new Produit(null,"Smartphone S5",4500,30));
		produitRepository.save(new Produit(null,"Ordinateur Sony T5",9500,30));
		produitRepository.findAll().forEach(p->System.out.println(p.getDesignation()));
		
		
	}

}
