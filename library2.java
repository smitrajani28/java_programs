import java.util.Scanner;

import javax.lang.model.element.Name;

class library{
    String[] Books;
    int no_of_Books;
    library(){
        this.Books = new String[100];
        this.no_of_Books = 0;
    }
    void addBook(String book) {
        this.Books[no_of_Books] = book;
        no_of_Books++;
        System.out.println(book + " has been added");
    }
    
    void issueBook(String book) {
        for (int i = 0; i < this.Books.length; i++) {
            
            if (this.Books[i].equals(book)) {
                System.out.println("the Book has been issued");                
                this.Books[i]=null;
                return;
            }
        }
        System.out.println("the book does not exist");
    }
    
    void returnBook(String book) {
        addBook(book);
    }
    void showAvailableBook() {
        System.out.println("Availabe Books are : ");
        for (String book : this.Books) {
            if (book == null) {
                continue;
            }
            System.out.println("=>" + book);
        }
    }
}
public class library2{

    public static void main(String[] args) {
        library lib1 = new library();
        while (true) {
            Scanner book = new Scanner(System.in);
            System.out.println("\t\tINDIAN LIBRARY\t\t");
            System.out.println("What you want to do ..?");
            System.out.println("1. Add Books");
            System.out.println("2. Issue Books");
            System.out.println("3. Return Books");
            System.out.println("4. Show available Books");
            byte choose = book.nextByte();
            switch (choose) {
                case 1: {
                    System.out.println("Book Name :");
                    String Name = book.next();
                    lib1.addBook(Name);
                    break;
                }
                case 2: {
                    System.out.println("Book Name :");
                    String Name = book.next();
                    lib1.issueBook(Name);
                    break;
                }
                case 3: {
                    System.out.println("Book Name :");
                    String Name = book.next();
                    lib1.returnBook(Name);
                    break;
                }
                case 4: {
                    lib1.showAvailableBook();
                    break;
                }
                default: {
                    System.out.println("invalid entry");
                    break;
                }
            }
        }
    }
}
