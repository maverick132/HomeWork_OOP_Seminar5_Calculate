package Core.Models;

public class Num {
    /*
    ¬озможно надо помен€ть структуру. —делать все операции интерфейсами и два класса числа (рационал и коплекс)
    ј в моделе калькул€тора уже оперировать данными классами.
    */
    private double real, imagine;

    public Num(double re, double im){
        this.real = re;
        this.imagine = im;
    }
    public Num(double re){
        this(re,0);
    }
    public Num(Num num){
        this(num.getReal(),num.getImagine());
    }
    public Num(){
        this(0);
    }


    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImagine() {
        return this.imagine;
    }

    public void setImagine(double imagine) {
        this.imagine = imagine;
    }

    @Override
    public String toString(){
       if(this.imagine != 0) {
           if(this.imagine > 0) return String.format("%.3f + i%.3f", this.getReal(), this.getImagine());
           else return String.format("%.3f - i%.3f", this.getReal(), Math.abs(this.getImagine()));
       }
       else return String.format("%.3f", this.getReal());
    }
}
