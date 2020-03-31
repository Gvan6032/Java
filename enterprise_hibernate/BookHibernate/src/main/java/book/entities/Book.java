package book.entities;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="books")
public class Book {
    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBook;
    @Column(name="nameBook")
    private String nameBook;
    @Column(name="authorBook")
    private String authorBook;
    @Column (name="datePublication")
    private String datePublication;
    @Column (name="descriptionBook")
    private String descriptionBook;
    @Column (name="priceBook")
    private String priceBook;

    public Book() {
    }

    public Book(Integer idBook, String nameBook, String authorBook, String datePublication, String descriptionBook, String priceBook) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.datePublication = datePublication;
        this.descriptionBook = descriptionBook;
        this.priceBook = priceBook;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public String getDescriptionBook() {
        return descriptionBook;
    }

    public void setDescriptionBook(String descriptionBook) {
        this.descriptionBook = descriptionBook;
    }

    public String getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(String priceBook) {
        this.priceBook = priceBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", nameBook='" + nameBook + '\'' +
                ", authorBook='" + authorBook + '\'' +
                ", datePublication=" + datePublication +
                ", descriptionBook='" + descriptionBook + '\'' +
                ", priceBook='" + priceBook + '\'' +
                '}';
    }
}
