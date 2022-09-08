package Core.Models;

import Core.MVP.Model;
import Core.OperationWith;

public class CalcModel implements Model {
    Num x,y,result;
    public CalcModel(){
        this.x = new Num();
        this.y = new Num();
        this.result = new Num();
    }


    @Override
    public Num sum(OperationWith op) {
        this.result.setReal(this.x.getReal() + this.y.getReal());
        if (op.equals(OperationWith.Complex)) this.result.setImagine(this.x.getImagine() + this.y.getImagine());
        return result;
    }

    @Override
    public Num sub(OperationWith op) {
        this.result.setReal(this.x.getReal() - this.y.getReal());
        if (op.equals(OperationWith.Complex)) this.result.setImagine(this.x.getImagine() - this.y.getImagine());
        return result;
    }

    @Override
    public Num div(OperationWith op) {
        if (op.equals(OperationWith.Complex)) {
            this.result.setReal((this.x.getReal()*this.y.getReal() + this.x.getImagine()* y.getImagine())
                    /(this.x.getReal()*this.x.getReal() + this.y.getImagine()*this.y.getImagine()));
            this.result.setImagine((this.x.getImagine()*this.y.getReal() - this.x.getReal()* y.getImagine())
                    /(this.x.getReal()*this.x.getReal() + this.y.getImagine()*this.y.getImagine()));
        }
        else {
            this.result.setReal(this.x.getReal()/this.y.getReal());
        }
        return result;
    }

    @Override
    public Num mult(OperationWith op) {
        if (op.equals(OperationWith.Complex)) {
            this.result.setReal(this.x.getReal() * this.y.getReal() - this.x.getImagine() * this.y.getImagine());
            this.result.setImagine(this.x.getReal() * this.y.getImagine() + this.x.getImagine() * this.y.getReal());
        }
        else {
            this.result.setReal(this.x.getReal()*this.y.getReal());
        }
        return result;
    }

    @Override
    public void setX(double re, double im) {
        this.x.setReal(re);
        this.x.setImagine(im);
    }

    @Override
    public void setX(double re) {
        this.x.setReal(re);
    }

    @Override
    public void setY(double re, double im) {
        this.y.setReal(re);
        this.y.setImagine(im);
    }

    @Override
    public void setY(double re) {
        this.y.setReal(re);
    }
}

