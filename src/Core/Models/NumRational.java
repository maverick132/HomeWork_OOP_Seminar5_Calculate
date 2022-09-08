package Core.Models;

public class NumRational extends Num{

    public NumRational(){

    }
    public NumRational(double re){
        this.setReal(re);
    }

    @Override
    public String toString(){
        return String.valueOf(this.getReal());
    }

}
