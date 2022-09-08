package Core;

public enum OperationWith {
    Rational ("Операция с рациональными числами"),
    Complex ("Операция с комплексными числами");


    private String title;

    OperationWith(String title) {
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
