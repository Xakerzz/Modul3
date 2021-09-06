package Tasks.BookStore;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    private String nameBook;
    private int priceBook;
    private int yearOfBook;
    private static int id = 5;
    private static int muchId;
    private static boolean isBookInArray;
    static Book[] bookArray = new Book[5];


    private Book(String nameBook, int priceBook, int yearOfBook) {
        this.nameBook = nameBook;
        this.priceBook = priceBook;
        this.yearOfBook = yearOfBook;
    }

    public static void main(String[] args) {
        bookArray[0] = new Book("War and Peace", 45, 1965);
        bookArray[1] = new Book("Great Vacation", 36, 1965);
        bookArray[2] = new Book("Math for school", 23, 1978);
        bookArray[3] = new Book("Old Mind", 58, 2008);
        bookArray[4] = new Book("New World's history", 95, 2021);
        while (true) {
            String userInPut = getInPut();
            if (userInPut.equals("stop")) {
                System.exit(0);
            }
            isBookInArray = isBookInArray(userInPut);
            if (isBookInArray) {
                System.out.println("Great, we have this book in the our store.");
                System.out.println("Try to search other book.");
                System.out.println();
            } else {
                if (userInPut.equals("all")){
                    printAllBooksArray();
                } else {
                    System.out.println("There is not book with this name or year is not found.");
                    System.out.println("Let to add new book");
                    System.out.println();
                    newBook();
                }
            }
        }
    }

    private static String getInPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of book or year came out");
        return scanner.nextLine();
    }

    private static boolean isBookInArray(String userInPut) {
        boolean inArray = false;
        for (int i = 0; i < bookArray.length; i++) {
            String book = bookArray[i].nameBook;
            String bookYear = Integer.toString(bookArray[i].yearOfBook);
            if (userInPut.equals(book) || userInPut.equals(bookYear)) {
                muchId = i;
                printByMuchId(muchId);
                inArray = true;
            }

        }
        return inArray;
    }

    private static void newBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of new book.");
        String nameOfBook = scanner.nextLine();
        System.out.println("Enter price of this book.");
        int priceOfBook = scanner.nextInt();
        System.out.println("Enter year of come out this book.");
        int yearOfBook = scanner.nextInt();
        bookArray = Arrays.copyOf(bookArray, id + 1);
        bookArray[id] = new Book(nameOfBook, priceOfBook, yearOfBook);
        System.out.println();
        System.out.println("You added new book, thank you!");
        printByMuchId(id);
        System.out.println("Try to search other book.");
        id++;
    }

    private static void printByMuchId(int muchId) {
        System.out.println( "The name of book: " + bookArray[muchId].nameBook + "   Price: " + bookArray[muchId].priceBook + " USD  " + " Year of come out- " + bookArray[muchId].yearOfBook + " year");
        System.out.println();
    }

    private static void printAllBooksArray (){
        for (int i = 0; i <bookArray.length ; i++) {
            printByMuchId(i);
        }
    }


}
