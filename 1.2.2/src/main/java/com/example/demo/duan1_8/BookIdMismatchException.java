package com.example.demo.duan1_8;

public class BookIdMismatchException extends RuntimeException {
    public BookIdMismatchException() {
        super("Book ID mismatch");
    }
}
