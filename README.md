(01)
Query query =session.createQuery("FROM Books WHERE publicationYear>?1");
query.setParameter(1,2010);
List<Books> booksList = query.getResultList();

(02)
Query query =session.createQuery("UPDATE Books SET price = price * 1.1 WHERE author = :author");
query.setParameter("author","1");
List<Books> booksList = query.getResultList();

(03)

(04)
Query query =session.createQuery("SELECT AVG(b.price) FROM Books b");
List<Books> booksList = query.getResultList();

(05)
Query query=session.createQuery("SELECT a, COUNT(b) FROM Author a LEFT JOIN Books b GROUP BY a");
List<Object[]>objectslist=query.list();

(06)
Query query = session.createQuery("select B.title from Books B join Author A on B.author.id=A.id where A.country=:country");
query.setParameter("country","UK");
List list = query.getResultList();

(07)
The Author entity is a @OneToMany relationship with books.This is  using mappedBy = "author" in Author entity and it will be defind the author attribute in books entity .
The @JoinColumn annotation add to the author attribute in the Books  entity for books entity is @ManyToOne relationship with Author entity and connect to the primary key in the Author table.
