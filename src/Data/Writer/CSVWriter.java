package Data.Writer;

import Data.Values;
import Model.SpaceMarine;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.jar.JarFile;

public class CSVWriter implements Writer{ // Класс записывания
    @Override
    public void write(LinkedHashSet<SpaceMarine> collection) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(Values.file));
            )  {
            objectOutputStream.writeObject(collection);
        }

        catch (IOException e) { // Ошибка ввода/вывода
            System.out.println(e.getMessage());
        }
    }
}
