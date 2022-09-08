package Core.MVP;

import Core.Models.NumComplex;
import Core.Models.NumRational;
import Core.Operation;
import Core.OperationWith;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Presenter {
    Model model;
    View view;
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
                    writer.append(String.format("%s ", value));
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
                listOp.add(fname.split(" "));
                fname = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sum(OperationWith op) {
        if (op.equals(OperationWith.Rational)) {
            double a = view.get("������� a:");
            double b = view.get("������� b:");
            model.setX(a);
            model.setY(b);
            NumRational result = new NumRational(model.result().getReal());
            view.print(result, "�����: ");
            listOp.add(new String[]
                    {
                            op.toString(),
                            Operation.Sum.toString(),
                            String.valueOf(a),
                            String.valueOf(b),
                            String.valueOf(result.getReal())});
        } else {
            double a = view.get("������� �������������� ����� ����� a:");
            double ai = view.get("������� ������ ����� ����� a:");
            double b = view.get("������� �������������� ����� ����� b:");
            double bi = view.get("������� ������ ����� ����� b:");
            model.setX(a, ai);
            model.setY(b, bi);
            NumComplex result = new NumComplex(model.result().getReal(), model.result().getImagine());
            view.print(result, "�����: ");
            listOp.add(new String[]
                    {
                            op.toString(),
                            Operation.Sum.toString(),
                            String.valueOf(a),
                            String.valueOf(ai),
                            String.valueOf(b),
                            String.valueOf(bi),
                            String.valueOf(result.getReal()),
                            String.valueOf(result.getImagine())});
        }
    }
}



