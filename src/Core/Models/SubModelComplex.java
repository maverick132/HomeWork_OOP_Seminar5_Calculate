package Core.Models;

public class SubModelComplex extends CalcModelComplex {
    NumComplex result;
    public SubModelComplex(){
        super();
        this.result = new NumComplex();
    }
    @Override
    public NumComplex result() {
        this.result.setReal(this.x.getReal() - this.y.getReal());
        this.result.setImagine(this.x.getImagine() -  this.y.getImagine());
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
