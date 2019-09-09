package poo.springframework.spring5WebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import poo.springframework.spring5WebApp.Model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
