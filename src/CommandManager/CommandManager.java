package CommandManager;

import CollectionManager.CollectionManager;
import CommandManager.Commands.*;

import static Model.JustScanner.Scan;

import java.io.File;
import java.util.HashMap;

public class CommandManager {  // Класс для управлением команд, которое не работают с самой коллекцией
    private final CollectionManager collectionManager;
    private final HashMap<String, CommandM> commandsM = new HashMap<>();

    public CommandManager() {
        this.collectionManager = new CollectionManager();
        commandsM.put("exit", new Exit());
        commandsM.put("help", new Help());
    }

    public String findCommand(String userLine) {
        if (userLine.isEmpty())
            return null;

        String[] values = userLine.trim().split(" ");
        String command = values[0];
        if (values.length == 1) {
            if (command.equals("exit") || command.equals("help")) {
                commandsM.get(command).execute();
                return null;
            } else if (command.equals("execute_script")) {
                System.out.print("Введите имя файла: ");

                String path = Scan();

                (new ExecuteScript()).execute(path);
                return null;
            }
        }

        return collectionManager.findCommand(userLine);


    }
}