package com.xworkz.java.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class BookInfoDto {
    private String title;
    private String genre;
    private LocalDate publishedDate;
    private int pages;
    private double price;
    private List<AuthorDto> authors;

    public BookInfoDto(String title, String genre, LocalDate publishedDate, int pages, double price, List<AuthorDto> authors) {
        this.title = title;
        this.genre = genre;
        this.publishedDate = publishedDate;
        this.pages = pages;
        this.price = price;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<AuthorDto> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorDto> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "BookInfoDto{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", publishedDate=" + publishedDate +
                ", pages=" + pages +
                ", price=" + price +
                ", authors=" + authors +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            if(obj instanceof BookInfoDto)
            {
                BookInfoDto casting=(BookInfoDto) obj;
                return this.genre.equals(casting.genre);
            }
        }
        return false;
    }
}
