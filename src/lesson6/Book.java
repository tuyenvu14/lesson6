package lesson6;

import java.util.Scanner;

public class Book {
    private String ID;
    private String nameOfBook;
    private String author;
    private String publisher;
    private String major;
    private int numberOfBook;
    Scanner sc = new Scanner(System.in);

    public Book() {
        super();
    }

    public Book(String ID, String nameOfBook, String author, String publisher, String major, int numberOfBook) {
        super();
        this.ID = ID;
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.publisher = publisher;
        this.major = major;
        this.numberOfBook = numberOfBook;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major ) {
        this.major = major;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int numberOfBook ) {
        this.numberOfBook = numberOfBook;
    }

    public void enterBook() {
        System.out.println("Enter the book ID : ");
        ID = sc.nextLine();
        System.out.println("Enter the name of the book : ");
        nameOfBook = sc.nextLine();
        System.out.println("Enter the name of the book author : ");
        author = sc.nextLine();
        System.out.println("Enter the name of the book publisher : ");
        publisher = sc.nextLine();
        System.out.println("Enter the name of the book major : ");
        major = sc.nextLine();
        System.out.println("Enter the page number of the book : ");
        numberOfBook = sc.nextInt();
    }

    public String soString() {
        return "ID : " + this.ID + "\nName of book : " + this.numberOfBook + "\nAuthor : " + this.author + "\nPublisher : " + this.publisher + "\nMajor : " + this.major + "\nNumber of page : " + this.numberOfBook;
    }
}
