package CollectionManager.Commands;

import Model.SpaceMarine;

import java.util.LinkedHashSet;

public interface CommandWithObjectArgument { // Интрефейс для команд которые принимают аргумент как объект
    public String execute(LinkedHashSet<SpaceMarine> collection, SpaceMarine spaceMarine);
}
