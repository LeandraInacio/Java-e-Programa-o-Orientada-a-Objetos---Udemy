package aplicacao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "Carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Maria Aparecida", "maria@gmail.com");
		Pessoa p3 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");

		// Conexão com o banco e todo conceito de persistência já implentados
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		// Iniciando a transação com BD

		em.getTransaction().begin();

		// Inserindo no banco de dados:
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);

		em.getTransaction().commit();
		
		em.close();
		emf.close();

		System.out.println("Dados gravados com Sucesso!");

	}

}
