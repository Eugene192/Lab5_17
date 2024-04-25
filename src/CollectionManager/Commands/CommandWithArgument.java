package CollectionManager.Commands;

import Model.SpaceMarine;

import java.util.LinkedHashSet;

public interface CommandWithArgument {  // Интрефейс для команд которые принимают только аргумент
    public String execute(LinkedHashSet<SpaceMarine> collection, String argument);
}
