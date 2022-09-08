package UI;

import Core.MVP.Presenter;
import Core.Models.SubModel;
import Core.Models.SumModel;
import Core.Models.SumModelComplex;
import Core.OperationWith;

public class Main {
    public static void main(String[] args) {

//        new App().start();
//throws UnacceptableValueException

//        SumModelComplex n2 = new SumModelComplex();
//        SumModelComplex n3 = new SumModelComplex();
//        SumModelComplex n4 = new SumModelComplex();

        Presenter p = new Presenter(new ConsoleView(), new SumModel());


        p.sum(OperationWith.Rational);
        p.sum(OperationWith.Complex);


    }
}