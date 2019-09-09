package poo.springframework.spring5WebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import poo.springframework.spring5WebApp.Model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {



}
