package Core.MVP;

import Core.Models.Num;

public interface View {
    String get();
    double get(String title);

    void print(Num data, String title);


    void set(String value);
}
