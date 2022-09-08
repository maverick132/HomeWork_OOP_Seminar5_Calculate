package Core.MVP;

import Core.Models.Num;
import Core.OperationWith;

public interface Model{
    Num sum(OperationWith op);
    Num sub(OperationWith op);
    Num div(OperationWith op);
    Num mult(OperationWith op);

    void setX(double re, double im);
    void setX(double re);

    void setY(double re, double im);
    void setY(double re);
}
