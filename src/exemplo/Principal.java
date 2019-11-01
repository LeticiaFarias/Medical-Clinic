package exemplo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class Principal {

	public static void main(String[] args) {

		// ex01InserirDados();
		// ex02BuscarComJPQL();
		// ex03BuscarComCriteriaQuery();
		// ex04BuscarComNamedQuery();
		// ex05BuscarComNativeQuery();
		// ex06BuscarComNativeQuery2();
		// ex07InserirDadosComJPAUtil();
		// ex08InserirDadosComDAO();
		// ex09deleteComDAO();
		// ex10buscarComDAO();
		// ex11buscarPorNome();
		// ex12buscarPorParteDoNome();
		// ex13Paginacao();
		ex14InserirContatoAssociacoes();
		System.out.println("FIM - JPA");

		/*
		 * EXERCÍCIO: FAÇA UM MÉTODO findByNome PARA BUSCAR UM CONTATO (OU MAIS) POR
		 * NOME. PENSE ONDE COLOCAR ESSE MÉTODO (ONDE FAZ SENTIDO ELE ESTAR).
		 */
	}

	public static void ex14InserirContatoAssociacoes() {

		Contato c = new Contato("Anderson");
		Foto foto = new Foto(10, 10, c);
		c.setFoto(foto);

		List<Telefone> fones = new ArrayList<Telefone>();
		fones.add(new Telefone(88, 111, c));
		fones.add(new Telefone(88, 222, c));
		fones.add(new Telefone(85, 333, c));
		c.setTelefones(fones);

		List<Endereco> enderecos = new ArrayList<Endereco>();
		enderecos.add(new Endereco("A", 1));
		enderecos.add(new Endereco("B", 2));
		enderecos.add(new Endereco("C", 3));
		for (Endereco e : enderecos) {
			e.setContatos(new ArrayList<Contato>());
			e.getContatos().add(c);
		}
		c.setEnderecos(enderecos);

		ContatoDAO cDao = new ContatoJPADAO();
		try {
			cDao.beginTransaction();
			cDao.save(c);
			cDao.commit();
		} catch (IllegalStateException | PersistenceException e) {
			cDao.rollback();
			e.printStackTrace();
		} finally {
			cDao.close();
		}
		System.out.println("===========================================");

	}

	@SuppressWarnings("unchecked")
	public static void ex13Paginacao() {

		EntityManager em = JPAUtil.getEntityManager();
		List<Contato> contatos = em.createQuery("from Contato").setFirstResult(3).setMaxResults(4).getResultList();
		JPAUtil.closeEntityManager();
		System.out.println("===========================================");
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
	}

	public static void ex12buscarPorParteDoNome() {
		ContatoDAO cDao = new ContatoJPADAO();
		List<Contato> contatos = cDao.findByParteDoNome("Junior");
		cDao.close();
		System.out.println("===========================================");
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
	}

	public static void ex11buscarPorNome() {
		ContatoDAO cDao = new ContatoJPADAO();
		List<Contato> contatos = cDao.findByNome("Junior");
		cDao.close();
		System.out.println("===========================================");
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
	}

	public static void ex10buscarComDAO() {
		ContatoDAO cDao = new ContatoJPADAO();
		List<Contato> contatos = cDao.findAll();
		cDao.close();
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
		System.out.println("===========================================");
	}

	public static void ex09deleteComDAO() {
		ContatoDAO cDao = new ContatoJPADAO();
		try {
			cDao.beginTransaction();

			// Contato c = cDao.find(4);
			/*
			 * Contato c = new Contato(); c.setId(11); cDao.delete(c);
			 */
			cDao.deleteById(10);
			cDao.close();
			System.out.println("===========================================");
			// System.out.println(c);
			cDao.commit();
		} catch (IllegalStateException | PersistenceException e) {
			cDao.rollback();
			e.printStackTrace();
		} finally {
			cDao.close();
		}
	}

	public static void ex08InserirDadosComDAO() {
		ContatoDAO cDao = new ContatoJPADAO();

		try {
			cDao.beginTransaction();
			cDao.save(new Contato("Ronaldo", "999"));
			cDao.save(new Contato("Mary", "100"));
			cDao.save(new Contato(1, "Junior", "300"));
			cDao.commit();
		} catch (IllegalStateException | PersistenceException e) {
			cDao.rollback();
			e.printStackTrace();
		} finally {
			cDao.close();
		}
		System.out.println("===========================================");
	}

	public static void ex07InserirDadosComJPAUtil() {

		EntityManager em = JPAUtil.getEntityManager();
		try {
			JPAUtil.beginTransaction();

			em.persist(new Contato("Italo", "555"));
			em.persist(new Contato("Victor", "666"));
			em.persist(new Contato("Fernanda", "777"));
			em.persist(new Contato("Evenilson", "888"));

			JPAUtil.commit();
		} catch (IllegalStateException | PersistenceException e) {
			JPAUtil.rollback();
			e.printStackTrace();
		} finally {
			JPAUtil.closeEntityManager();
		}

		System.out.println("===========================================");
	}

	@SuppressWarnings("unchecked")
	public static void ex06BuscarComNativeQuery2() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNativeQuery("SELECT * FROM contato", Contato.class);
		List<Contato> contatos = query.getResultList();

		em.close();
		System.out.println("===========================================");
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
	}

	@SuppressWarnings("unchecked")
	public static void ex05BuscarComNativeQuery() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNativeQuery("SELECT * FROM contato");
		List<Object[]> result = query.getResultList();
		List<Contato> contatos = new ArrayList<Contato>();
		for (Object[] linha : result) {
			int id = (int) linha[0];
			String nome = (String) linha[1];
			String telefone = (String) linha[2];
			contatos.add(new Contato(id, nome, telefone));
		}
		em.close();
		System.out.println("===========================================");
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
	}

	public static void ex04BuscarComNamedQuery() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		List<Contato> contatos = em.createNamedQuery("Contato.findAll", Contato.class).getResultList();
		em.close();
		System.out.println("===========================================");
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
	}

	public static void ex03BuscarComCriteriaQuery() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Contato> cq = cb.createQuery(Contato.class);
		cq.from(Contato.class);
		List<Contato> contatos = em.createQuery(cq).getResultList();
		em.close();
		System.out.println("===========================================");
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
	}

	public static void ex02BuscarComJPQL() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		List<Contato> contatos = em.createQuery("from Contato", Contato.class).getResultList();
		em.close();
		System.out.println("===========================================");
		for (Contato contato : contatos) {
			System.out.println(contato);
		}

	}

	public static void ex01InserirDados() {
		Contato c = new Contato("Jean", "123");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			em.persist(c);
			/*
			 * em.persist(new Contato("Sting", "111")); em.persist(new Contato("Ronier",
			 * "222")); em.persist(new Contato("Lucas", "333")); em.persist(new
			 * Contato("Wesley", "444"));
			 */
			tx.commit();
		} catch (IllegalStateException | PersistenceException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

		System.out.println("===========================================");

		System.out.println(c);
	}
}
