package com.atguigu.amqp.entity;

/**
 * @author ming
 * @create 2019-08-23 18:24
 */
public class Book {
    private String bookName;
    private String Author;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public Book() {
    }

    public Book(String bookName, String author) {
        this.bookName = bookName;
        Author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
