package com.schoolofnet.com.LiveGraphQL;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private BookRepository bookRepository;

    public BookGraphQL(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findBooks() {
        return this.bookRepository.findAll();
    }

    public Book createBook(Book book) {
        return this.bookRepository.save(book);
    }

}
