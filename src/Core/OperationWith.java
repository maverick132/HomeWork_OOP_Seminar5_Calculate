package Core;

public enum OperationWith {
    Rational ("�������� � ������������� �������"),
    Complex ("�������� � ������������ �������");


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
