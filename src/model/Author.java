package model;

public class Author {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        String message = String.format("Автор: %s", name);
        System.out.println(message);
    }

}
