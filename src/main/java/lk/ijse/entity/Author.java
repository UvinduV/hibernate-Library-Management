package lk.ijse.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue
    private String id;
    private String Name;
    private String country;

    @OneToMany(mappedBy = "author",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Books> booksList;

    public Author() {
    }

    public Author(String id, String name, String country, List<Books> booksList) {
        this.id = id;
        this.Name = name;
        this.country=country;
        this.booksList = booksList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Books> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Books> booksList) {
        this.booksList = booksList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", country='" + country + '\'' +
                ", booksList=" + booksList +
                '}';
    }
}
