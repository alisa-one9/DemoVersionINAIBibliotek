package com.example.demoversioninaibibliotek.ui;

import java.io.Serializable;
import java.security.SecureRandom;

public class Book implements Serializable {
    private String author;
    private String name;
    private int image;
    private String book_enum;
    private int explain;

    public Book(String author, String name, int image, String book_enum, int explain) {
        this.author = author;
        this.name = name;
        this.image = image;
        this.book_enum = book_enum;
        this.explain = explain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBook_enum() {
        return book_enum;
    }

    public void setBook_enum(String book_enum) {
        this.book_enum = book_enum;
    }

    public int getExplain() {
        return explain;
    }

    public void setExplain(int explain) {
        this.explain = explain;
    }
}
