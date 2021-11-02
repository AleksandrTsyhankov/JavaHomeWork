package com.pb.tsygankov.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Приключения", "Иванов И.И.", 2000);
        books[1] = new Book("Словарь", "Сидоров А.В.", 1980);
        books[2] = new Book("Энциклопедия", "Гусев К.В.", 2010);

        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Петров", 1, "Исторический", "01.01.1980", "0671232233");
        readers[1] = new Reader("Иванов", 2, "Математический", "01.01.1990", "0633213322");
        readers[2] = new Reader("Сидоров", 3, "Экономический", "01.01.3000", "0501110022");

        System.out.println("Список всех книг: ");
        for (int i = 0; i < books.length; i++) {
            System.out.println(" Название: "+books[i].getTitle()+", Автор: "+books[i].getAuthor()+", Год: "+books[i].getYear());
        }

        System.out.println("Список всех читателей: ");
        for (int i = 0; i < readers.length; i++) {
            System.out.println(" ФИО: "+readers[i].getFio()+", Номер: "+readers[i].getReaderNumber()+", Факультет: "+readers[i].getFaculty()+", Дата рождения: "+readers[i].getDateOfBirth()+", Номер телефона: "+readers[i].getPhoneNumber());
        }

        String[] titles = new String[3];
        titles[0] = books[0].getTitle();
        titles[1] = books[1].getTitle();
        titles[2] = books[2].getTitle();

        readers[0].takeBooks(books.length);
        readers[0].returnBooks(books.length);

        readers[0].takeBooks(titles);
        readers[0].returnBooks(titles);

        readers[0].takeBooks(books);
        readers[0].returnBooks(books);








    }
}
