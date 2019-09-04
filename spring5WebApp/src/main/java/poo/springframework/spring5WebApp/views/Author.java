package poo.springframework.spring5WebApp.views;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String first_name;
   private String last_name;

   @ManyToMany(mappedBy = "authors")
   private Set<Book> books = new HashSet<Book>();


    public Author() {
    }

    public Author(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Author(String first_name, String last_name,Set<Book> books) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
