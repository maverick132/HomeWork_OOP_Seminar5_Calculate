package Core.MVP;


import Core.Models.Num;
import Core.Operation;
import Core.OperationWith;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Presenter {
    Model model;
    View view;
    Num result;
    List<String[]> listOp;

    public Presenter(View view, Model model) {
        this.model = model;
        this.view = view;
        this.listOp = new ArrayList<>();
    }

    public void saveLog(String path) {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (String[] strings : listOp) {
                for (String value : strings) {
                    writer.append(String.format("%s,", value));
                }
                writer.append("\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void loadLog(String path) {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String fname = reader.readLine();
            while (fname != null) {
                listOp.add(fname.split(","));
                fname = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void printLog(String path) {
        loadLog(path);
        for (String[] s :
                listOp) {
            for (String a :
                    s) {
                System.out.printf("%s ", a);
            }
            System.out.println();
        }
    }



    public void evolution(Operation operation) {
        System.out.println("¬ведите 1 дл€ работы с комплесными числами или 2 дл€ работы с рациональными:");
        OperationWith op = OperationWith.convert(view.get());
        if (op.equals(OperationWith.Rational)) {
            double a = view.get("¬ведите a:");
            double b = view.get("¬ведите b:");
            model.setX(a);
            model.setY(b);
            switch (operation) {
                case Sum -> {
                     result = new Num(model.sum(op).getReal());

                }
                case Divide -> {
                     result = new Num(model.div(op).getReal());

                }
                case Sub -> {
                     result = new Num(model.sub(op).getReal());

                }
                case Multi -> {
                     result = new Num(model.mult(op).getReal());

                }
            }
            view.print(result, (operation) + ": ");
            listOp.add(new String[]
                    {
                            op.toString(),
                            String.valueOf(a),
                            String.valueOf(b),
                            operation.toString(),
                            String.valueOf(result.getReal())});
        } else {
            double a = view.get("¬ведите действительную часть числа a:");
            double ai = view.get("¬ведите мнимую часть числа a:");
            double b = view.get("¬ведите действительную часть числа b:");
            double bi = view.get("¬ведите мнимую часть числа b:");
            model.setX(a, ai);
            model.setY(b, bi);
            switch (operation) {
                case Sum -> {
                    result = new Num(model.sum(op).getReal(), model.sum(op).getImagine());

                }
                case Divide -> {
                    result = new Num(model.div(op).getReal(), model.div(op).getImagine());

                }
                case Sub -> {
                    result = new Num(model.sub(op).getReal(), model.sub(op).getImagine());

                }
                case Multi -> {
                    result = new Num(model.mult(op).getReal(), model.mult(op).getImagine());

                }
            }
            view.print(result, (operation) + ": ");
            listOp.add(new String[]
                    {
                            op.toString(),
                            String.valueOf(new Num(a,ai)),
                            String.valueOf(new Num(b,bi)),
//                            String.valueOf(ai),
                            operation.toString(),
//                            String.valueOf(b),
//                            String.valueOf(bi),
                            String.valueOf(result)});
//                            String.valueOf(result.getReal()),
//                            String.valueOf(result.getImagine())});
        }
    }
}





