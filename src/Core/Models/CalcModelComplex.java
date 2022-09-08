package Core.Models;

import Core.MVP.Model;

public abstract class CalcModelComplex implements Model {
    Num x,y;
    public CalcModelComplex(){
        this.x = new NumComplex();
        this.y = new NumComplex();
    }
}
