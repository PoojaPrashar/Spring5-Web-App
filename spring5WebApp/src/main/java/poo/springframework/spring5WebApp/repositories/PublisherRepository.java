package poo.springframework.spring5WebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import poo.springframework.spring5WebApp.views.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
