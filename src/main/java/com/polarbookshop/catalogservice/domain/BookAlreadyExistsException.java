package com.polarbookshop.catalogservice.domain;

import java.text.MessageFormat;

public class BookAlreadyExistsException extends RuntimeException {
    public BookAlreadyExistsException(String isbn) {
        super(MessageFormat.format("A book with ISBN {0} already exists.", isbn));
    }
}

