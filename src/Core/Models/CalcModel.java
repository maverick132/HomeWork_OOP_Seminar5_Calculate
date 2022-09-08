package Core.Models;

import Core.MVP.Model;

public abstract class CalcModel implements Model {
    Num x,y;
    public CalcModel(){
        this.x = new NumRational();
        this.y = new NumRational();
    }
}
