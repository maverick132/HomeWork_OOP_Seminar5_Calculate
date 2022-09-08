package Core.Models;

public class DivModelComplex extends CalcModelComplex {
    NumComplex result;
    public DivModelComplex(){
        super();
        this.result = new NumComplex();
    }
    @Override
    public NumComplex result() {
        this.result.setReal((this.x.getReal()*this.y.getReal() + this.x.getImagine()* y.getImagine())
                /(this.x.getReal()*this.x.getReal() + this.y.getImagine()*this.y.getImagine()));
        this.result.setImagine((this.x.getImagine()*this.y.getReal() - this.x.getReal()* y.getImagine())
                /(this.x.getReal()*this.x.getReal() + this.y.getImagine()*this.y.getImagine()));
        return result;
    }

    @Override
    public void setX(double re, double im) {
        super.x.setReal(re);
        super.x.setImagine(im);
    }

    @Override
    public void setX(double re) {

    }

    @Override
    public void setY(double re, double im) {
        super.y.setReal(re);
        super.y.setImagine(im);
    }

    @Override
    public void setY(double re) {

    }
}