package Core.MVP;

import Core.Models.NumComplex;
import Core.Models.NumRational;

import java.util.Scanner;

public interface View {
    double get();
    double get(String title);

    void print(NumComplex data, String title);

    void print(NumRational data, String title);
}
