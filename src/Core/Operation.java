package Core;

public enum Operation {
    Sum ("Сумма"),
    Sub ("Разность"),
    Divide ("Частное"),
    Multi("Произведение");



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
