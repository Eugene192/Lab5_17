package CollectionManager.Commands;

import Model.SpaceMarine;

import java.util.LinkedHashSet;

public interface CommandWithArgAndObj { //Интерфейс который принимает аргумент и объект
    public String execute(LinkedHashSet<SpaceMarine> collection, String argument, SpaceMarine spaceMarine);
}
