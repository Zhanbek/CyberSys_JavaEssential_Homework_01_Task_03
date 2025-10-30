package model;

import java.util.concurrent.Flow;

public class Book {
    Title title;
    Author author;
    Content content;

    public void setTitle(Title title) {
        this.title = title;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setContent(Content content) {
        this.content = content;
    }

    public void show() {
        title.show();
        author.show();
        content.show();
    }
}
