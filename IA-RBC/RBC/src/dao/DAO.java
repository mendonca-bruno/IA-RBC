package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DAO<E> {

    private EntityTransaction transacao;
    private EntityManager gerente;
    private EntityManagerFactory fabrica;
    static EntityManagerFactory emf;
    static EntityManager em;

    private Class<E> typeClass;

    public DAO() {
        fabrica = Persistence.createEntityManagerFactory("RBCPU");
        gerente = fabrica.createEntityManager();
    }

    public DAO(Class<E> typeClass) {
        emf = null;
        em = null;
        this.typeClass = typeClass;
    }

    public static void abrirConexao() {
        emf = Persistence.createEntityManagerFactory("RBCPU");
        em = emf.createEntityManager();
    }

    public void salvar(E entidade) {
        transacao = gerente.getTransaction();
        transacao.begin();
        gerente.merge(entidade);
        transacao.commit();
    }

    public List<E> pegarTodos(String sql) {
        transacao = gerente.getTransaction();
        transacao.begin();
        Query q = gerente.createNamedQuery(sql);
        List<E> listagem = q.getResultList();
        transacao.commit();
        return listagem;
    }

    public E pegarId(int id) {
        abrirConexao();
        E e = em.find(typeClass, id);
        emf.close();
        return e;
    }

}
