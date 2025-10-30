import model.Author;
import model.Book;
import model.Content;
import model.Title;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        Book myBook = new Book();

        Scanner input = new Scanner(System.in);

        System.out.println("Вкажіть назву книги: ");
        String titleValue = input.nextLine();
        title.setValue(titleValue);
        myBook.setTitle(title);

        System.out.println("Вкажіть автора книги: ");
        String nameValue = input.nextLine();
        author.setName(nameValue);
        myBook.setAuthor(author);

        System.out.println("Вкажіть вміст книги: ");
        String contentValue = input.nextLine();
        content.setValue(contentValue);
        myBook.setContent(content);

        System.out.println();
        myBook.show();
    }
}