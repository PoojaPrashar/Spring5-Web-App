package poo.springframework.spring5WebApp.Bootstrap;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import poo.springframework.spring5WebApp.repositories.AuthorRepository;
import poo.springframework.spring5WebApp.repositories.BookRepository;
import poo.springframework.spring5WebApp.repositories.PublisherRepository;
import poo.springframework.spring5WebApp.views.Author;
import poo.springframework.spring5WebApp.views.Book;
import poo.springframework.spring5WebApp.views.Publisher;
import java.util.Set;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository,BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override

    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        //Publisher
        Publisher publisher = new Publisher();
        publisher.setName("foo");
        publisher.setAddress("12th Street, LA");
        publisherRepository.save(publisher);





        //Eric
        Author eric = new Author("Pooja", "Prashar");
        Book dd = new Book("Java", "123Se", publisher);
        eric.getBooks().add(dd);
        dd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(dd);



        //Rod
        Author rod = new Author("Shivanku", "Mahna");
        Book ejb = new Book("EJB Struts", "123FE", publisher);
        rod.getBooks().add(ejb);
        ejb.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(ejb);

    }




}
