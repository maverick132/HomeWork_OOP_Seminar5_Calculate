package UI;

import Core.MVP.Model;
import Core.MVP.Presenter;
import Core.MVP.View;
import Core.Models.CalcModel;
import Core.Operation;

public class App {
    Presenter p;
    View ui;
    Model model;

    public App() {
    ui = new ConsoleView();
    model = new CalcModel();
    p = new Presenter(ui, model);
}

    public void start() {
        System.out.print("\033[H\033[J");
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - Сложение\n")
                .append("2 - Вычитание\n")
                .append("3 - Деление\n")
                .append("4 - Умножение\n")
                .append("5 - Сохранить лог операций\n")
                .append("6 - Вывести лог операций\n")
                .append("0 - exit\n");


        while (true) {
            System.out.print("\033[H\033[J");
            ui.set(sb.toString());
            switch (ui.get()) {
                case "1" -> p.evolution(Operation.Sum);
                case "2" -> p.evolution(Operation.Sub);
                case "3" -> p.evolution(Operation.Divide);
                case "4" -> p.evolution(Operation.Multi);
                case "5" -> p.saveLog(Config.pathLog);
                case "6" -> p.printLog(Config.pathLog);
                case "0" -> {
                    return;
                }
                default -> System.out.println("Такой команды нет");
            }
        }
    }
}


