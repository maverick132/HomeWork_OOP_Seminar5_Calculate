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

    public static OperationWith convert(String value){
        switch (value){
            case "1" -> {
                return OperationWith.Complex;
            }
            case "2" -> {
                return OperationWith.Rational;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return title;
    }

}
