package com.library.api.entities;

import java.util.List;

public class Book {
    private String title;
    private String publishedAt;
    private String publisher;

    private List<String> departments;
    private String language;
    private String author;

    public Book() {
    }

    public Book(String title, String publishedAt, String publisher, List<String> departments, String language, String author) {
        this.title = title;
        this.publishedAt = publishedAt;
        this.publisher = publisher;
        this.departments = departments;
        this.language = language;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<String> getDepartments() {
        return departments;
    }

    public void setDepartment(List<String> departments) {
        this.departments = departments;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", publisher='" + publisher + '\'' +
                ", departments=" + departments +
                ", language='" + language + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
