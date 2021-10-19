/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Author;
import entity.Book;
import entity.History;
import entity.UserData;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class App {
    public void run(){
        System.out.println("Регистрация пользователся");
        UserData userData = new UserData();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Imja: ");
        userData.setFirstName(scanner.nextLine());
        System.out.printf("Familija: ");
        userData.setLastName(scanner.nextLine());
        System.out.printf("Nomer telefona: ");
        userData.setTelNumber(scanner.nextInt());
        System.out.printf("Bil zaregestrirovan polzovatel: %s %s %s %n",
                userData.getFirstName(),
                userData.getLastName(),
                userData.getTelNumber());
        
        System.out.println("Hello");
        Book book = new Book();
        book.setBookName("Voina i mir");
        book.setReleaseYear(1828);
        Author[] authors = new Author[1];
        Author author = new Author();
        author.setFirstName("Lev");
        author.setLastName("Tolstoy");
        author.setBirthYear(1828);
        authors[0] = author;
        book.setAuthors(authors);
        System.out.printf("Vibrana kniga: %s, avtor: %s %s, god izdanija: %d %n",
                book.getBookName(),
                book.getAuthors()[0].getFirstName(),
                book.getAuthors()[0].getLastName(),
                book.getReleaseYear()
                );
        History history = new History();
        history.setBook(book);
        history.setUserData(userData);
        Calendar c = new GregorianCalendar();
        history.setGivenBook(c.getTime());
        System.out.printf("Читатель %s взял читать книгу \"%s\", %s%n"
                ,history.getUserData().getFirstName()
                ,history.getBook().getBookName()
                ,history.getGivenBook()
        );
        c = new GregorianCalendar();
        history.setReturnBook(c.getTime());
        System.out.printf("Читатель %s %s вернул книгу \"%s\", %s%n"
                ,history.getUserData().getFirstName()
                ,history.getUserData().getLastName()
                ,history.getBook().getBookName()
                ,history.getReturnBook()
        );
        
    }
    
}
