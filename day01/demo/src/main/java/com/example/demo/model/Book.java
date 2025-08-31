package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Book {
    private final String title;
    private final String author;

    public static void main(String[] args) {
        Book book = new Book("어린왕자", "생텍쥐베리");
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
    }
}

