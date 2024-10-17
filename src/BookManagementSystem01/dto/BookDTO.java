package BookManagementSystem01.dto;

import java.time.LocalDate;

public class BookDTO {
    private long ISBN;
    private String bookName;
    private String author;
    private String publisher;
    private int price;
    private LocalDate publicationDate;
    private int pages;

    public BookDTO(long ISBN, String bookName, String author, String publisher, int price, LocalDate publicationDate, int pages) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.publicationDate = publicationDate;
        this.pages = pages;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return  "ISBN:" + ISBN +
                "| 도서명:'" + bookName + '\'' +
                "| 저자명:'" + author + '\'' +
                "| 출판사:'" + publisher + '\'' +
                "| 가격:" + price +
                "| 발행일:" + publicationDate +
                "| 쪽수:" + pages;
    }
}
