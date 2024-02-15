/* Created By Sithira Roneth
 * Date :2/13/24
 * Time :11:47
 * Project Name :ORM _Supplementary
 * */
package lk.ijse;

import jakarta.persistence.Query;
import lk.ijse.Config.FactoryConfiguration;
import lk.ijse.Entity.Author;
import lk.ijse.Entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Author author = new Author();
        author.setId(1);
        author.setName("Jack");

        Book book = new Book();
        book.setId(1);
        book.setTitle("Jack's Life");
        book.setPublicationYear("2024");
        book.setPrice(2000.00);
        book.setAuthor(author);

        session.save(author);
        session.save(book);
        /*
# 01
- Query query = session.createQuery("FROM Book WHERE publicationYear > 2010", Book.class);
- List<Book> books = query.list();

# 02
- Query query = session.createQuery("UPDATE Book SET price = price + 10 WHERE author = :author");
- query.setParameter("author", specificAuthor);
- int rowsUpdated = query.executeUpdate();

# 03
- @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
- private List<Book> books;
- session.delete(author);

# 04
- Query query = session.createQuery("SELECT Avg(price) FROM Book");
- Double averagePrice = (Double) query.uniqueResult();

# 05
- Query query = session.createQuery("SELECT a.name, COUNT(b) FROM Author a JOIN a.books b GROUP BY a");
- List<Object[]> results = query.list();

# 06
- Query query = session.createQuery("FROM Book WHERE author.country = :country");
- query.setParameter("country", specificCountry);
- List<Book> books = query.list();

# 07
- @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
- private List<Book> books;

@ManyToOne
@JoinColumn(name = "author_id")
- private Author author;

# 08
- Query query = session.createQuery("SELECT a FROM Author a JOIN a.books b GROUP BY a HAVING COUNT(b) > (SELECT AVG(bCount) FROM (SELECT COUNT(*) as bCount FROM Book GROUP BY author_id) as subquery)");
- List<Author> authors = query.list();


*/

        transaction.commit();
        session.close();

    }
}
