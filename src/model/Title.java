package model;

public class Title {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }
    public void show() {
        String message = String.format("Назва: %s", value);
        System.out.println(message);
    }

}
