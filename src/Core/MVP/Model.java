package Core.MVP;

import Core.Models.Num;

public interface Model{
    Num result();

    void setX(double re, double im);
    void setX(double re);

    void setY(double re, double im);
    void setY(double re);
}
