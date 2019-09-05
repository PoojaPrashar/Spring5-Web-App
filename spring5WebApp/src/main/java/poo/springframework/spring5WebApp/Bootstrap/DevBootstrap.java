package poo.springframework.spring5WebApp.Bootstrap;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import poo.springframework.spring5WebApp.repositories.AuthorRepository;
import poo.springframework.spring5WebApp.repositories.BookRepository;
import poo.springframework.spring5WebApp.views.Author;
import poo.springframework.spring5WebApp.views.Book;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository,BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        //Eric
        Author eric = new Author("Pooja", "Prashar");
        Book dd = new Book("Java", "123Se", "Rekha Prashar");
        eric.getBooks().add(dd);
        dd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(dd);



        //Rod
        Author rod = new Author("Shivanku", "Mahna");
        Book ejb = new Book("EJB Struts", "123FE","D.K Prashar");
        rod.getBooks().add(ejb);
        ejb.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(ejb);

    }




}
