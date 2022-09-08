package Core;

public enum Operation {
    Sum ("Сложение"),
    Sub ("Вычитание"),
    Divide ("Деление"),
    Multi("Умножение");



    private String title;

    Operation(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }

}
