package Core.Models;

public class Num {
    private double real, imagine;

    public Num(){

    }
    public Num(double re){
        this.setReal(re);
    }

    public Num(double re, double im){
        this(re);
        this.setImagine(im);
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImagine() {
        return getReal();
    }

    public void setImagine(double imagine) {
        this.imagine = imagine;
    }
}
