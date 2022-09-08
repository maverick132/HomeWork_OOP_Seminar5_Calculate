package Core.Models;

public class NumComplex extends NumRational{

    private double imagine;

    public NumComplex(){

    }
    public NumComplex(double re, double im){
        super(re);
        this.setImagine(im);
    }
    @Override
    public String toString(){
       return String.format("%.3f + i%.3f", this.getReal(), this.getImagine());
    }

    public double getImagine() {
        return imagine;
    }

    public void setImagine(double imagine) {
        this.imagine = imagine;
    }
}
