package Core;

public enum Operation {
    Sum ("��������"),
    Sub ("���������"),
    Divide ("�������"),
    Multi("���������");



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
