package com.pb.tsygankov.hw5;

public class Reader {
    private String fio;
    private int readerNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fio, int readerNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fio = fio;
        this.readerNumber = readerNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getReaderNumber() {
        return readerNumber;
    }

    public void setReaderNumber(int readerNumber) {
        this.readerNumber = readerNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void takeBooks(int booksCount) {
        System.out.println(fio+" взял "+booksCount+" книгу(и).");
    }

    public void returnBooks(int booksCount) {
        System.out.println(fio+" вернул "+booksCount+" книгу(и).");
    }

    public void takeBooks(String[] titles) {
        String books = "";

        for (int i = 0; i < titles.length; i++) {
            books += titles[i]+", ";
        }
        books = books.substring(0, books.length()-2)+".";
        System.out.println(fio + " взял книгу(и): " + books);
    }

    public void returnBooks(String[] titles) {
        String books = "";

        for (int i = 0; i < titles.length; i++) {
            books += titles[i] +  ", ";
        }
        books = books.substring(0, books.length()-2)+".";
        System.out.println(fio + " вернул книгу(и): " + books);
    }

    public void takeBooks(Book[] books) {
        String booksInfo = "";

        for (int i = 0; i < books.length; i++) {
            booksInfo += books[i].getTitle() + " (" + books[i].getAuthor() + " " + books[i].getYear() + " г.), ";

        }
        booksInfo = booksInfo.substring(0, booksInfo.length()-2)+".";
        System.out.println(fio + " взял книгу(и): " + booksInfo);
    }

    public void returnBooks(Book[] books) {
        String booksInfo = "";

        for (int i = 0; i < books.length; i++) {
            booksInfo += books[i].getTitle() + " (" + books[i].getAuthor() + " " + books[i].getYear() + " г.), ";

        }
        booksInfo = booksInfo.substring(0, booksInfo.length()-2)+".";
        System.out.println(fio + " взял книгу(и): " + booksInfo);
    }
}
