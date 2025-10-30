package model;

public class Content {
    String value;

    public void setValue(String value) {
        this.value = value;
    }

    public void show() {
        String message = String.format("Вміст: %s", value);
        System.out.println(message);
    }
}
