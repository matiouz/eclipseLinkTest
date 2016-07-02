package com.mgy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class QueryRunner {

    private static final String PERSISTENCE_UNIT_NAME = "todos";

    public void run(String queryText) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        System.out.println("-----------------------------------------");
        System.out.println("Running query: " + queryText);

        Query q = em.createQuery(queryText);
        List resultList = q.getResultList();

        System.out.println("Results:");
        for (Object o : resultList) {
            System.out.println(o);
        }

        System.out.println("Results size: " + resultList.size());
        System.out.println("-----------------------------------------");

        // create new todo
//        em.getTransaction().begin();
//        Todo todo = new Todo();
//        todo.setSummary("This is a test");
//        todo.setDescription("This is a test");
//        em.persist(todo);
//        em.getTransaction().commit();
//
//        em.close();
    }
}
