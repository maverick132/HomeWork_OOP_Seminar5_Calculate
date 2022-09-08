package UI;

import Core.MVP.View;
import Core.Models.Num;


import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    }
    public double get(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }


    @Override
    public void print(Num data, String title) {
        System.out.printf("%s %s\n", title, data);

    }
    @Override
    public void set(String value) {
        System.out.println(value);
    }


}
