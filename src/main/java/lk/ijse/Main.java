package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import lk.ijse.entity.Books;
import lk.ijse.entity.Author;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
        Transaction transaction = session.beginTransaction();


        //1
        /*Query query =session.createQuery("FROM Books WHERE publicationYear>?1");
        query.setParameter(1,2010);
        List<Books> booksList = query.getResultList();*/

        //2
        /*Query query =session.createQuery("UPDATE Books SET price = price * 1.1 WHERE author = :author");
        query.setParameter("author","1");
        List<Books> booksList = query.getResultList();*/

        //3

        //4
        /*Query query =session.createQuery("SELECT AVG(b.price) FROM Books b");
        List<Books> booksList = query.getResultList();*/

        //5
        /*Query query=session.createQuery("SELECT a, COUNT(b) FROM Author a LEFT JOIN Books b GROUP BY a");
        List<Object[]>objectslist=query.list();*/

        //6
        Query query = session.createQuery("select B.title from Books B join Author A on B.author.id=A.id where A.country=:country");
        query.setParameter("country","UK");
        List list = query.getResultList();

        for (Object obj : list) {
            System.out.println(obj);
        }

        //7

        //10
        /*Query query =session.createQuery("SELECT a FROM Author a WHERE SIZE(a.booksList) > (SELECT AVG(SIZE(b)) FROM  Books b)");
        List<Books> booksList = query.getResultList();*/



        transaction.commit();
        session.close();
    }
}