package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Books {
    @Id
    private String id;
    private String title;
    private String publicationYear;
    private double price;

    @ManyToOne
    private Author author;

    public Books() {
    }

    public Books(String id, String title, String publicationYear, Double price, Author author) {
        this.id = id;
        this.title = title;
        this.publicationYear=publicationYear;
        this.price=price;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublicationYear(){
        return publicationYear;
    }
    public void setPublicationYear(String publicationYear){
        this.publicationYear=publicationYear;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
