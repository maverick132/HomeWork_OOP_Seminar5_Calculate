package UI;

import Core.MVP.View;
import Core.Models.NumComplex;
import Core.Models.NumRational;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in = new Scanner(System.in);

    public double get() {
        return in.nextDouble();
    }
    public double get(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    @Override
    public void print(NumRational data, String title) {
        System.out.printf("%s %s\n", title, data);

    }
    @Override
    public void print(NumComplex data, String title) {
        System.out.printf("%s %s\n", title, data);

    }

}
