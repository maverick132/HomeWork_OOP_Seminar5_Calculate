package Core.Models;

public class MultiModel extends CalcModel {
    NumRational result;
    public MultiModel(){
        super();
        this.result = new NumRational();
    }
    @Override
    public NumRational result() {
        this.result.setReal(this.x.getReal() + this.y.getReal());
        return result;
    }

    @Override
    public void setX(double re, double im) {

    }

    @Override
    public void setX(double re) {
        super.x.setReal(re);
    }

    @Override
    public void setY(double re, double im) {

    }

    @Override
    public void setY(double re) {
        super.y.setReal(re);
    }
}
